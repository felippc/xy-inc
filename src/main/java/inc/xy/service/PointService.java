package inc.xy.service;

import inc.xy.model.Point;

import java.util.List;


public interface PointService {

    List< Point > list();

    Point save( Point Point );
    
    List< Point > searchByDistance(Integer x, Integer y, Integer maxDistance );
}

