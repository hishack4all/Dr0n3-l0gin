package com.example.uav_v0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;
    //ClipData.Item clsItem;
    String correct_username="terro@drago.ha";
    String correct_password="drag44$**1444-01";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.button);
       // clsItem = findViewById(R.id.item5);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validate inputs
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Empty data provided", Toast.LENGTH_LONG).show();
                }
                else{
                        if(username.getText().toString().equals(correct_username)){
                             //check password
                           if(password.getText().toString().equals(correct_password))
                           {Toast.makeText(LoginActivity.this, "Success Login", Toast.LENGTH_LONG).show();
                           openMainActivity();}
                           else{Toast.makeText(LoginActivity.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();}

                         }else{Toast.makeText(LoginActivity.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();}

                }
            }
        });}
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

//    public void closeMainActivity(){
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);
//    }
}
