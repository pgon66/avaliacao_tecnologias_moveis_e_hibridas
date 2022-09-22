package com.example.exibetriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextLadoUm;
    private EditText editTextLadoDois;
    private EditText editTextLadoTres;
    private EditText editTextResultado;
    private Button buttonResultado;
    private ImageView triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLadoUm = findViewById(R.id.editTextLadoUm); //localiza o id do widget.
        editTextLadoDois = findViewById(R.id.editTextLadoDois); //localiza o id do widget.
        editTextLadoTres = findViewById(R.id.editTextLadoTres); //localiza o id do widget.
        editTextResultado = findViewById(R.id.editTextResultado); //localiza o id do widget.
        buttonResultado = (Button) findViewById(R.id.buttonExibir); //localiza o id do widget.
        triangulo = findViewById(R.id.imageView); //localiza o id do widget.
        buttonResultado.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int valor1 = Integer.parseInt(editTextLadoUm.getText().toString()); //Passa o valor do campo para a variável.
        int valor2 = Integer.parseInt(editTextLadoDois.getText().toString()); //Passa o valor do campo para a variável.
        int valor3 = Integer.parseInt(editTextLadoTres.getText().toString()); //Passa o valor do campo para a variável.

        if (valor1 == valor2 && valor2 == valor3) {
            editTextResultado.setText("Triângulo Equilátero");
            triangulo.setImageResource(R.drawable.triangulo_equilatero);
        } else {
            if ((valor1 == valor2) || (valor1 == valor3) || (valor2 == valor3)) {
                editTextResultado.setText("Triângulo Isosceles");
                triangulo.setImageResource(R.drawable.triangulo_isoceles);
            } else {
                if ((valor1 != valor2) && (valor1 != valor3) && (valor2 != valor3)) {
                    editTextResultado.setText("Triângulo Escaleno");
                    triangulo.setImageResource(R.drawable.triangulo_escaleno);
                }
            }
        }
    }
}