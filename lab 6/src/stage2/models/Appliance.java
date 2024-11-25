package stage2.models;

import stage2.services.AppLocale;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

public abstract class Appliance implements Serializable{
    private final String name;
    private final int serialNumber;
    private boolean isConnected;
    private final int powerUsage;
    private final ApplianceType type;

    public final Date creationDate = new Date();

    public String getCreationDate() {
        DateFormat dateFormatter = DateFormat.getDateTimeInstance(
                DateFormat.DEFAULT, DateFormat.DEFAULT, AppLocale.get());
        return dateFormatter.format(creationDate);
    }

    public Appliance(String name, int serialNumber, boolean isConnected, int powerUsage, ApplianceType type) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.isConnected = isConnected;
        this.powerUsage = powerUsage;
        this.type = type;
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
        return type.toString() + " {" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", isConnected=" + isConnected +
                ", powerUsage=" + powerUsage +
                "}";
    }
}
