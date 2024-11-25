package stage2.services;

import stage2.models.Appliance;
import stage2.models.Criteria;

import java.util.List;

public interface ApplianceService {
    public int calculatePower();
    public List<Appliance> sortByPower();
    public Appliance findByCriteria(Criteria criteria);
}

