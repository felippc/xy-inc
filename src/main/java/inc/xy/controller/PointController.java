package inc.xy.controller;


import inc.xy.model.Point;
import inc.xy.service.PointService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping( value = "/poi/point" )
public class PointController {

    @Autowired
    private PointService pointService;


    @RequestMapping( value = "", method = RequestMethod.GET )
    public List< Point > list() {

        return pointService.list();
    }


    @RequestMapping( value = "", method = RequestMethod.POST )
    public Point save( @RequestBody Point p ) {

        Assert.notNull( p.getX(), "Point's X should not be null." );
        Assert.notNull( p.getY(), "Point's Y should not be null." );
        Assert.notNull( p.getName(), "Point's Name should not be null." );
        //Assert.isTrue( x >= 0, "Point's X cannot be negative." );
        //Assert.isTrue( y >= 0, "Point's Y cannot be negative." );

        return pointService.save( p );
    }


    @RequestMapping( "/distance/{x}/{y}/{maxDistance}" )
    public List< Point > searchByDistance( @PathVariable Integer x, @PathVariable Integer y, @PathVariable Integer maxDistance ) {

        Assert.notNull( x, "X cannot be null." );
        Assert.notNull( y, "Y cannot be null." );

        if ( maxDistance == null || maxDistance.equals( 0 ) ) {
            maxDistance = 10;
        }
        return pointService.searchByDistance( x, y, maxDistance );
    }

}
