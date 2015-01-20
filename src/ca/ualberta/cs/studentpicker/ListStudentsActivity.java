package ca.ualberta.cs.studentpicker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ListStudentsActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_students);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_students, menu);
		return true;
	}
	
	public void addStudentAction(View v) {
		Toast.makeText(this, "Testing Add Student", Toast.LENGTH_SHORT).show();
		
		StudentListController st = new StudentListController();
		EditText textView = (EditText)findViewById(R.id.AddStudentNameText);
		st.addStudent(new Student(textView.getText().toString()));
		
		
	}

}
