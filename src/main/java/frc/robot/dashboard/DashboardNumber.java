package frc.robot.dashboard;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DashboardNumber extends DashboardField<Double> {
    public DashboardNumber(String name, Double defaultValue) {
        super(name, defaultValue);
    }

    @Override
    public Double getValue() {
        return SmartDashboard.getNumber(name, defaultValue);
    }

    @Override
    public void setValue(Double value) {
        SmartDashboard.putNumber(name, value);
    }
}
