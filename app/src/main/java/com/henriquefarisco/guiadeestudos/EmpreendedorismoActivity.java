package com.henriquefarisco.guiadeestudos;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class EmpreendedorismoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empreendedorismo);
        EdgeToEdgeHelper.apply(this, R.id.main);

        ImageView imageView = findViewById(R.id.view);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);

        CardView btnMarketingBasico = findViewById(R.id.marketing_digital_button);
        btnMarketingBasico.setOnClickListener(v ->
                abrirLink("https://sebrae.com.br/sites/PortalSebrae/cursosonline/"));

        CardView btnFundamentosBasico = findViewById(R.id.fundamentos_basicos_negocios);
        btnFundamentosBasico.setOnClickListener(v ->
                abrirLink("https://sebrae.com.br/sites/PortalSebrae/cursosonline/"));

        CardView btnSkillsParaLiderarBasico = findViewById(R.id.skills_para_liderar_button);
        btnSkillsParaLiderarBasico.setOnClickListener(v ->
                abrirLink("https://sebrae.com.br/sites/PortalSebrae/cursosonline/"));

        CardView btnComunicacaoEmpresarialBasico = findViewById(R.id.comunicacao_empresarial);
        btnComunicacaoEmpresarialBasico.setOnClickListener(v ->
                abrirLink("https://www.ev.org.br/cursos/comunicacao-empresarial"));
    }

    private void abrirLink(String url) {
        LinkNavigationHelper.openUrl(this, url);
    }
}
