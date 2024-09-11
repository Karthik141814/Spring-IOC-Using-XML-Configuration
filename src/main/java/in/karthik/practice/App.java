package in.karthik.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
		PaymentService service=ctxt.getBean(PaymentService.class);
		service.doPayment(100.24);
	}

}
