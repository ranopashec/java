package stage2.services;

import stage2.models.Appliance;
import stage2.models.Criteria;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ApplianceServiceImpl implements ApplianceService {
    private final List<Appliance> appliances;

    public ApplianceServiceImpl(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public int calculatePower() {
        return appliances.stream().mapToInt(Appliance::getPowerUsage).sum(); // конвеерные методы не выполняются, если нет терминальных
    }

    @Override
    public List<Appliance> sortByPower() {
        appliances.sort(Comparator.comparingInt(Appliance::getPowerUsage));
        return appliances;
    }

    @Override
    public Appliance findByCriteria(Criteria criteria) {
       for (Appliance appliance : appliances) {
           boolean a =  criteria.getName() == null || Objects.equals(appliance.getName(), criteria.getName()) ;
           boolean b = criteria.getPowerUsage() == null || appliance.getPowerUsage() == criteria.getPowerUsage() ;
           boolean c =  criteria.isConnected() == null || appliance.isConnected() == criteria.isConnected();
           boolean d = criteria.getSerialNumber() == null || appliance.getSerialNumber() == criteria.getSerialNumber();
           if (a && b && c && d) {
               return appliance;
           }
       }
        return null;
    }
}
