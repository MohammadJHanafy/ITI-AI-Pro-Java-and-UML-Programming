package dao;

import pyramid.Pyramid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PyramidDaoImpl  implements  PyramidDao{
    @Override
    public List<Pyramid> getAllPyramidsFromTxt(String path) {
        List<Pyramid> allPyramids = new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File(path));
            if (sc.hasNextLine()){
                sc.nextLine();
            }
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String [] parts = line.split(",");
                String pharoh = parts[0];
                String ancientName = parts[1];
                String modernName = parts[2];
                int dynasty = 0;
                if(!parts[3].isBlank()){
                    dynasty = Integer.parseInt(parts[3]);
                }
                String site = parts[4];
                double base1 = 0.0;
                if(!parts[5].isBlank()){
                    base1 = Double.parseDouble(parts[5]);
                }
                double base2 = 0.0;
                if(!parts[6].isBlank()){
                    base2 = Double.parseDouble(parts[6]);
                }
                double height = 0.0;
                if(!parts[7].isBlank()){
                    height = Double.parseDouble(parts[7]);
                }

                Pyramid p = new Pyramid(pharoh, ancientName, modernName, dynasty, site, base1, base2, height);

                allPyramids.add(p);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return allPyramids;
    }
}
