package com.arqdsis.servicedeskccan3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class DetalhesChamadosActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_chamados);
        TextView nome = (TextView)findViewById(R.id.chamado_selecionado);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(ListarChamadosActivity.DESCRICAO));
    }
}