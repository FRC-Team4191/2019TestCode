/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.armStabilizer;

/**
 * Add your docs here.
 */
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
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
  setDefaultCommand(new armStabilizer());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}