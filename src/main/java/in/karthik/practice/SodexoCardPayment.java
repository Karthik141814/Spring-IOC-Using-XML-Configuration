package in.karthik.practice;

public class SodexoCardPayment implements IPayment {
	
public SodexoCardPayment() {
      System.out.println("Sodexo Card -0 Constructor");
}
	public boolean processPayment(double billAmt) {
    System.out.println("Sodexo Card Payment Proceed..");
		return true;
	}

}
