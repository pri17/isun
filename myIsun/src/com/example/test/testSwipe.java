package com.example.test;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.example.test.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class testSwipe extends Activity{
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.test); 
	    
	 }
	 public void onClick(View v){
		 switch(v.getId()){
		 case R.id.button1:
			 startActivity(new Intent(this,simpleMenu.class));
			 break;
		 case R.id.button2:
			 startActivity(new Intent(this,differentMsnu.class));
			 break;
		 }
		
	 }
}
