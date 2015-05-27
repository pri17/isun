package com.example.myisun;
import java.util.ArrayList;
import java.util.List;

import com.example.myisun.json.*;
import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class showNewsList extends Activity{
	static final String TAG = "showNewsList";
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_list);
		setTitle("今日新闻");
		new Thread(){
			public  void run(){
				try{
		String path = "http://isun.robberphex.com/news/list/?json";  
        String jsonString = HttpUtils.getJsonContent(path);  
        Log.v(TAG, "The jsonString:" + jsonString);
        newsList list = JSONTools.getList( jsonString);
        Log.v("343", ""+list.getCurPage());
        List<news> list1=new ArrayList<news>();
        for(int i=0;i<list.getNewsNumber();i++){
        	news n1=new news();
        	list1.add(n1);
        }
        System.out.println();
        }
				catch(Exception e){
					Log.v("textview",e.toString());
				}
        } 
			}.start();
       // showText.setText(list.getNewsList().toString());

	}
}
