### ForoHub

ForoHub es una plataforma de foro desarrollada con Spring Boot. Proporciona una solución robusta para la autenticación y autorización de usuarios, gestión de temas del foro, validación de datos y manejo de errores. Este proyecto es ideal para aquellos que buscan una implementación práctica y completa de una aplicación de foro segura y eficiente.

---

## Características Principales

- **Autenticación y Autorización:** Implementación de JWT para la seguridad de la aplicación.
- **Gestión de Temas:** Crear, actualizar, eliminar y detallar temas en el foro.
- **Persistencia de Datos:** Uso de Spring Data JPA y MySQL.
- **Validación de Datos:** Validación de integridad y datos duplicados.
- **Gestión de Errores:** Manejador global de errores personalizados.

## Requisitos

- Java 17
- Maven 3.6+
- MySQL

## Instalación

1. **Clonar el repositorio:**
   ```sh
   git clone https://github.com/angelaramiz/ForoHub.git
   cd ForoHub
   ```
2. **Configurar la base de datos:**
   Actualiza `application.properties` con tus credenciales de MySQL.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   ```
3. **Ejecutar la aplicación:**
   ```sh
   mvn spring-boot:run
   ```

## Uso

Una vez ejecutada, la aplicación estará disponible en `http://localhost:8080`.

### Endpoints Principales

#### Autenticación
- **Registro de Usuario:** `/api/auth/register`
- **Inicio de Sesión:** `/api/auth/login`

#### Gestión de Temas
- **Crear Tema:** `/api/topicos` [POST]
- **Actualizar Tema:** `/api/topicos/{id}` [PUT]
- **Eliminar Tema:** `/api/topicos/{id}` [DELETE]
- **Listar Temas:** `/api/topicos` [GET]
- **Detalle de Tema:** `/api/topicos/{id}` [GET]

## Dependencias

Las principales dependencias se encuentran en el archivo `pom.xml` e incluyen:

- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Spring Boot Starter Validation
- Spring Boot Starter Web
- Flyway
- MySQL Connector
- Lombok
- Java JWT

---
