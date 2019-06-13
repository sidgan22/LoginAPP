package com.tfllab.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e1,e2;
        Button b1;
        e1=findViewById(R.id.uname);
        e2=findViewById(R.id.pass);
        b1=findViewById(R.id.log);
        final String un="sid",pa="123";
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("sid");e2.setText("123");
                String u=e1.getText().toString();
                String p=e2.getText().toString();
                if(u.equals(un))
                {
                    if(p.equals(pa))
                    {
                        Intent intent = new Intent(MainActivity.this,Form.class);
                        startActivity(intent);
                    }
                        else {
                        e1.setError("Wrong Username/Password");
                        e2.setError("Wrong Username/Password");
                    }
                }
                else
                {
                    e1.setError("Wrong Username/Password");
                    e2.setError("Wrong Username/Password");
                }
            }
        });
    }

}
