package more;

/**
 * @author Created by MadJieJie on 2017/1/16-10:34.
 * @brief
 * @attention
 */
public class Circle implements IGeometric
{
	private double radius = 1;
	@Override
	public double getArea ()
	{
		return radius*radius*Math.PI;
	}
}
