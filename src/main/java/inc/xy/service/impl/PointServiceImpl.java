package inc.xy.service.impl;


import inc.xy.model.Point;
import inc.xy.repository.PointRepository;
import inc.xy.service.PointService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


@Service
public class PointServiceImpl implements PointService {

    private Logger logger = Logger.getLogger( getClass().getName() );

    @Autowired
    private PointRepository pointRepository;


    @Override
    public List< Point > list() {

        logger.info( "finding points" );
        
        Iterable< Point > points = pointRepository.findAll();
        if ( points != null ) {
            List< Point > pointsList = new ArrayList< Point >();
            Iterator< Point > pointsIt = points.iterator();
            while ( pointsIt.hasNext() ) {
                pointsList.add( pointsIt.next() );
            }
            return pointsList;
        }
        return Collections.emptyList();
    }
    

    @Override
    public Point save( Point point ) {

        logger.info( "saving point: " + point );
        return pointRepository.save( point );
    }


    @Override
    public List< Point > searchByDistance( Integer x, Integer y, Integer maxDistance ) {

        Assert.notNull( x, "Parameter x is required." );
        Assert.notNull( y, "Parameter y is required." );
        Assert.notNull( maxDistance, "Parameter maxDistance is required." );

        logger.info( String.format( "finding points by %d distance of [%d, %d]", maxDistance, x, y ) );

        Iterable< Point > points = pointRepository.findAll();
        if ( points != null ) {
            
            return filterPointsByDistance( points.iterator(), x, y, maxDistance );
        }
        return Collections.emptyList();
    }
    
    private List<Point> filterPointsByDistance(Iterator< Point > pointsIt, Integer x, Integer y, Integer maxDistance){
        List< Point > pointsList = new ArrayList< Point >();
        while ( pointsIt.hasNext() ) {
            Point point = pointsIt.next();
            if (isPointInDistanceRange( point, x, y, maxDistance )){
                pointsList.add( point );
            }
        }
        return pointsList;
    }
    
    private boolean isPointInDistanceRange(Point point, int x, int y, int maxDistance){
        double distance = Math.sqrt(Math.pow((point.getX()-x), 2) + Math.pow((point.getY()-y), 2));
        return distance <= (double) maxDistance;
    }

}
