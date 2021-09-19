package AssignmentDay5;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("The Size of my desktop is 6inch");
	}
	
	public static void main(String[] args) {
		Desktop deskObj = new Desktop();
		deskObj.computerMode1();
		deskObj.desktopSize();
	
		
		}

}
