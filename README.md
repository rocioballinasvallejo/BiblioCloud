Esta aplicación es un gestor de libros el cual contendrá una BD para que el público que utilice esta app móvil pueda saber qué libros tenemos disponibles en físico y así poder adquirir el libro (rentado) disponible. Si el libro no está disponible, entonces al momento de adquirirlo te marcará "libro no disponible", y al momento de rentarlo se deshabilitará la opción de "rentar" con el propósito de poder llevar un control.

### ESTRUCTURA DE PROYECTO

```text
app/src/main/java/com/example/bibliocloud/
├── core/                        # Configuración global y utilidades
│   ├── di/                      # Inyección de dependencias
│   ├── network/                 # Configuración de Retrofit y ApiService
│   └── theme/                   # Estilos, Colores y Tipografía (UI)
│
├── features/                    # Módulos de la aplicación
│   └── auth/                    # Módulo de Autenticación (Login/Registro)
│       ├── data/                # Implementación de datos
│       │   ├── remote/          # DTOs (Data Transfer Objects) de la API
│       │   └── repository/      # Implementación del Repositorio
│       │
│       ├── domain/              # Lógica de negocio
│       │   ├── model/           # Modelos de dominio
│       │   ├── repository/      # Interfaces del Repositorio
│       │   └── usecase/         # Casos de uso específicos
│       │
│       └── presentation/        # Interfaz de Usuario (UI)
│           ├── login/           # Screen, ViewModel y State de Login
│           └── register/        # Screen, ViewModel y State de Registro
│
└── MainActivity.kt              # Punto de entrada y navegación principal
