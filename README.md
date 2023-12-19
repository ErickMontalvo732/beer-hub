# Microservices App

Este proyecto consiste en una aplicación de microservicios que incluye un backend y un frontend, conectados a través de Docker y orquestados por Nginx.

## Estructura del Proyecto

- **FrontEnd:** Carpeta que contiene la aplicación Angular.
- **Backend:** Carpeta que contiene el servicio backend construido con Spring Boot.
- **docker-compose.yml:** Archivo de Docker Compose para orquestar los servicios.

## Configuración

### Backend
- **Spring Boot:** 3.2.0
- **Base de Datos:** PostgreSQL
  - Nombre de la Base de Datos: `BeerDB`
  - Usuario: `.env`
  - Contraseña: `.env`

### Frontend
- **Angular:**
  - Versión: [Angular CLI 16.1.8](https://angular.io/cli)
  - Dependencias: Bootstrap y otras (ver `package.json`)

## Instrucciones de Uso

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/ErickMontalvo732/beer-hub.git
   
## Instalaciones necesarias

1. **Maven**
   - Version: `Apache Maven 3.9.4`
2. **Java**
   - Version: `Java version: 17.0.8`
3. **Spring Tool Suite 4**
    - Pueden usar el IDE de su preferencia
4. **Docker**
    - https://docs.docker.com/desktop/install/windows-install/

## Más Documentacion y Funcionamiento  

   https://docs.google.com/document/d/1PuNxNN2UzeJeA7-kcxHmBqnW7xPMkgYp7WQwcsii37c/edit?usp=sharing
