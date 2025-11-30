package org.example.dependencies;

public class MetaApiConfig {
    // Simulamos una clave de API
    private static final String API_KEY = "WTSP_KEY_12345_SECRET";

    public static boolean conectar() {
        System.out.println("   [Sistema] Verificando credenciales con Meta Business API...");
        System.out.println("   [Sistema] Conexión establecida usando Key: " + API_KEY);
        return true;
    }
}