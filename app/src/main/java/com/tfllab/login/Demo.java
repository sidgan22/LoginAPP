package com.tfllab.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Demo extends AppCompatActivity {

    TextView dis1,dis2,dis3,dis4,dis5,dis6,dis7;

    String getName,getAge,getCourse,getSex,getCollege,getEmail,getPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        dis1=findViewById(R.id.dis1);
        dis2=findViewById(R.id.dis2);
        dis3=findViewById(R.id.dis3);
        dis4=findViewById(R.id.dis4);
        dis5=findViewById(R.id.dis5);
        dis6=findViewById(R.id.dis6);
        dis7=findViewById(R.id.dis7);
        Intent intent = getIntent();
        getName=intent.getStringExtra("gname");
        getAge=intent.getStringExtra("gage");
        getPhone=intent.getStringExtra("gph");
        getCollege=intent.getStringExtra("gcol");
        getSex=intent.getStringExtra("ggen");
        getEmail=intent.getStringExtra("gmail");
        getCourse=intent.getStringExtra("gcrs");

        dis1.setText(":\t"+getName);
        dis2.setText(":\t"+getEmail);
        dis3.setText(":\t"+getPhone);
        dis4.setText(":\t"+getAge);
        dis5.setText(":\t"+getSex);
        dis6.setText(":\t"+getCourse);
        dis7.setText(":\t"+getCollege);

    }
}
