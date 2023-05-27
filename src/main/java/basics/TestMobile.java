package basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
	public static void main(String[] args) {
//		ClassPathResource resource=new ClassPathResource("ioc1.xml");
//		BeanFactory bf=new XmlBeanFactory(resource);
//		Mobile m=(Mobile) bf.getBean("mymobile");
//		m.MusicPlayer();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile mobile=(Mobile) context.getBean("mymobile");
		mobile.MusicPlayer();
	}

}
