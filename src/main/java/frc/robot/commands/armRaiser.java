package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class armRaiser extends Command {
  public armRaiser() {
    requires(Robot.RobotArm);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.RobotArm.kolkaldirici();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.RobotArm.koldurdurucu();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
