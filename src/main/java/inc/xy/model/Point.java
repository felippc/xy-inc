package inc.xy.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table( name = "POI_POINT" )
@IdClass( value = PointPK.class )
public class Point {

    @Id
    @Column( name = "X", unique = true, nullable = false )
    int x;

    @Id
    @Column( name = "y", unique = true, nullable = false )
    int y;

    @Column( name = "NAME", length = 200, nullable = false )
    String name;


    public Point() {

    }


    public Point( int x, int y, String name ) {

        this.x = x;
        this.y = y;
        this.name = name;
    }


    public int getX() {

        return x;
    }


    public void setX( int x ) {

        this.x = x;
    }


    public int getY() {

        return y;
    }


    public void setY( int y ) {

        this.y = y;
    }


    public String getName() {

        return name;
    }


    public void setName( String name ) {

        this.name = name;
    }


    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }


    @Override
    public boolean equals( Object obj ) {

        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Point other = (Point) obj;
        if ( name == null ) {
            if ( other.name != null )
                return false;
        } else if ( !name.equals( other.name ) )
            return false;
        if ( x != other.x )
            return false;
        if ( y != other.y )
            return false;
        return true;
    }

}
