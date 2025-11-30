package org.example.dependencies;

public class SmtpServerConfig {
    private String host;
    private int port;

    public SmtpServerConfig() {
        this.host = "smtp.gmail.com";
        this.port = 587;
    }

    public void iniciarSesion() {
        System.out.println("   [Sistema] Conectando al servidor de correo (" + host + ":" + port + ")...");
        System.out.println("   [Sistema] Autenticación SMTP exitosa.");
    }
}