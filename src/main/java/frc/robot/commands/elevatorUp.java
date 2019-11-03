package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class elevatorUp extends Command {
  public elevatorUp() {
    requires(Robot.Elevator);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.Elevator.eup();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.Elevator.estop();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
