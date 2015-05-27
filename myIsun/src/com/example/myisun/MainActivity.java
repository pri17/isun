package com.example.myisun;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.test.R;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
 
public class MainActivity extends Activity {
     
    Button btnLogin,btnForget,btnRegister;
     
    EditText txtUsername, txtPassword;
     CheckBox check1=null;
     CheckBox check2=null;
    // User Session Manager Class
    UserSessionManager session;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); 
         
        // User Session Manager
        session = new UserSessionManager(getApplicationContext());                
         
        // get Email, Password input text
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword); 
                                                                                   //存贮用户的数据
         
        check1=(CheckBox) findViewById(R.id.checkBox1);
        check2=(CheckBox) findViewById(R.id.checkBox2);
        
        check1.setOnClickListener(new CheckBox.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(check1.isChecked())
				{	
					System.out.println("选中！");
				}
			} 
        	
        });
        check2.setOnClickListener(new CheckBox.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{	
					if(check2.isChecked())
					{
						System.out.println("选中！");
					}
				
				}
				catch(Exception e){
					 Toast.makeText(getApplicationContext(), 
	                          e.toString(),
	                                Toast.LENGTH_LONG).show();
				}
				
			} 
        	
        });
        
        
        
        
        // User Login button
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnForget = (Button) findViewById(R.id. forget_password);
        btnRegister=(Button) findViewById(R.id. register);
		btnForget.setOnClickListener(new View.OnClickListener(){
		
			@Override
			public void onClick(View v) {                                                   //向邮箱发送邮件
				   Intent i = new Intent(getApplicationContext(), forgetPw.class);
                   i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    
                   // Add new Flag to start new Activity
                   i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                   startActivity(i);
                    
                   finish();	
				
			}
		});
        btnRegister.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(getApplicationContext(),register.class);
                  i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                   
                  // Add new Flag to start new Activity
                  i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                  startActivity(i);
                   
                  finish();	
				
			}
		});
        // Login button click event
        btnLogin.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View arg0) {
                // Get username, password from EditText                                //验证用户名和密码
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();
                // Validate if username, password is filled             
                if(username.trim().length() > 0 && password.trim().length() > 0){
                     
                    // For testing puspose username, password is checked with static data
                    // username = admin
                    // password = admin
                     
                    if(username.equals("admin") && password.equals("admin")){
                         
                        // Creating user login session
                        // Statically storing name="Android Example"
                        // and email="androidexample84@gmail.com"
                        session.createUserLoginSession("Android Example", 
                           "androidexample84@gmail.com");
                         
                        // Starting MainActivity
                        Intent i = new Intent(getApplicationContext(), showNewsList.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                         
                        // Add new Flag to start new Activity
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(i);
                         
                        finish();
                         
                    }else{
                         
                        // username / password doesn't match&
                        Toast.makeText(getApplicationContext(), 
                          "用户名或者密码不正确！",
                                Toast.LENGTH_LONG).show();
                         
                    }               
                }else{
                     
                    // user didn't entered username or password
                    Toast.makeText(getApplicationContext(), 
                         "请输入用户名/手机号和密码~",
                              Toast.LENGTH_LONG).show();
                     
                }
                 
            }
        });
    }        
}



