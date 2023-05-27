package basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike{
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
		Bike b=(Bike) context.getBean("myBike");
		b.price();
	}

}
