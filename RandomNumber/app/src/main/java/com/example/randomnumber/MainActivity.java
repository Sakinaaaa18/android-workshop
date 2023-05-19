package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        tv1 =(TextView) findViewById(R.id.tv);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override

                    public void onClick(View v) {
                        Random r=new Random();
                        int num = r.nextInt(100) +1;
                        String random_number=String.valueOf(num);
                        tv1.setText(random_number);
                    }

                });
    }
}