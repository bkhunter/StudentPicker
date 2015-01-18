package ca.ualberta.cs.studentpicker;

import java.util.ArrayList;
import java.util.Collection;
import ca.ualberta.cs.studentpicker.Student;

public class StudentList
{
	protected ArrayList<Student> studentList;
	
	public StudentList() {
		this.studentList = new ArrayList<Student>();
	}
	
	public Collection<Student> getStudents() {
		return this.studentList;
	}
	
	public void addStudent(Student s) {
		
		this.studentList.add(s);
		
	}

	public void removeStudent(Student student)
	{
		this.studentList.remove(student);
		
	}

	public Student chooseStudent()
	{
		int index = (int) (studentList.size() * Math.random());
		return studentList.get(index);
	}
	
}
