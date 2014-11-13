/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.IndexerDoNothing;

/**
 *
 * @author Administrator
 */
public class Hopper extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private boolean isLoaded = false;
    private final Relay indexerMotor = new Relay(RobotMap.INDEXER_MOTOR_PORT);
    private final DigitalInput indexerLimitSwitch = new DigitalInput(RobotMap.INDEXER_LIMIT_SWITCH_PORT);

    public void initDefaultCommand() {
        setDefaultCommand(new IndexerDoNothing());
    }

    public void index() {
        indexerMotor.set(!isLoaded ? Relay.Value.kForward : Relay.Value.kOff);
        if (indexerLimitSwitch.get()) {
            isLoaded = true;
            indexerMotor.set(Relay.Value.kOff);
        }
    }
    
    public boolean getLoaded() {
        return isLoaded;
    }
    
    public void setLoaded(boolean state) {
        isLoaded = state;
    }
    
    public void stopMotor(){
        indexerMotor.set(Relay.Value.kOff);
    }  
}
