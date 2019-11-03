package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ballThrower extends Command {
  public ballThrower() {
    requires(Robot.BallIntake);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.BallIntake.topfirlat();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.BallIntake.topdur();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
