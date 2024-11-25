import stage2.models.*;
import stage2.services.AppLocale;
import stage2.services.ApplianceService;
import stage2.services.ApplianceServiceImpl;
import stage2.services.Connector;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        {
        System.out.println("STAGE 1\n");
        Fridge fridge = new Fridge("Fridge", 1, true, 220);
        Hoover hoover = new Hoover("Hoover", 22, false, 70);
        Iron iron = new Iron("Iron", 7, true, 70);


        List<Appliance> applianceList = new ArrayList<>();
        applianceList.add(fridge);
        applianceList.add(hoover);
        applianceList.add(iron);

        ApplianceService applianceService = new ApplianceServiceImpl(applianceList);
        System.out.println(applianceService.calculatePower());
        System.out.println(applianceService.sortByPower());
        System.out.println(applianceService.findByCriteria(new Criteria(null, 1, null, null)));

        Connector connector = new Connector();
        System.out.println(connector.serializeAppliance(applianceList));
        for (Appliance app : connector.deserializeAppliance()) {
            System.out.println(app);
        }
    }*/
        System.out.println("STAGE 2\n");

        {
            Locale locale = Locale.getDefault();
            if(args.length >= 2){
                System.out.println(args[0] + args[1]);
                locale = new Locale(args[0], args[1]);
            }

            ResourceBundle bundle = ResourceBundle.getBundle("Msg", locale);

            Connector con = new Connector();

            Fridge fridge = new Fridge(bundle.getString(AppLocale.Atlant), 1, true, 220);
            Hoover hoover = new Hoover(bundle.getString(AppLocale.Samsung), 22, false, 70);
            Iron iron = new Iron(bundle.getString(AppLocale.LG), 7, true, 70);

            List<Appliance> applianceList = new ArrayList<>();
            applianceList.add(fridge);
            applianceList.add(hoover);
            applianceList.add(iron);

            ApplianceService applianceService = new ApplianceServiceImpl(applianceList);
            System.out.println(applianceService.calculatePower());
            System.out.println(applianceService.sortByPower());
            System.out.println(applianceService.findByCriteria(new Criteria(null, 1, null, null)));

            Connector connector = new Connector();
            System.out.println(connector.serializeAppliance(applianceList));
            for (Appliance app : connector.deserializeAppliance()) {
                System.out.println(app);
            }
        }

    }
}