package stage2.models;

public class Hoover extends Appliance {
    public Hoover(String name, int serialNumber, boolean isConnected, int powerUsage) {
        super(name, serialNumber, isConnected, powerUsage, ApplianceType.Hoover);
    }
}
