/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Administrator
 */
public class Hangers extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private final Solenoid pistonsExtended = new Solenoid(3);
    private final Solenoid pistonsRetracted = new Solenoid(4);
    
    public void initDefaultCommand() {
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void extendArms() {
        pistonsRetracted.set(false);
        pistonsExtended.set(true);    
    }
    
    public void retractArms() {
        pistonsRetracted.set(true);
        pistonsExtended.set(false);    
    }
    
}
