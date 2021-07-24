package com.example.PAUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SigninAct extends AppCompatActivity {
    TextView btn_new_account;
    Button btn_sign_in1;
    Button btn_sign_in2;
    Button btn_sign_in3;
    Button btn_sign_in4;
    Button btn_sign_in5;
    Button btn_sign_in6;
    Button btn_sign_in7;
    Button btn_sign_in8;
    Button btn_sign_in9;
    Button btn_sign_in10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btn_new_account = findViewById(R.id.btn_new_account);
        btn_sign_in1 = findViewById(R.id.btn_sign_in1);
        btn_sign_in2 = findViewById(R.id.btn_sign_in2);
        btn_sign_in3 = findViewById(R.id.btn_sign_in3);
        btn_sign_in4 = findViewById(R.id.btn_sign_in4);
        btn_sign_in5 = findViewById(R.id.btn_sign_in5);
        btn_sign_in6 = findViewById(R.id.btn_sign_in6);
        btn_sign_in7 = findViewById(R.id.btn_sign_in7);
        btn_sign_in8 = findViewById(R.id.btn_sign_in8);
        btn_sign_in9 = findViewById(R.id.btn_sign_in9);
        btn_sign_in10 = findViewById(R.id.btn_sign_in10);

//        btn_new_account.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent gotregisterone = new Intent(SigninAct.this,RegisterOneAct.class);
//                startActivity(gotregisterone);
//            }
//        });

        btn_sign_in1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list1Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list2Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list3Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list4Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list5Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list6Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list7Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list8Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list9Act.class);
                startActivity(gotohome);
            }
        });

        btn_sign_in10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(SigninAct.this,list10Act.class);
                startActivity(gotohome);
            }
        });
    }
}
