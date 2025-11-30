package org.example.strategy;

import org.example.entities.Notificacion;

public class PushNotification implements Notificador {
    @Override
    public void notificar(Notificacion n) {
        conectarFirebase();
        System.out.println("📲 [Push] Alerta en App de " + n.getDestinatario() + ": " + n.getMensaje());
    }

    private void conectarFirebase() {
        System.out.println("   -> Conectando con Firebase Gateway...");
    }
}