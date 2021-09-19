package AssignmentDay5;

public class Student {
	
	public void getStudentInfo(int id) {
		System.out.println("Student-Id: "+id);	
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student-Id :"+id+"\nStudent-Name: "+name);
	}
	
	public void getStudentInfo(String emailID, int phoneno) {
		System.out.println("Student-email:"+emailID+"\nStudent-PhoneNumber: "+phoneno);
	}
	
	public static void main(String[] args) {
		Student studentinfo = new Student();
		studentinfo.getStudentInfo(678);
		studentinfo.getStudentInfo(6, "Mithun");
		studentinfo.getStudentInfo("mm@gmail.com",987654320);

	}

}
