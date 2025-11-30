package org.example.strategy;

import org.example.entities.Notificacion;
import org.example.dependencies.MetaApiConfig; // <--- Importas tu dependencia

public class Whatsapp implements Notificador {
    @Override
    public void notificar(Notificacion n) {
        // Usamos la dependencia simulada
        MetaApiConfig.conectar();

        System.out.println("✅ [WhatsApp] Mensaje enviado a " + n.getDestinatario() + ": " + n.getMensaje());
    }
}