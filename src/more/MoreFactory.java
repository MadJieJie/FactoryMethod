package more;

/**
 * @author Created by MadJieJie on 2017/1/16-11:19.
 * @brief
 * @attention
 */
public class MoreFactory
{
	public static IGeometric createCircle()
	{
		return new Circle();
	}
	
	public static IGeometric createRectangle()
	{
		return new Rectangle();
	}
}
