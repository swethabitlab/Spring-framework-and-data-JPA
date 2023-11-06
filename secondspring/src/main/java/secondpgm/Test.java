package secondpgm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


public static void main(String[] args) {
  ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
  a.getBean("credit",CreditCard.class);
  Payment p=a.getBean("payment",Payment.class);
  System.out.println(p.dopayment());
}
}
