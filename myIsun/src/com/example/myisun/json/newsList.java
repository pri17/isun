package com.example.myisun.json;

import java.util.List;

public class newsList {
	private int curPage;
	private int totalPage;
	private List<news> list;
	public newsList(){
		
	}
	public newsList(int c,int t,List<news> list){
		super();
		this.curPage=c;
		this.totalPage=t;
		this.list=list;
	}
	public void setCurPage(int curPage){
		this.curPage=curPage;
	}
	public void setTotalPage(int totalPage){
		this.totalPage=totalPage;
	}
	public void setNewsList(List<news> newslist1){
		this.list=newslist1;
	}
	public int getCurPage(){
		return curPage;
	}
	public int getTotalPage(){
		return totalPage;
	} 
	public List<news> getNewsList(){
		return list;
	}
	public int getNewsNumber() {
		return list.size();
	}
}
