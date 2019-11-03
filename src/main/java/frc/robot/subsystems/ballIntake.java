package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ballIntake extends Subsystem {
  
  WPI_TalonSRX topkolu = new WPI_TalonSRX(1);
  
  public void topfirlat(){
    topkolu.set(1);
  }

  public void topal(){
    topkolu.set(-1);
  }

  public void topdur(){
    topkolu.set(0);
  }

  @Override
  public void initDefaultCommand() {
  }
}
