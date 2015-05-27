package com.example.myisun.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import android.util.Log;
/*
 * 完成对从服务端请求获得的JSON数据的解析成指定的对象.
 */
public class JSONTools {

    public JSONTools() {
        // TODO Auto-generated constructor stub
    }
   // { "curPage": 1, "totalPage": 1, "newsList": [ 
    //{ "id": 2 "title": "test1", "publishDate": "2014-04-21 21:04", "updateDate": "2014-04-21 21:04", "content": "<p>421</p>" },
    //{ "id": 1 "title": "test", "publishDate":	"2014-04-20 16:16", "updateDate": "2014-04-20 16:16", "content": "<p>&quot;&quot;&quot;测试<strong>test</strong><br/></p>" }, ] }
    
    public static newsList getList(String jsonString){  
        newsList list = new newsList();  
        try {  
        	//Log.v("json","jsonString:"+jsonString);
            JSONObject jsonObject = new JSONObject(jsonString);  
            list.setCurPage(jsonObject.getInt("curPage"));  
            list.setTotalPage(jsonObject.getInt("totalPage"));  
            JSONArray arr=jsonObject.getJSONArray("newsList");
            List<news> newslist1 = new ArrayList<news>();
           // Log.v("jsontool",""+arr.length());
            for(int i = 0; i < arr.length(); i++){
                JSONObject jsonObject2 = arr.getJSONObject(i);
                news new1 = new news();
                Log.v("newslist","1"+jsonObject2.getInt("id"));
                new1.setId(jsonObject2.getInt("id"));
                new1.setTitle(jsonObject2.getString("title"));
                Log.v("newslist","1"+jsonObject2.getString("title"));
                new1.setPublishDate(jsonObject2.getString("publishDate"));
                Log.v("newslist","1"+jsonObject2.getString("publishDate"));
                new1.setUpdateDate(jsonObject2.getString("updateDate"));
                Log.v("newslist","1"+jsonObject2.getString("updateDate"));
              //  new1.setContent(jsonObject.getString("content"));
              //  Log.v("newslist","1"+jsonObject2.getString("content"));
                newslist1.add(new1);
            }
            list.setNewsList(newslist1);
        } catch (Exception e) {  
        	Log.v("26326","wrong:"+e.toString());
            // TODO: handle exception  
        }  
        return list;  
    }  
    
}

