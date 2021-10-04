package com.example.a1ejericio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    EditText editText;
    Button btn1;
    Button btn2;
    Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // editText = (EditText) findViewById(R.id.entradaTexto);
        editText = findViewById(R.id.entradaTexto);
        textView = findViewById(R.id.salidaTexto);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);


        /*
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = editText.getText().toString();
                textView.setText(mensaje);
                textView.setTextColor(R.color.black);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = editText.getText().toString();
                textView.setText(mensaje);
                textView.setTextColor(R.color.teal_700);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = editText.getText().toString();
                textView.setText(mensaje);
                textView.setTextColor();
            }
        });

     */
        btn3.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
/*
        btn3.setOnClickListener(x -> cambiarColores(btn3));
        btn1.setOnClickListener(this::cambiarColores);
        btn2.setOnClickListener(x -> cambiarColores(btn2));
*/


    }


    private void cambiarColores(View view) {

        String mensaje = editText.getText().toString();
        textView.setText(mensaje);

        switch (view.getId()) {
            case (R.id.btn1): {
                //textView.setTextColor(R.color.white);
                //textView.setTextColor(getResources().getColor(R.color.white));
                textView.setTextColor(Color.parseColor("white"));
            }

            case (R.id.btn2): {
                textView.setBackgroundColor(getResources().getColor(R.color.black));
            }

            case (R.id.btn3): {
                textView.setTextColor(Color.parseColor("blue"));
            }
        }



        /*
        TextView textView = (TextView) findViewById(R.id.texto);
        String[] parts = mensaje.split(Pattern.quote("+"));
        String part1 = parts[0];
        String part2 = parts[1];
        double suma = Integer.parseInt(part1) + Integer.parseInt(part2);

        textView.setText(mensaje);
       */


    }

    @Override
    public void onClick(View view) { // como si todos los botones fueran iguales y se pulsaran a la vez

        String mensaje = editText.getText().toString();
        textView.setText(mensaje);

        switch (view.getId()) {
            case (R.id.btn1): {
                //textView.setTextColor(R.color.white);
                //textView.setTextColor(getResources().getColor(R.color.white));
                textView.setTextColor(Color.parseColor("white"));
            }

            case (R.id.btn2): {
                textView.setBackgroundColor(getResources().getColor(R.color.black));
            }

            case (R.id.btn3): {
                textView.setTextColor(Color.parseColor("blue"));
            }
        }


    }
}
