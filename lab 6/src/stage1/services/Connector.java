package stage1.services;

import stage1.models.Appliance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Connector {

    public String serializeAppliance(List<Appliance> band) throws IOException {
        FileOutputStream fos = new FileOutputStream("appliance.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeInt(band.size());
            for (int i = 0; i < band.size(); i++) {
                oos.writeObject(band.get(i));
            }
            oos.flush();
        }
        return "molodec";
    }

    public Appliance[] deserializeAppliance() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("appliance.txt");
        try (ObjectInputStream oin = new ObjectInputStream(fis)) {
            int length = oin.readInt();
            Appliance[] result = new Appliance[length];
            for (int i = 0; i < length; i++) {
                result[i] = (Appliance) oin.readObject();
            }
            return result;
        }
    }

}
