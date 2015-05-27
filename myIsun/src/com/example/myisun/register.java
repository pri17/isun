package com.example.myisun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class register extends Activity {
	public  boolean isEmail(String strEmail) {
		String strPattern = "^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";

		Pattern p = Pattern.compile(strPattern);
		Matcher m = p.matcher(strEmail);
		return m.matches();
	}
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		setTitle("用户注册");
		final Button btnSub = (Button) findViewById(R.id.rigSub);
		final CheckBox check1 = (CheckBox) findViewById(R.id.agRis);  
		check1.setChecked(false);  
		btnSub.setEnabled(false);   
		check1.setOnClickListener(new CheckBox.OnClickListener(){  
			   public void onClick(View v) {  
		    if(check1.isChecked()){  
			       btnSub.setEnabled(true);                 
			  }else{  
			    btnSub.setEnabled(false);  
			    } 
			   }           
			});  

		btnSub.setOnClickListener(new View.OnClickListener(){
		
			@Override
			public void onClick(View v) {                                                   //向邮箱发送邮件
					EditText temp=(EditText) findViewById(R.id.emailForget);
					String email=temp.getText().toString();
					if(isEmail(email))
					{													//跳转到发送成功页面
					  Intent i = new Intent(getApplicationContext(), successSent.class);
                      i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                       
                      // Add new Flag to start new Activity
                      i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                      startActivity(i);
                       
                      finish();
					}
					else
					{
						 Toast.makeText(getApplicationContext(), 
		                         "邮箱格式错误！",
		                              Toast.LENGTH_LONG).show();
						 temp.clearComposingText();
		                     
					}
				
				
			}
			
		});
	}
}
