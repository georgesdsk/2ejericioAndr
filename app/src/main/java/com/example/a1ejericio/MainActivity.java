package com.example.a1ejericio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @SuppressLint("ResourceAsColor")
    private  void cambiarColores(View view){

        editText = (EditText) findViewById(R.id.entradaTexto);
        String mensaje = editText.getText().toString();
        textView.findViewById(R.id.salidaTexto);
        textView.setText(mensaje);

        switch (view.getId()){
            case R.id.btn1:
                textView.setTextColor(R.color.purple_200);
            case R.id.btn2:
                textView.setTextColor(R.color.purple_500);
            case R.id.btn3:
                textView.setTextColor(R.color.purple_700);

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
}