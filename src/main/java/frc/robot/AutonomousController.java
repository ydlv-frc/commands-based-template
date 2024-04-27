package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;

public class AutonomousController {
    private final CommandFactory commandFactory;
    private final SendableChooser<Command> autonomousChooser;
    private Command runningCommand;

    public AutonomousController(CommandFactory commandFactory) {
        this.commandFactory = commandFactory;
        this.autonomousChooser = new SendableChooser<>();

        // autonomousChooser.setDefaultOption("name", commandFactory.yourCommandHere());
        // autonomousChooser.addOption("name2", commandFactory.yourOtherCommandHere());

        SmartDashboard.putData("autonomous", autonomousChooser);
    }

    public void startAutonomous() {
        runningCommand =  autonomousChooser.getSelected();
        runningCommand.schedule();
    }

    public void stopAutonomous() {
        if(runningCommand != null && runningCommand.isScheduled()) {
            runningCommand.cancel();
        }
    }
}
