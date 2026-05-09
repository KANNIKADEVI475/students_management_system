package studentsManagementSystem;
import java.util.*;
class Student{
	int id;
	String name;
}
public class scorceCode {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Student>studentList=new ArrayList<>();
		int i=0;
		System.out.println("Operation Menu: ");
		System.out.println("1.Add student");
		System.out.println("2.View students");
		System.out.println("3.Remove student");
		System.out.println("4.Update student");
		System.out.println("5.Search student");
		System.out.println("6.Exit");
while(true) {
	System.out.print("\nEnter the choice(1-6): ");
	int choice=s.nextInt();
	s.nextLine();
	switch(choice) {
	case 1:
		Student stu=new Student();
		System.out.print("Enter the student name to add: ");
		stu.name=s.nextLine();
		stu.id=++i;
		studentList.add(stu);
		System.out.println("New Student added successfully.");
		break;
	case 2:
		for(Student st:studentList) {
			System.out.println(st.id+". "+st.name);
		}
		break;
	case 3:
	    System.out.print("Enter the student id to be removed: ");
	    int ref=s.nextInt();
		studentList.remove(ref-1);
		System.out.println("Student id: "+ref+" deleted sucessfully");
		break;
	case 4:
		Student modifiedStudent=new Student();
		System.out.print("Enter the id of the Student to update:");
		int ref2=s.nextInt();
		s.nextLine();
		System.out.print("Enter the new student name: ");
		modifiedStudent.name=s.nextLine();
		modifiedStudent.id=ref2;
		studentList.set(ref2-1,modifiedStudent); 
		System.out.println("Student "+ref2+" is updated successfully.");
		break;
	case 5:
		int flag=0;
		System.out.print("Enter the student name to Search: ");
		String inputName=s.nextLine();
		for(Student st:studentList) {
			if((st.name).equalsIgnoreCase(inputName)) {
				System.out.println("Student found");
				flag=1;
				break;
			}
					}
		if(flag==0)
		System.out.println("Student not found");
		break;
	case 6:
		System.out.println("User exited.");
		s.close();	
		return;
	}
}
	}

}
