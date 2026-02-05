esta aplicacion es un gestor de libros el cual contendra una bd para que el publico que utilice esta app movil pueda saber que libros tenemos disponibles en fisicos y asi poder adquirir el libro (rentado) disponible, si el libro no esta disponible entonces al momento de adquirirlo te marcara "libro no disponible" como al momento de rentarlo se desabilitara la opcion de "rentar" con el proposito de poder 

ESTRUCTURA DE PROYECTO

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
│       ├── domain/              # Lógica de negocio (Independiente de la UI)
│       │   ├── model/           # Modelos de dominio
│       │   ├── repository/      # Interfaces del Repositorio
│       │   └── usecase/         # Casos de uso específicos
│       │
│       └── presentation/        # Interfaz de Usuario (UI)
│           ├── login/           # Screen, ViewModel y State de Login
│           └── register/        # Screen, ViewModel y State de Registro
│
└── MainActivity.kt              # Punto de entrada y navegación principal
