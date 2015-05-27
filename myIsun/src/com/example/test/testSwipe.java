package com.example.test;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.example.myisun.R;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;

public class testSwipe extends Activity{
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main); 
	        SwipeMenuCreator creator = new SwipeMenuCreator() {

	            @Override
	            public void create(SwipeMenu menu) {
	                // create "open" item
	                SwipeMenuItem openItem = new SwipeMenuItem(
	                        getApplicationContext());
	                // set item background
	                openItem.setBackground(new ColorDrawable(Color.rgb(0xC9, 0xC9,
	                        0xCE)));
	                // set item width
	                openItem.setWidth(90);
	                // set item title
	                openItem.setTitle("Open");
	                // set item title fontsize
	                openItem.setTitleSize(18);
	                // set item title font color
	                openItem.setTitleColor(Color.WHITE);
	                // add to menu
	                menu.addMenuItem(openItem);

	                // create "delete" item
	                SwipeMenuItem deleteItem = new SwipeMenuItem(
	                        getApplicationContext());
	                // set item background
	                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
	                        0x3F, 0x25)));
	                // set item width
	                deleteItem.setWidth(90);
	                // set a icon
	                deleteItem.setIcon(R.drawable.ic_delete);
	                // add to menu
	                menu.addMenuItem(deleteItem);
	            }
	        };

	        // set creator
	        SwipeMenuListView view1=new SwipeMenuListView(getApplicationContext());
	        view1.setMenuCreator(creator);
	 }
}
