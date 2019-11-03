package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class elevatorStabilizer extends Command {
  public elevatorStabilizer() {
    requires(Robot.Elevator);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.Elevator.estabilize();
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
