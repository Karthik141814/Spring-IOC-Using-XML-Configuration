package in.karthik.practice;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("Credit Card -0 Constructor");
	}
	public boolean processPayment(double billAmt) {
		System.out.println("Credit Card Payment");
		return false;
	}
}
