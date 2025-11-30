package org.example.strategy;

import org.example.entities.Notificacion;
import org.example.dependencies.SmtpServerConfig; // <--- Importas tu dependencia

public class Email implements Notificador {
    @Override
    public void notificar(Notificacion n) {
        // Instanciamos y usamos la configuración simulada
        SmtpServerConfig smtp = new SmtpServerConfig();
        smtp.iniciarSesion();

        System.out.println("📧 [Email] Correo enviado a " + n.getDestinatario());
        System.out.println("      Contenido: " + n.getMensaje());
    }
}