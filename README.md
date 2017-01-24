#什么是工厂方法模式？
##定义
####产品：实例（对象）。
####工厂：生产产品，即实例（对象）。
####工厂方法模式(Factory Method):不通过构造方法实现对类的实例化，而是通过一个工厂类（Factory class）实现对共同接口(IFactory)或者共同继承的类进行实例化。


----------


#适用情况

####当共同接口或者共同继承的类被程序**大量需要**或**实例过于复杂（构造参数过多）**的时候，可通过工厂方法模式进行创建，为了避免过多实例化工厂类占用内存，我们常选用第三种**静态工厂方法模式**来生产**产品**（实例）。


----------


#程序解析
##普通工厂方法模式
####建立一个工厂类，接受不同的参数，可对共同接口或者共同继承的一些类进行不同的实例创建。

> 实现的思路

####1.圆形类和矩形类拥有的方法-getArea() 获取面积；
####2.则创建共同的接口几何图形（**IGeometric**），并抽象方法-getArea()；

```
public interface IGeometric
{
	public double getArea ();
}
```

####3.然后圆形类（**Circle**）和矩形类（**Rectangle**）分别实现接口。

> Circle类

```
public class Circle implements IGeometric
{
	private double radius = 1;
	@Override
	public double getArea ()
	{
		return radius*radius*Math.PI;
	}
}
```

> Rectangle类

```
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
```


####4.用户可以通过调用工厂类的**公有静态方法**赋入工厂类的**常量**实现不同实例的创建。

>SimpleFactory - 工厂类

```
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
```

##多个工厂方法模式
####与普通工厂类不同的是工厂类，对于**不同实例**都有**不同的方法**进行实例的创建，即**一个方法对应一个类的实例创建**，防止出现赋入错误参数进行错误的实例创建或异常抛出。

> MoreFactory - 工厂类

```
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
```

###[源码下载](https://github.com/MadJieJie/FactoryMethod.git) 

