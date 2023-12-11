# Microservices App

Este proyecto consiste en una aplicación de microservicios que incluye un backend y un frontend, conectados a través de Docker y orquestados por Nginx.

## Estructura del Proyecto

- **FrontEnd:** Carpeta que contiene la aplicación Angular.
- **Backend:** Carpeta que contiene el servicio backend construido con Spring Boot.
- **docker-compose.yml:** Archivo de Docker Compose para orquestar los servicios.

## Configuración

### Backend
- **Base de Datos:** PostgreSQL
  - Nombre de la Base de Datos: `BeerDB`
  - Usuario: `postgres`
  - Contraseña: `postgres@password`

### Frontend
- **Angular:**
  - Versión: [Angular CLI 16.1.8](https://angular.io/cli)
  - Dependencias: Bootstrap y otras (ver `package.json`)

## Instrucciones de Uso

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/microservices-app.git
   cd microservices-app
