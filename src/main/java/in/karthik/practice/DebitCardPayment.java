package in.karthik.practice;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("Debit Card - O Constructor");
	}
	public boolean processPayment(double billAmt) {
		System.out.println("Debit Card Payment Proceed..");
		return true;
	}
}
