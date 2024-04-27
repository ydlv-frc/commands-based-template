package frc.robot.dashboard;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public abstract class DashboardField<T> {
    public final String name;
    public final T defaultValue;

    public DashboardField(String name, T defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;

        if(!SmartDashboard.containsKey(name)) {
            setValue(defaultValue);
        }
    }

    public abstract T getValue();

    public abstract void setValue(T value);
}
