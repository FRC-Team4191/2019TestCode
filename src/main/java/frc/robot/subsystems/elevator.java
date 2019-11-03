package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.elevatorStabilizer;


public class elevator extends Subsystem {

  WPI_TalonSRX cim1 = new WPI_TalonSRX(2);
  WPI_TalonSRX cim2 = new WPI_TalonSRX(3);


  public void eup(){
    cim1.set(-0.8);
    cim2.set(-0.8);
  }

  public void edown(){
    cim1.set(0.3);
    cim2.set(0.3);
  }

  public void estop(){
    cim1.set(0);
    cim2.set(0);
  }

  public void estabilize(){
    cim1.set(-0.1);
    cim2.set(-0.1);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new elevatorStabilizer());
  }
}
