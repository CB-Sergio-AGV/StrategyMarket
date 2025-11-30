package org.example.service;

import org.example.entities.Notificacion;
import org.example.strategy.*; // Importamos todas las estrategias
import java.util.*;

// Enumeración simple para los eventos
enum TipoEvento { PROMOCION, STOCK_MINIMO, MANTENIMIENTO }

public class NotificacionContexto {
    // EL TRUCO: Un mapa que guarda LISTAS de notificadores
    private Map<TipoEvento, List<Notificador>> reglas = new HashMap<>();

    public NotificacionContexto() {
        configurarReglas();
    }

    private void configurarReglas() {
        // Regla 1: Promoción -> WhatsApp + Email
        reglas.put(TipoEvento.PROMOCION, Arrays.asList(new Whatsapp(), new Email()));

        // Regla 2: Stock Mínimo -> Solo Push
        reglas.put(TipoEvento.STOCK_MINIMO, Arrays.asList(new PushNotification()));

        // Regla 3: Mantenimiento -> Email + Push
        reglas.put(TipoEvento.MANTENIMIENTO, Arrays.asList(new Email(), new PushNotification()));
    }

    public void procesarEvento(String eventoStr, Notificacion n) {
        try {
            // Convertimos el texto a TipoEvento
            TipoEvento evento = TipoEvento.valueOf(eventoStr.toUpperCase());
            List<Notificador> canales = reglas.get(evento);

            if (canales != null) {
                System.out.println("\n--- Procesando evento: " + evento + " ---");
                for (Notificador canal : canales) {
                    canal.notificar(n);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Evento no reconocido: " + eventoStr);
        }
    }
}