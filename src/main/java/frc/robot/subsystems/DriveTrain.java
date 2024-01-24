// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  private Talon m_left = new Talon(0);
  private Talon m_right = new Talon(1);
  private DifferentialDrive m_differentialDrive = new DifferentialDrive(m_left, m_right);
  public DriveTrain() {
    m_right.setInverted(true);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void drive(double forwardsSpeed, double turningSpeed){
    m_differentialDrive.arcadeDrive(forwardsSpeed, turningSpeed);
  }
  public void stop(){
    m_differentialDrive.arcadeDrive(0, 0);
  }
}
