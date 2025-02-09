// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainRight extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  TalonFX front = new TalonFX(0);
  TalonFX back = new TalonFX(0);
  
  public DriveTrainRight() {}

  public void setmotor(double PercentOutput){
    front.set(ControlMode.PercentOutput, PercentOutput);
    back.set(ControlMode.PercentOutput, PercentOutput);
  }
 // front.set(ControlMode.PercentOutput, output);
  //back.set(ControlMode.PercentOutput, output);
 





  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }



  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
