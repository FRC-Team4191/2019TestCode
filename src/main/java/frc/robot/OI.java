/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.armLower;
import frc.robot.commands.armRaiser;
import frc.robot.commands.ballTaker;
import frc.robot.commands.ballThrower;
import frc.robot.commands.elevatorDown;
import frc.robot.commands.elevatorUp;
import frc.robot.commands.ledController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
  Joystick joystick0 = new Joystick(0);
  Joystick joystick1 = new Joystick(1);

  JoystickButton topat = new JoystickButton(joystick1,RobotMap.topat);
  JoystickButton topal = new JoystickButton(joystick1,RobotMap.topal);
  JoystickButton kolkaldir = new JoystickButton(joystick1,RobotMap.kolkaldir);
  JoystickButton kolindir = new JoystickButton(joystick1,RobotMap.kolindir);
  JoystickButton asansorkaldir = new JoystickButton(joystick0,RobotMap.asansorkaldir);
  JoystickButton asansorindir = new JoystickButton(joystick0,RobotMap.asansorindir);
  JoystickButton ledac = new JoystickButton(joystick1,RobotMap.ledac);

  public double GetJoystickRawAxis(int axis){
   return joystick0.getRawAxis(axis);
  }

  public OI() {
  topat.whileHeld(new ballThrower());
  topal.whileHeld(new ballTaker());
  kolindir.whileHeld(new armLower());
  kolkaldir.whileHeld(new armRaiser());
  asansorindir.whileHeld(new elevatorDown());
  asansorkaldir.whileHeld(new elevatorUp());
  ledac.whenPressed(new ledController());
  }


  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
