/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static int FrontLeftMotor = 1;
  public static int FrontRightMotor = 2;
  public static int BackLeftMotor = 3;
  public static int BackRightMotor = 4;

  public static int LeftX = 0;
  public static int LeftY = 1;
  public static int RightX = 3;
  public static int RightY = 4;

  public static int topat = 1;
  public static int topal = 3;
  public static int kolkaldir = 6;
  public static int kolindir = 5;
  public static int asansorkaldir = 5;
  public static int asansorindir = 6;
  public static int ledac = 9;
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
