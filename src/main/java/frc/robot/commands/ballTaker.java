package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ballTaker extends Command {
  int kol;
  public ballTaker() {
    requires(Robot.BallIntake);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.BallIntake.topal();
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
