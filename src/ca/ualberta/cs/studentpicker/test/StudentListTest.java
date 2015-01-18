package ca.ualberta.cs.studentpicker.test;

import java.util.Collection;

import junit.framework.TestCase;
import ca.ualberta.cs.studentpicker.StudentList;
import ca.ualberta.cs.studentpicker.Student;

public class StudentListTest extends TestCase

{
	public void testEmptyStudentList() {
		
		StudentList studentList = new StudentList();
		
		Collection<Student> students = studentList.getStudents();
		
		assertTrue("Empty Student List", students.size() == 0);
		
		
	}
	
	public void testAddStudentList() {
		
		StudentList studentList = new StudentList();
		
		String studentName = "A Student";
		
		Student testStudent = new Student(studentName);
		
		studentList.addStudent(testStudent);
		
		Collection<Student> students = studentList.getStudents();
		
		assertTrue("Student List Size", students.size() == 1);
		assertTrue("Student Not Stored", students.contains(testStudent));
		assertTrue("Student not copied out", students.contains(testStudent));
		
		
		
	}
	
	public void testRemoveStudent() {
		
		StudentList studentList = new StudentList();
		
		String studentName1 = "A Student";
		String studentName2 = "Another Student";
		String studentName3 = "Also Student";
		
		Student testStudent1 = new Student(studentName1);
		Student testStudent2 = new Student(studentName2);
		Student testStudent3 = new Student(studentName3);
		
		studentList.addStudent(testStudent1);
		studentList.addStudent(testStudent2);
		studentList.addStudent(testStudent3);
		
		Collection<Student> students = studentList.getStudents();
		
		assertTrue("Student List Size", students.size() == 3);
		assertTrue("Student1 Not Stored", students.contains(testStudent1));
		
		studentList.removeStudent(testStudent1);
		
		assertTrue("Student1 Not Removed_size", students.size() == 2);
		assertFalse("Student1 Not Removed", students.contains(testStudent1));
		
	}
		
		
		public void testChooseStudentList() {
			
			StudentList studentList = new StudentList();
			
			String studentName1 = "A Student";
			String studentName2 = "Another Student";
			String studentName3 = "Also Student";
			
			Student testStudent1 = new Student(studentName1);
			Student testStudent2 = new Student(studentName2);
			
			studentList.addStudent(testStudent1);
			studentList.addStudent(testStudent2);
			
			//Testing for 1 student
			for (int i=0; i<1000; i++) {
			
				Student student = studentList.chooseStudent();
			
				assertTrue("Student is not Null", student != null);
			
				//assertTrue("Didn't choose the right student", student.equals(testStudent1));
			}
			
			Student [] studentArray = {testStudent1, testStudent2};
			
			for (int i = 0; i < studentArray.length; i++) {
				
				Student targetStudent = studentArray[i];
				int maxcount = 1000;
				
				while(maxcount > 0 && !targetStudent.equals(studentList.chooseStudent())) {
					
					maxcount--;
					
				}
				assertTrue("too many iterations", maxcount > 0);
				
			}
		}
}
