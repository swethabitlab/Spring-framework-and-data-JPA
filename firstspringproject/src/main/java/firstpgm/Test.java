package firstpgm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
 public static void main(String[] args) {
	 //load configure file
	Resource r=new ClassPathResource("bean.xml");
	//start using bean factory
	BeanFactory f=new XmlBeanFactory(r);
	f.getBean("credit",Credit.class);
	f.getBean("debit",Debit.class);
	f.getBean("zeta",ZetaCard.class);
}
}
