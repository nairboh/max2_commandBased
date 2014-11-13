
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.Fire;
import edu.wpi.first.wpilibj.templates.commands.Index;
import edu.wpi.first.wpilibj.templates.commands.TurnOffLauncherMotor;
import edu.wpi.first.wpilibj.templates.commands.TurnOnLauncherMotor;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick xbox1 = new Joystick(1);
    Joystick xbox2 = new Joystick(2);
    Button xbox1_A = new JoystickButton(xbox1, 1);
    Button xbox1_B = new JoystickButton(xbox1, 2);
    Button xbox1_X = new JoystickButton(xbox1, 3);
    Button xbox1_Y = new JoystickButton(xbox1, 4);
    Button xbox1_L3 = new JoystickButton(xbox1, 9);
    Button xbox1_R3 = new JoystickButton(xbox1, 10);
    Button xbox1_START = new JoystickButton(xbox1, 8);
    Button xbox1_SELECT = new JoystickButton(xbox1, 7);
    Button xbox1_L1 = new JoystickButton(xbox1, 5);
    Button xbox1_R1 = new JoystickButton(xbox1, 6);
     public double getX() {
        return Math.abs(xbox1.getRawAxis(3)) >= 0.2 ? xbox1.getRawAxis(3) : 0; 
    }
    public double getY() {
        return Math.abs(xbox1.getRawAxis(1)) >= 0.2 ? -xbox1.getRawAxis(1) : 0;
    }
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    
    public OI() {
        xbox1_A.whenPressed(new Fire());
        xbox1_B.whenPressed(new Index());
        xbox1_START.whenPressed(new TurnOnLauncherMotor());
        xbox1_SELECT.whenPressed(new TurnOffLauncherMotor());
    }
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
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
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

