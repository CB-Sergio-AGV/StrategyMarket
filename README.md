# StrategyMarket - Motor de Notificaciones (Patrón Strategy)

Este proyecto implementa un **Motor de Notificaciones Escalable** para la plataforma de e-commerce **CasaMarket**. Su objetivo es gestionar el envío de mensajes a bodegueros a través de múltiples canales (WhatsApp, Email, Push) de manera flexible y dinámica.

El diseño se basa en el **Patrón de Diseño Strategy**, cumpliendo con los principios SOLID (específicamente Open/Closed) para permitir la fácil integración de nuevos canales sin modificar la lógica existente.

---

## Características Principales

- **Arquitectura Limpia:** Separación de responsabilidades en paquetes (`strategy`, `service`, `entities`, `dependencies`).
- **Patrón Strategy:** Uso de interfaces y polimorfismo para intercambiar algoritmos de envío en tiempo de ejecución.
- **Canales Combinados (PLUS):** Capacidad de enviar notificaciones por múltiples canales simultáneamente según el tipo de evento (ej. Promoción -> WhatsApp + Email), sin usar bloques `if/else` complejos.
- **Dependencias Simuladas:** Implementación de "Mock Services" para simular conexiones a APIs externas (Meta, SMTP, Firebase) de forma segura.

---

## Tecnologías Utilizadas

- **Lenguaje:** Java 21 (Oracle OpenJDK 21.0.5)
- **IDE Recomendado:** IntelliJ IDEA
- **Herramientas:** Git / GitHub

---

## Estructura del Proyecto

El código está organizado siguiendo buenas prácticas de ingeniería de software:

```text
src/main/java/org/example/
├── dependencies/    # Simulaciones de servicios externos (API Meta, SMTP)
├── entities/        # Modelos de datos (Notificacion)
├── service/         # Lógica de negocio y Contexto (NotificationEngine)
├── strategy/        # Implementación del Patrón Strategy (Interfaz y Clases Concretas)
└── Main.java        # Punto de entrada para pruebas
