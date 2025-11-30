package org.example;

import org.example.entities.Notificacion;
import org.example.service.NotificacionContexto;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el Motor (Contexto)
        NotificacionContexto motor = new NotificacionContexto();

        // 2. Probamos una PROMOCION (Debería salir WhatsApp y Email)
        Notificacion noti1 = new Notificacion("Bodega Juan", "¡Coca Cola 2x1!");
        motor.procesarEvento("PROMOCION", noti1);

        // 3. Probamos STOCK MINIMO (Debería salir solo Push)
        Notificacion noti2 = new Notificacion("Bodega Juan", "ALERTA: Queda 1 saco de arroz");
        motor.procesarEvento("STOCK_MINIMO", noti2);
    }
}