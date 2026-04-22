# Sabinha

A friendly and configurable Minecraft plugin built with Paper.
Sabinha delivers contextual messages to players with a simple command system, now supporting multiple categories and languages.

---

## Features

- Command-based interaction (`/sabinha`)
- Subcommands:
  - `/sabinha` → default message
  - `/sabinha inspire` → motivational messages
  - `/sabinha calm` → calming messages
  - `/sabinha reload` → reload configuration
- Configurable messages via `config.yml`
- Multi-language support (Portuguese and English)
- Lightweight and server-friendly

---

## Requirements

- Java 17 or higher
- Paper server (tested on 1.21.1)

---

## Installation

1. Download or build the plugin:
```bash
mvn package
```
2. Locate the generated file:
```bash
target/sabinha-2.0.0.jar
```
3. Place it in your server:
/plugins/
4. Start or restart your server

---

## Configuration

After first run, the config file will be created at:

plugins/Sabinha/config.yml

Example:

language: "pt"

prefix:
  pt: "[Sabinha] "
  en: "[Sabinha] "

messages:
  - pt:
    default:
      - "Sabinha diz: você está indo muito bem."
  - en:
    default:
      - "Sabinha says: you are doing very well."
    
You can edit messages freely and reload in-game:
/sabinha reload

---

| Command            | Description                    |
| ------------------ | ------------------------------ |
| `/sabinha`         | Sends a default message        |
| `/sabinha inspire` | Sends an inspirational message |
| `/sabinha calm`    | Sends a calming message        |
| `/sabinha reload`  | Reloads the configuration      |

---

## Project Structure
```
src/
├── main/
│ ├── java/com/ellie/sabinha/
│ │ ├── Sabinha.java
│ │ └── SabinhaCommand.java
│ └── resources/
│ ├── plugin.yml
│ └── config.yml
```
 ---

## Roadmap
Permissions system (e.g. sabinha.reload)
Tab completion
Player-specific language
GUI interaction
Discord integration

---

# Build
```bash
mvn clean package
```

---

## Author

Ellie

---

## License

This project is open for learning and personal use.
