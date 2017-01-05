package inc.xy.model;


import java.io.Serializable;


public class PointPK implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3651208278174115379L;

    private int x;

    private int y;


    public PointPK() {

        super();
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


    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
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
        PointPK other = (PointPK) obj;
        if ( x != other.x )
            return false;
        if ( y != other.y )
            return false;
        return true;
    }

}
