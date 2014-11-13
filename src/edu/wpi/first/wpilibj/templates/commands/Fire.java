package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Administrator
 */
public class Fire extends CommandBase {
    
    public Fire() {
        requires(launcher);
        requires(hopper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        launcher.shoot();
        hopper.setLoaded(false);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
