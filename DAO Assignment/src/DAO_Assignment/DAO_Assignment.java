package DAO_Assignment;

import dao.PyramidDaoImpl;
import pyramid.Pyramid;

import java.util.List;

public class DAO_Assignment {
    public static void main(String [] args){
        PyramidDaoImpl pd = new PyramidDaoImpl();
        List<Pyramid> pyramids = pd.getAllPyramidsFromTxt("E:\\ITI_AI-Pro\\Phase 1\\Java & UML Programming\\Day 02\\DAO Assignment\\src\\pyramids.csv");
        for (Pyramid p:pyramids) {
            System.out.println(p.toString());
        }
    }
}
