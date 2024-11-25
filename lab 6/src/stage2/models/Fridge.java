package stage2.models;

public class Fridge extends Appliance {
    public Fridge(String name, int serialNumber, boolean isConnected, int powerUsage) {
        super(name, serialNumber, isConnected, powerUsage, ApplianceType.Fridge);
    }
}
