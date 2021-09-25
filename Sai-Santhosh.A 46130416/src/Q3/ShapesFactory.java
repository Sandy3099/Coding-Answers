package Q3;
import Q3.Shape;
import java.util.ArrayList;
import java.util.Random;
public class ShapesFactory
{
	public static Shape produceShape()
	{
		int n = new Random().nextInt();
		switch(n%3)
		{
		case 0:
			return new Circle(9.36);
		default:
			return Rectangle(22.1,10.2);
		}
	}
}
