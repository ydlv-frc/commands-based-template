// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  private final CommandFactory commandFactory;
  private final AutonomousController autonomousController;

  private final XboxController driver, operator;

  // add subsystems here

  public RobotContainer() {
    driver = new XboxController(0);
    operator = new XboxController(1);

    // initialize subsystems

    commandFactory = new CommandFactory();
    autonomousController = new AutonomousController(commandFactory);

    setDefaultCommands();
    bindOperatorCommands();
    bindDriverCommands();
  }

  private void setDefaultCommands() {
    // subsystem.setDefaultCommand(commandFactory.yourCommandHere());
  }

  private void bindDriverCommands() {
    // xboxButton(driver, Button.kA).toggleOnTrue(commandFactory.yourCommandHere());
    // Also useful: whileTrue
  }

  private void bindOperatorCommands() {
    // xboxButton(operator, Button.kA).whileTrue(commandFactory.yourCommandHere());
    // also useful: whileTrue
  }

  public void startAutonomous() {
    autonomousController.startAutonomous();
  }

  public void stopAutonomous() {
    autonomousController.stopAutonomous();
  }

  private static JoystickButton xboxButton(XboxController controller, Button button) {
    return new JoystickButton(controller, button.value);
  }
}
