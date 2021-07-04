package dao;

import pyramid.Pyramid;

import java.util.List;

public interface PyramidDao {

    List<Pyramid> getAllPyramidsFromTxt(String path);

}
