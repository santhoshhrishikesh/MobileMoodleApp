package edu.umn.moodlemanaged;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import edu.umn.moodlemanaged.adapters.CoursesCustomAdapter;

public class CoursesFragment extends Fragment {
	private ListView coursesList;
	private CoursesCustomAdapter courseAdapter;
	private ArrayList<Course> courseArray = new ArrayList<Course>();
	
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        // TODO Integrate with cloud
		/**
		 * Add Courses (Mock-up ONLY)
		 */
		courseArray.add(new Course("CSCI 4131", "Internet Programming", 0));
		courseArray.add(new Course("CSCI 5115", "User Interface Design, Implementation & Evaluation", 2));
		courseArray.add(new Course("KIN 5001", "Foundations of Human Factors & Ergonomics", 0));
        courseArray.add(new Course("PSY 3011", "Introduction to Learning & Behavior", 1));
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View view = inflater.inflate(R.layout.courses_tab, container, false);	
		
		/**
		  * Set item into adapter
		  */
		courseAdapter = new CoursesCustomAdapter(getActivity(), R.layout.courses_tab_row, courseArray);
		coursesList = (ListView) view.findViewById(R.id.courses_list);
		coursesList.setItemsCanFocus(false);
		coursesList.setAdapter(courseAdapter);
		
		return view;
	}	
}
