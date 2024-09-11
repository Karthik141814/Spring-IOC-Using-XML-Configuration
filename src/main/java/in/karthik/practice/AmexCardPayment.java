package in.karthik.practice;

public class AmexCardPayment implements IPayment {
	
	public AmexCardPayment() {
		
       System.out.println("Amex Card Payment-0 Constructor");
	}
	public boolean processPayment(double billAmt) {
		System.out.println("Amex Card Payment Proceed");
		return true;
	}

}
