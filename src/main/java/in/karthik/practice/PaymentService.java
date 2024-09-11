package in.karthik.practice;

import in.karthik.practice.*;

public class PaymentService {
	
	private IPayment payment;//Field Injetion
	
	//Constructor Injection
	public PaymentService() {
		System.out.println("Payment service - 0 Constructor");
	}
	
	public PaymentService(IPayment payment) {
		this.payment=payment;
	}
	
	//Setter Injection
	public void  setPayment(IPayment payment) {
		this.payment=payment;
	}
	
	public void doPayment(double billAmt) {
		boolean status=payment.processPayment(billAmt);
		if(status) {
			System.out.println("Print Receipt Generated Sucessfully");
		}
		else {
			System.out.println("Payment Declined");
		}
	}

}
