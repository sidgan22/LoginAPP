package com.tfllab.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Form extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    RadioButton r1,r2,r3;
    Button b1;
    Spinner s1;
    String getName,getAge,getCourse,getSex,getCollege,getEmail,getPhone;

    String c[] = {"Engineering","Arts","Medicine","Commerce","Architecture"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        e1=findViewById(R.id.name);
        e2=findViewById(R.id.email);
        e3=findViewById(R.id.nos);
        e4=findViewById(R.id.age);
        e5=findViewById(R.id.clg);

        r1=findViewById(R.id.g1);
        r2=findViewById(R.id.g2);
        r3=findViewById(R.id.g3);

        b1=findViewById(R.id.sb);

        s1=findViewById(R.id.crs);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,c);
        s1.setAdapter(arrayAdapter);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                getCourse=c[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=e1.getText().toString();
                getEmail=e2.getText().toString();
                getPhone=e3.getText().toString();
                getAge=e4.getText().toString();
                getCollege=e5.getText().toString();
                if(r1.isChecked())
                {
                    getSex="Male";
                }
                else if(r2.isChecked())
                {
                    getSex="Female";
                }
                else if(r3.isChecked())
                {
                    getSex="Transgender";
                }
                else
                {
                    r3.setError("Select a gender");
                    r2.setError("Select a gender");
                    r1.setError("Select a gender");
                }

                Intent intent = new Intent(Form.this, Demo.class);
                intent.putExtra("gname",""+getName);
                intent.putExtra("gage",""+getAge);
                intent.putExtra("gmail",""+getEmail);
                intent.putExtra("gph",""+getPhone);
                intent.putExtra("ggen",""+getSex);
                intent.putExtra("gcrs",""+getCourse);
                intent.putExtra("gcol",""+getCollege);
                startActivity(intent);
            }
        });


    }
}
