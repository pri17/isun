package com.example.myisun;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.view.KeyEvent;  
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class forgetPw extends Activity {
	protected  static boolean isEmail(String strEmail) {
		String strPattern = "^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";

		Pattern p = Pattern.compile(strPattern);
		Matcher m = p.matcher(strEmail);
		return m.matches();
	}
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forget);
		setTitle("�޸�����");                                                //�����䷢���ʼ�
					EditText temp=(EditText) findViewById(R.id.emailForget);
						String email=temp.getText().toString();
						  temp.setOnEditorActionListener(new OnEditorActionListener() {  
					            @Override  
					            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {  
					            	  Intent i = new Intent(getApplicationContext(), successSent.class);
				                      i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				                       
				                      // Add new Flag to start new Activity
				                      i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				                      startActivity(i);
				                       
				                      finish();
					              
					                return false;  
					            }  
					        });  
						if(isEmail(email))
						{													//��ת�����ͳɹ�ҳ��
						
						}
					/*	else
						{
							 Toast.makeText(getApplicationContext(), 
			                         "�����ʽ����",
			                              Toast.LENGTH_LONG).show();
							 temp.clearComposingText();
			                     
						}*/
				
				
			}
			
	
}