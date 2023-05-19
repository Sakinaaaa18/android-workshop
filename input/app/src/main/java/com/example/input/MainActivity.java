package com.example.input;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        edt = (EditText) findViewById(R.id.edt);
        btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = et_name.getText().toString();
                    Intent
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