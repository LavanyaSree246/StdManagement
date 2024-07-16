import java.util.LinkedList;
import java.util.Scanner;
public class StudentManagement {

LinkedList<Student> list;
public StudentManagement()
	{
		list = new LinkedList<>();
	}
public void add(Student student)
	{
	if (!find( student.getIdNumber())) {
			list.add( student);
		}
	else {
          System.out.println("Record already exists in the Record list");
		}
	}
public boolean find(int idNumber)
	{
    for ( Student l : list) 
	{
    if (l.getIdNumber() == idNumber) 
	{
	   System.out.println(l);
	   return true;
			}
		}
	   return false;
	}
public void delete(int recId)
	{
	Student studentDel = null;
	for (Student ll : list) 
	{
    if (ll.getIdNumber() == recId)
	 {
				studentDel = ll;
			}
		}
        if (studentDel == null) 
		{
           System.out.println("Invalid record Id");
		}
		else
		 {
            list.remove(studentDel);
              System.out.println("Successfully removed record from the list");
		}
	}
	public  Student findStudent(int idNumber)
	{
		for ( Student l : list)
		 {
           if (l.getIdNumber() == idNumber) {
				return l;
			}
		}
         return null;
	}

	public void update(int id, Scanner input)
	{
      if (find(id)) {
            Student rec = findStudent(id);
			System.out.print("What is the new Student id Number ? ");
			@SuppressWarnings("unused")
            int idNumber = input.nextInt();
            System.out.print("What is the new Student contact Number ");
			int contactNumber = input.nextInt();
			input.nextLine();
            System.out.print("What is the new Student Name ? ");
			String name = input.nextLine();
            rec.setIdNumber(id);
			rec.setName(name);
			rec.setContactNumber(contactNumber);
			System.out.println(
				"Record Updated Successfully");
		}
		else {
            System.out.println("Record Not Found in the Student list");
		}
	} 
	public void display()
	{
       if (list.isEmpty()) 
		{
			System.out.println("The list has no records\n");
		}
		for (Student student: list)
		 {
           System.out.println(student.toString());
		}
	}
}


