package com.henriquefarisco.guiadeestudos;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AdministracaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administracao);
        EdgeToEdgeHelper.apply(this, R.id.main);

        ImageView imageView = findViewById(R.id.view);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);

        CardView btnAdministracaoBasica = findViewById(R.id.administracao_basica_button);
        CardView btnAprimoramentoProfissional = findViewById(R.id.aprimoramento_profissional_button);
        CardView btnComunicacaoOralEscrita = findViewById(R.id.comunicacao_oral_escrita_button);
        CardView btnFinancasBasicas = findViewById(R.id.financas_basicas_button);

        btnAdministracaoBasica.setOnClickListener(v ->
                abrirLink("https://www.ev.org.br/trilhas-de-conhecimento/administracao-no-seculo-21"));
        btnAprimoramentoProfissional.setOnClickListener(v ->
                abrirLink("https://www.ev.org.br/trilhas-de-conhecimento/aprimoramento-profissional"));
        btnComunicacaoOralEscrita.setOnClickListener(v ->
                abrirLink("https://www.ev.org.br/trilhas-de-conhecimento/inteligencia-emocional"));
        btnFinancasBasicas.setOnClickListener(v ->
                abrirLink("https://www.ev.org.br/trilhas-de-conhecimento/financas"));
    }

    private void abrirLink(String url) {
        LinkNavigationHelper.openUrl(this, url);
    }
}
