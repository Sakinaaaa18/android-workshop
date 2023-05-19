package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText et_name;
    private TextView tv_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        et_name = (EditText)  findViewById(R.id.et_name);
        tv_name = (TextView)  findViewById(R.id.tv_text);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                if (name.length() > 0){
                    tv_name.setText("Hello " + name +"! Welcome to GVP");
                }else{
                    Toast toast=Toast.makeText(getApplicationContext(),"Text is empty",Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });


    }
}