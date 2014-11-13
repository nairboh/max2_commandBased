package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;


/**
 *
 * @author brianho
 */
public class Pneumatics extends Subsystem {
    public Compressor compressor = new Compressor(1, 1);


    public void initDefaultCommand() {
        compressor.start();
    }
}
