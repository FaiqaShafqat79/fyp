package com.example.pdbsflhr22.shareride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BeforeLogin extends AppCompatActivity {

    Button btn_login, btn_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_login);

        btn_login=(Button)findViewById(R.id.btn_login);
        btn_signup=(Button)findViewById(R.id.btn_signup);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeforeLogin.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeforeLogin.this, SignupActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
