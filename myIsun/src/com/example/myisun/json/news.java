package com.example.myisun.json;

import java.util.Date;

public class news {
	private int id;
	private String title;
	private String publishDate;
	private String updateDate;
	private String content;
	public news(){
		
	}
	public news(int id,String title,String publishDate,String updateDate,String c){
		super();
		this.id=id;
		this.title=title;
		this.publishDate=publishDate;
		this.updateDate=updateDate;
		this.content=c;
	}
	public void setId(int id){
		this.id= id;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setPublishDate(String publishDate){
		this.publishDate= publishDate;
	}
	public void setUpdateDate(String updateDate){
		this.updateDate= updateDate;
	}
	public void setContent(String c){
		this.content=c;
	}
	public int getId(){
		return id;
	}
	public String getTitle(){
		return title;
	}
	public String getPublishDate(){
		return publishDate;
	}
	public String getUpdateDate(){
		return updateDate;
	}
	public String getContent(){
		return content;
	}
}
