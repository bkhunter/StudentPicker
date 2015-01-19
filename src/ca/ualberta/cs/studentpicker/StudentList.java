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

	public Student chooseStudent() throws EmptyStudentListException 
	{
		int size = studentList.size();
		if (size <= 0) {
			throw new EmptyStudentListException();
		}
		int index = (int) (size * Math.random());
		return studentList.get(index);
	}
	
	public int size() {
		return studentList.size();
	}
	
	public boolean contains(Student s) {
			
		return false;
	}

}
	
