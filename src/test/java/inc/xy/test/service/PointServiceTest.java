package inc.xy.test.service;


import inc.xy.model.Point;
import inc.xy.service.PointService;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;


@RunWith( SpringJUnit4ClassRunner.class )
//@ContextConfiguration( locations = { "classpath:spring/application-config-test.xml" } )
@SpringBootTest
public class PointServiceTest {

    @Autowired
    private PointService pointService;


    @Test
    public void shouldListPoints() {

        List< Point > points = pointService.list();
        Assert.notEmpty( points );
    }


    @Test
    public void shouldSavePoints() {

        Point point = new Point( 10, 10, "Ponto 10" );

        Point sPoint = pointService.save( point );
        Assert.notNull( sPoint );
        
    }
    
    @Test 
    public void shouldFindXPoints(){
        
        List< Point > points = pointService.searchByDistance( 10, 10, 10 );
        Assert.notEmpty( points );
    }

}
