package stage1.models;

import java.io.Serializable;

public abstract class Appliance implements Serializable{
    private final String name;
    private transient final int serialNumber;
    private boolean isConnected;
    private final int powerUsage;

    public Appliance(String name, int serialNumber, boolean isConnected, int powerUsage) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.isConnected = isConnected;
        this.powerUsage = powerUsage;
    }


    public void plugIn(){
        isConnected = true;
    }

    public void plugOut(){
        isConnected = false;
    }

    public String getName() {
        return name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", isConnected=" + isConnected +
                ", powerUsage=" + powerUsage +
                '}';
    }
}
