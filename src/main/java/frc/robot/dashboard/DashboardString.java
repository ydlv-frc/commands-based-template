package frc.robot.dashboard;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DashboardString extends DashboardField<String> {
    public DashboardString(String name, String defaultValue) {
        super(name, defaultValue);
    }

    @Override
    public String getValue() {
        return SmartDashboard.getString(name, defaultValue);
    }

    @Override
    public void setValue(String value) {
        SmartDashboard.putString(name, value);
    }
}
