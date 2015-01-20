package ca.ualberta.cs.studentpicker;

// lazy singleton because there is only one made
public class StudentListController {
	
	private static StudentList studentlist = null;
	
	public StudentList getStudentList() {
		
		if (studentlist == null) {
			studentlist = new StudentList();
		}
		
		return studentlist;
	}
	
	public Student chooseStudent() throws EmptyStudentListException {
		
		return getStudentList().chooseStudent();
	}
	
	public void addStudent(Student s) {
		
		getStudentList().addStudent(s);
	}
	
	public void bulkImport(String s) {
		
		String [] names = s.split("\n");
		StudentList sl = getStudentList();
		
		for (int i=0; i<names.length; i++) {
			
			String name = names[i].trim();
			
			if (!name.equals("")) {
				
				Student chipper = new Student(name);
				
				sl.addStudent(chipper);
			} 
			
		}
		
		
	}

}
