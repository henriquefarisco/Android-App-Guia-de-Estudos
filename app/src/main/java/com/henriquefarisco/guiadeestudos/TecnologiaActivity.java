package com.henriquefarisco.guiadeestudos;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TecnologiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnologia);
        EdgeToEdgeHelper.apply(this, R.id.main);

        ImageView imageView = findViewById(R.id.view);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);

        CardView btnInformaticaBasica = findViewById(R.id.basic_tech);
        btnInformaticaBasica.setOnLongClickListener(view -> {
            Toast.makeText(this, R.string.basic_tech_txt, Toast.LENGTH_LONG).show();
            return true;
        });
        btnInformaticaBasica.setOnClickListener(view ->
                LinkNavigationHelper.openUrl(this, "https://www.ev.org.br/trilhas-de-conhecimento/primeiros-passos-em-tecnologia"));

        CardView basicProgrammingButton = findViewById(R.id.basic_programming);
        basicProgrammingButton.setOnLongClickListener(view -> {
            Toast.makeText(this, R.string.basic_programming_txt, Toast.LENGTH_LONG).show();
            return true;
        });
        basicProgrammingButton.setOnClickListener(view ->
                LinkNavigationHelper.openUrl(this, "https://www.ev.org.br/trilhas-de-conhecimento/linguagem-de-programacao-python"));

        CardView basicofficeButton = findViewById(R.id.office_button);
        basicofficeButton.setOnLongClickListener(view -> {
            Toast.makeText(this, R.string.basic_office_txt, Toast.LENGTH_LONG).show();
            return true;
        });
        basicofficeButton.setOnClickListener(view ->
                LinkNavigationHelper.openUrl(this, "https://www.ev.org.br/trilhas-de-conhecimento/pacote-office-2016"));
    }
}
