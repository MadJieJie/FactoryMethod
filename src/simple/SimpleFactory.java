package simple;

/**
 * @author Created by MadJieJie on 2017/1/16-10:29.
 * @brief
 * @attention
 */
public class SimpleFactory
{
	public static final int Circle = 1;
	public static final int RECTANGLE = 2;
	
	public static IGeometric createGeometric ( int type )
	{
		switch ( type )
		{
			case Circle:
				return new Circle();
			case RECTANGLE:
				return new Rectangle();
			default:
				throw new NullPointerException("Not have this type.");
		}
	}
	
}
