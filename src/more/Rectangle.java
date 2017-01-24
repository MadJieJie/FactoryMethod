package more;

/**
 * @author Created by MadJieJie on 2017/1/16-10:35.
 * @brief
 * @attention
 */
public class Rectangle implements IGeometric
{
	private double width = 1;
	private double height = 1;
	@Override
	public double getArea ()
	{
		return width*height;
	}
}
