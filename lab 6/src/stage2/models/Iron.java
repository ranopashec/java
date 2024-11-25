package stage2.models;

public class Iron extends Appliance {
    public Iron(String name, int serialNumber, boolean isConnected, int powerUsage) {
        super(name, serialNumber, isConnected, powerUsage, ApplianceType.Iron );
    }
}
