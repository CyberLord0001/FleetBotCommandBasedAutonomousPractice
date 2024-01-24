// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;

public class Auto extends SequentialCommandGroup {
  /** Creates a new Auto. */
  public Auto(DriveTrain driveTrain) {
    addCommands(
      new Drive(driveTrain, -0.65, 0).withTimeout(2)
    );
  }
}
