package com.henriquefarisco.guiadeestudos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        boolean termsAccepted = prefs.getBoolean("terms_accepted", false);
        if (!termsAccepted) {
            startActivity(new Intent(MainActivity.this, TermsActivity.class));
            finish();
            return;
        }

        setContentView(R.layout.activity_main);
        EdgeToEdgeHelper.apply(this, R.id.main);

        ImageView imageView = findViewById(R.id.view);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);

        CardView btnTecnologia = findViewById(R.id.tec_main);
        CardView btnIdiomas = findViewById(R.id.idiomas_main);
        CardView catalogButton = findViewById(R.id.catalog_button);
        CardView iaButton = findViewById(R.id.ia_button);
        CardView admButton = findViewById(R.id.administrativo_button);
        CardView sobreButton = findViewById(R.id.sobre_button);
        CardView empreendedorismoButton = findViewById(R.id.empreendedorismo_button);

        btnTecnologia.setOnClickListener(v -> iniciarActivity(TecnologiaActivity.class));
        admButton.setOnClickListener(v -> iniciarActivity(AdministracaoActivity.class));
        btnIdiomas.setOnClickListener(v -> iniciarActivity(IdiomasActivity.class));
        catalogButton.setOnClickListener(v -> iniciarActivity(CatalogoActivity.class));
        iaButton.setOnClickListener(v -> iniciarActivity(IAActivity.class));
        sobreButton.setOnClickListener(v -> abrirSite());
        empreendedorismoButton.setOnClickListener(v -> iniciarActivity(EmpreendedorismoActivity.class));
    }

    private void iniciarActivity(Class<?> activity) {
        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }

    private void abrirSite() {
        LinkNavigationHelper.openUrl(this, "https://www.henriquefarisco.com.br/pt-br/sobre/");
    }
}
