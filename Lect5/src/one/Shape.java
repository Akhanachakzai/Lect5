package one;

public abstract class Shape {
protected String Shapename;
public Shape(String Name)
{
	Shapename=Name;
}
public abstract double area();
public abstract double perimeter();
public String NametoString()
{
	return Shapename;
}

}
