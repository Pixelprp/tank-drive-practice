// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Drivetrain extends SubsystemBase {
  public static WPI_TalonSRX motor1;
  public static WPI_TalonSRX motor2;

  public Drivetrain() {
    // motor ids
    motor1 = new WPI_TalonSRX(7); 
    motor2 = new WPI_TalonSRX(4);

    motor1.setInverted(true);
    motor2.setInverted(false);
    
  }

  public static void drive() {
    motor1.set(RobotContainer.joystick.getY()*0.35); // this sets motor to specific speed from joystick
    motor2.set(RobotContainer.joystick.getY()*0.35); 
  
  }

  public void stop() {
    motor1.set(0);
    motor2.set(0);

  }








}
