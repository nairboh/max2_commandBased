/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.LauncherDoNothing;

/**
 *
 * @author Administrator
 */
public class Launcher extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final SpeedController launcherMotor = new Victor(RobotMap.LAUNCHER_MOTOR_PORT);
    //private final DoubleSolenoid ramPiston = new DoubleSolenoid(1,2);
    private final Solenoid ramPistonExtend = new Solenoid(1, 1);
    private final Solenoid ramPistonRetract = new Solenoid(1, 2);

    public void initDefaultCommand() {
        setDefaultCommand(new LauncherDoNothing());
    }
    
    public void setLauncherMotor(boolean state) {
        launcherMotor.set(state ? .4 : 0);
    }
    
    public void shoot() {
        ramPistonExtend.set(false);
        ramPistonRetract.set(true);
    }
    
    public void setDefaultPistonPosition() {
        ramPistonExtend.set(true);
        ramPistonRetract.set(false);
    }
}