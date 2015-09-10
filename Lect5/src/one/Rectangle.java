package one;

public class Rectangle  extends Shape{

	protected double length, width;
    public Rectangle(double len, double wid)
    {
	 super ("Rectangle");
	length = len;   width = wid;
    }
    
    Rectangle(String name) {
        super(name);
   }

    public double area ( )
    {
    	return length * width;
    	}
    public double perimeter ( )
    {
	
    	return 2.0 * (length + width);   
	}
}

