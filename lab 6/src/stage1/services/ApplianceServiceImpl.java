package stage1.services;

import stage1.models.Appliance;
import stage1.models.Criteria;

import java.util.*;

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
