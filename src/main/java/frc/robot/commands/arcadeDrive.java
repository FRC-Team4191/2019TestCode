package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class arcadeDrive extends Command {
  public arcadeDrive() {
    requires(Robot.DriveTrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    double speed = Robot.m_oi.GetJoystickRawAxis(RobotMap.LeftY);
    double rotation = Robot.m_oi.GetJoystickRawAxis(RobotMap.RightX);

    Robot.DriveTrain.drive.arcadeDrive(speed, rotation);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.DriveTrain.drive.arcadeDrive(0, 0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
