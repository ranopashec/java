package stage1.services;

import stage1.models.Appliance;
import stage1.models.Criteria;

import java.util.List;

public interface ApplianceService {
    int calculatePower();
    List<Appliance> sortByPower();
    Appliance findByCriteria(Criteria criteria);
}

