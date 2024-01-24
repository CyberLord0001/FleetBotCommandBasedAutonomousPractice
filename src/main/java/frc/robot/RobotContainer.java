// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.Auto;
import frc.robot.commands.DriveWithController;
import frc.robot.subsystems.DriveTrain;

public class RobotContainer {
  private DriveTrain m_driveTrain = new DriveTrain();
  private CommandXboxController m_controller = new CommandXboxController(0);
  public RobotContainer() {
    m_driveTrain.setDefaultCommand(new DriveWithController(m_driveTrain, m_controller));
    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return new Auto(m_driveTrain);
  }
}
