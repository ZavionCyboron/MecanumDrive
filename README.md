# MecanumDrive

Kotlin WPILib project for an **FRC mecanum drivetrain**, including odometry, telemetry,
and system identification tooling.

## Overview
This repo is designed for mecanum drivetrain testing and iteration. It provides:
- mecanum drive control
- odometry tracking
- telemetry via NetworkTables/SmartDashboard
- optional SysId routines for characterization

## Key Features
- Kotlin + WPILib structure
- `MecanumDrive` control
- Odometry (`MecanumDriveOdometry`)
- Telemetry to NetworkTables (`DriveData` table)
- SmartDashboard widgets (PID controllers + IMU)
- SysId support for drivetrain characterization

## Controls (Xbox Controller)
_(From your RobotContainer mapping used across projects)_
- Left stick: translation (X/Y)
- Right stick X: rotation
- Triggers: launcher control (if launcher is included in this repo)

## Telemetry & Monitoring
Telemetry is published to NetworkTables under the table:

### `DriveData`
- `Front Left Velocity`, `Front Right Velocity`, `Rear Left Velocity`, `Rear Right Velocity`
- `Front Left Voltage`, `Front Right Voltage`, `Rear Left Voltage`, `Rear Right Voltage` :contentReference[oaicite:8]{index=8}

These entries are updated in `periodic()` for live monitoring and debugging. :contentReference[oaicite:9]{index=9}

SmartDashboard also publishes:
- PID controller widgets
- IMU widget :contentReference[oaicite:10]{index=10}

## Odometry
Odometry is updated periodically using IMU angle + wheel positions. :contentReference[oaicite:11]{index=11}  
The drivetrain pose can be reset with `resetPose(pose)`. :contentReference[oaicite:12]{index=12}

## SysId (Characterization)
A SysId routine is included to log applied voltage, position, and velocity for each motor. :contentReference[oaicite:13]{index=13}

## Hardware
- IMU: ADIS16470 :contentReference[oaicite:14]{index=14}
- Motors: SparkMax brushless (CAN IDs 1–4 in this subsystem code) :contentReference[oaicite:15]{index=15}

## Credits
Early College High School Robotics / Hangar 84  
Built with WPILib and REV SparkMax libraries.# MecanumDrive

Kotlin WPILib project for an **FRC mecanum drivetrain**, including odometry, telemetry,
and system identification tooling.

## Overview
This repo is designed for mecanum drivetrain testing and iteration. It provides:
- mecanum drive control
- odometry tracking
- telemetry via NetworkTables/SmartDashboard
- optional SysId routines for characterization

## Key Features
- Kotlin + WPILib structure
- `MecanumDrive` control
- Odometry (`MecanumDriveOdometry`)
- Telemetry to NetworkTables (`DriveData` table)
- SmartDashboard widgets (PID controllers + IMU)
- SysId support for drivetrain characterization

## Controls (Xbox Controller)
_(From your RobotContainer mapping used across projects)_
- Left stick: translation (X/Y)
- Right stick X: rotation
- Triggers: launcher control (if launcher is included in this repo)

## Telemetry & Monitoring
Telemetry is published to NetworkTables under the table:

### `DriveData`
- `Front Left Velocity`, `Front Right Velocity`, `Rear Left Velocity`, `Rear Right Velocity`
- `Front Left Voltage`, `Front Right Voltage`, `Rear Left Voltage`, `Rear Right Voltage` :contentReference[oaicite:8]{index=8}

These entries are updated in `periodic()` for live monitoring and debugging. :contentReference[oaicite:9]{index=9}

SmartDashboard also publishes:
- PID controller widgets
- IMU widget :contentReference[oaicite:10]{index=10}

## Odometry
Odometry is updated periodically using IMU angle + wheel positions. :contentReference[oaicite:11]{index=11}  
The drivetrain pose can be reset with `resetPose(pose)`. :contentReference[oaicite:12]{index=12}

## SysId (Characterization)
A SysId routine is included to log applied voltage, position, and velocity for each motor. :contentReference[oaicite:13]{index=13}

## Hardware
- IMU: ADIS16470 :contentReference[oaicite:14]{index=14}
- Motors: SparkMax brushless (CAN IDs 1–4 in this subsystem code) :contentReference[oaicite:15]{index=15}

## Credits
Early College High School Robotics / Hangar 84  
Built with WPILib and REV SparkMax libraries.
