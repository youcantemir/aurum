# Architecture

```
            Main
              │
              ▼
     AlarmController
              │
              ▼
       AlarmService
      ┌──────┼──────────┐
      ▼      ▼          ▼
Notification EventLog EventGenerator
      │
      ▼
 ConsolePrinter
```

## Components

### AlarmController

Receives requests and starts event simulation.

### AlarmService

Processes alarm events and coordinates services.

### NotificationService

Emulates sending notifications.

### EventLogService

Stores event history in memory.

### EventGenerator

Creates random security events.

### ConsolePrinter

Formats output for the console.
