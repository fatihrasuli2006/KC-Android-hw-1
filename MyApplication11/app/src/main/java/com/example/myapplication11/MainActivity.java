package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText Ed1 = findViewById(R.id.ET1);
        EditText Ed2 = findViewById(R.id.ET2);
        EditText Ed3 = findViewById(R.id.ET3);
        EditText Ed4 = findViewById(R.id.ET4);
        Button b = findViewById(R.id.calculate);
        TextView t = findViewById(R.id.result);



        b.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View View) {

                int num1 = Integer.parseInt(Ed1.getText().toString());
                int num2 = Integer.parseInt(Ed2.getText().toString());
                int num3 = Integer.parseInt(Ed3.getText().toString());
                int num4 = Integer.parseInt(Ed4.getText().toString());

                int result = num1 + num2 + num3 + num4;

                t.setText(String.valueOf(result));

            }
        });
    }

    public void rest(View view) {
        EditText r1 = findViewById(R.id.ET1);
        EditText r2 = findViewById(R.id.ET2);
        EditText r3 = findViewById(R.id.ET3);
        EditText r4 = findViewById(R.id.ET4);
        r1.getText().clear();
        r2.getText().clear();
        r3.getText().clear();
        r4.getText().clear();
    }
}