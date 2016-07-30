package com.example.saunakc.bookshelf.UI.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.saunakc.bookshelf.R;
import com.example.saunakc.bookshelf.UI.ForgotPassword.ForgotPassword;
import com.example.saunakc.bookshelf.UI.Home.Activity_HomePage;

public class
Login extends AppCompatActivity {

    private EditText emailId;
    private EditText passWord;
    private Button signIn;
    private TextView forgotPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        emailId=(EditText)findViewById(R.id.et_emailId);
        passWord=(EditText)findViewById(R.id.et_password);
        signIn=(Button)findViewById(R.id.bt_signIn);
        forgotPasswd=(TextView)findViewById(R.id.tv_forgotPassword);


        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Activity_HomePage.class));
            }
        });

        forgotPasswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, ForgotPassword.class));
            }
        });

    }
}
