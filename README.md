# SecureCraft - AntiCheat Plugin for Minecraft

**SecureCraft** is a powerful and efficient anti-cheat plugin for Minecraft servers, designed to detect and block various cheats and bots in the game. It is made for Minecraft 1.8.8, and provides a customizable set of cheat detection mechanisms including bot detection, movement validation, and the detection of popular cheats using a list from `logsoft.txt`.

## Features
- **Bot Detection**: Detects players exhibiting bot-like behavior based on movement patterns.
- **Cheat Detection**: Uses a list of popular cheats stored in `logsoft.txt` to identify players using hacks like FlyHack, SpeedHack, XRay, AutoClicker, and more.
- **Violation Logging**: Logs detected violations in the `logs/violations.log` file.
- **Configurable**: Customize the behavior of the anti-cheat via the `config.yml` file.
- **No Database Required**: The plugin operates without any database, storing logs and configuration on the server.

## Installation
1. Download the latest version of the plugin.
2. Place the `.jar` file in the `plugins` directory of your Minecraft server.
3. Modify the `config.yml` and `logsoft.txt` files as needed.
4. Restart the server to load the plugin.

## Configuration
- **`config.yml`**: Configure the plugin's settings, such as enabling/disabling certain cheat detections and adjusting detection thresholds.
- **`logsoft.txt`**: List the names of popular cheats you want the plugin to detect.

## Usage
The plugin automatically detects and kicks players who are suspected of using cheats based on the configured settings. Violations are logged in the `logs/violations.log` file.

## License
This plugin is released under the [MIT License](LICENSE).

## Contributions
Contributions are welcome! Please submit a pull request or create an issue for any suggestions or improvements.
