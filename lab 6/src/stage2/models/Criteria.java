package stage2.models;

public class Criteria {
    private final String name;
    private final Integer serialNumber;
    private final Boolean isConnected;
    private final Integer powerUsage;

    public Criteria(String name, Integer serialNumber, Boolean isConnected, Integer powerUsage) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.isConnected = isConnected;
        this.powerUsage = powerUsage;
    }

    public String getName() {
        return name;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public Boolean isConnected() {
        return isConnected;
    }

    public Integer getPowerUsage() {
        return powerUsage;
    }
}
