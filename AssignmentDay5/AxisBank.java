package AssignmentDay5;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Override the deposit of Axis Bank in Bankinfo ");
	}
	
	
	public static void main(String[] args) {
		AxisBank axisObj = new AxisBank();
		axisObj.saving();
		axisObj.fixed();
		axisObj.deposit();

	}

}
