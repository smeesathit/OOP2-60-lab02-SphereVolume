
/**
 * คลาสรูปทรงกลม
 */
public class Sphere
{
    // class varibles
    private static final double PI = 3.1416;
    // instance variables - replace the example below with your own
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        // initialise instance variables
        radius = 0.0;
    } // End constructor

    /**
     * set method
     */
    public void setRadius(double r)
    {
       radius = r;
    } // End setRadius
    
    /**
     * get method
     */
    public double getRadius()
    {
       return radius;
    } // End getRadius
    
    public double getVolume(){
        double volume;
        
        volume = (4.0/3.0) * PI * (radius * radius * radius);
        
        return volume;
    }
}
