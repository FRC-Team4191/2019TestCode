/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.arcadeDrive;

/**
 * Add your docs here.
 */
public class driveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  VictorSP fl = new VictorSP(RobotMap.FrontLeftMotor);
  VictorSP fr = new VictorSP(RobotMap.FrontRightMotor);
  VictorSP bl = new VictorSP(RobotMap.BackLeftMotor);
  VictorSP br = new VictorSP(RobotMap.BackRightMotor);

  SpeedControllerGroup left = new SpeedControllerGroup(fl, bl);
  SpeedControllerGroup right = new SpeedControllerGroup(fr, br);

  public DifferentialDrive drive = new DifferentialDrive(left, right);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new arcadeDrive());
  }

}
