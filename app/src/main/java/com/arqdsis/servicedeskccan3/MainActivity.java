package com.arqdsis.servicedeskccan3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNome;
    public static final String NOME = "br.usjt.deswebmob.servicedesk.nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = findViewById(R.id.buscar_fila);
    }

    public void buscarChamados(View view){
        Intent intent = new Intent(this, ListarChamadosActivity.class);
        String nome= txtNome.getText().toString();
        intent.putExtra(NOME, nome);
        startActivity(intent);

    }
}
