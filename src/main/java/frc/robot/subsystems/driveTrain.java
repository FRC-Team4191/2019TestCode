package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.arcadeDrive;

public class driveTrain extends Subsystem {

  VictorSP fl = new VictorSP(RobotMap.FrontLeftMotor);
  VictorSP fr = new VictorSP(RobotMap.FrontRightMotor);
  VictorSP bl = new VictorSP(RobotMap.BackLeftMotor);
  VictorSP br = new VictorSP(RobotMap.BackRightMotor);

  SpeedControllerGroup left = new SpeedControllerGroup(fl, bl);
  SpeedControllerGroup right = new SpeedControllerGroup(fr, br);

  public DifferentialDrive drive = new DifferentialDrive(left, right);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new arcadeDrive());
  }

}
