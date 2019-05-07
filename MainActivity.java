package com.example.aaris.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonplus, buttonmin, buttonmul, buttondiv, buttoneq;
    EditText editText1, editText2;
    Float val1, val2, fin;
    Boolean plus=false, min=false, mul=false, div=false;
    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonplus= findViewById(R.id.buttonplus);
        buttonmin = findViewById(R.id.buttonmin);
        buttonmul = findViewById(R.id.buttonmul);
        buttondiv = findViewById(R.id.buttondiv);
        buttoneq  = findViewById(R.id.buttoneq);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        TV        = findViewById(R.id.TV);

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus= true;
                val1= Float.parseFloat(editText1.getText() + "");
                val2= Float.parseFloat(editText2.getText() + "");
            }
        });
        buttonmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min=true;
                val1= Float.parseFloat(editText1.getText() +"");
                val2= Float.parseFloat(editText2.getText() +"");
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mul=true;
                val1= Float.parseFloat(editText1.getText() +"");
                val2= Float.parseFloat(editText2.getText()+"");
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div=true;
                val1= Float.parseFloat(editText1.getText()+"");
                val2= Float.parseFloat(editText2.getText()+"");
            }
        });
        buttoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus==true)
                {fin=val1+val2; plus=false; TV.setText(fin+"");}
                else if (min==true)
                {fin=val1-val2; min=false; TV.setText(fin+"");}
                else if (mul==true)
                {fin=val1*val2; mul=false; TV.setText(fin+"");}
                else if (div==true)
                {fin=val1/val2; div=false; TV.setText(fin+"");}

            }
        });
    }
}
