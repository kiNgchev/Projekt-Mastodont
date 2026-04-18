# Projekt-Mastodont

A Kotlin multi-module project containing several subprojects for different functionalities.

## Project Structure

The project consists of the following main modules:

1. **bots-shared** - Shared functionality for bots
2. **nivora** - Discord bot module
3. **serafim** - Twitch bot module
4. **zentra** - Telegram bot module

## Build Configuration

The project uses Gradle as the build system with Kotlin DSL for configuration.

## Getting Started

### Prerequisites
- Kotlin 1.8+
- Gradle 9.0+

### Building the Project

To build the project, use the Gradle wrapper:

```bash
./gradlew build
```

### Running the Project

Each module can be run independently using:

```bash
./gradlew :<module-name>:run
```

Replace `<module-name>` with the name of the module you want to run (e.g., `nivora`, `serafim`, or `zentra`).

## Contributing

Contributions are welcome! Please follow the project's coding conventions and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the LICENSE file for details.