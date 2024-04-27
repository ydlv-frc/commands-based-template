package frc.robot.dashboard;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DashboardBoolean extends DashboardField<Boolean> {
    public DashboardBoolean(String name, Boolean defaultValue) {
        super(name, defaultValue);
    }

    @Override
    public Boolean getValue() {
        return SmartDashboard.getBoolean(name, defaultValue);
    }

    @Override
    public void setValue(Boolean value) {
        SmartDashboard.putBoolean(name, value);
    }
}
