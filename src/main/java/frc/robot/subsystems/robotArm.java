package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.armStabilizer;

public class robotArm extends Subsystem {

  WPI_TalonSRX kol = new WPI_TalonSRX(4);

  public void kolkaldirici(){
    kol.set(-0.4);
  }

  public void kolindirici(){
    kol.set(0.1);
  }

  public void koldusurucu(){
    kol.set(-0.1);
  }

  public void koldurdurucu(){
    kol.set(0);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new armStabilizer());
  }
}