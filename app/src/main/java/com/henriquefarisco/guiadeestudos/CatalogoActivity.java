package com.henriquefarisco.guiadeestudos;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CatalogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        EdgeToEdgeHelper.apply(this, R.id.main);

        ImageView imageView = findViewById(R.id.view);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);

        CardView fundBradescoButton = findViewById(R.id.fund_bradesco_button);
        fundBradescoButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(this, "https://www.ev.org.br/cursos"));

        CardView mecButton = findViewById(R.id.mec_button);
        mecButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(this, "https://aprendamais.mec.gov.br/course/index.php"));

        CardView fgvButton = findViewById(R.id.fgv_button);
        fgvButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(this, "https://educacao-executiva.fgv.br/cursos/gratuitos"));

        CardView cieeButton = findViewById(R.id.ciee_button);
        cieeButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(this, "https://sabervirtual.ciee.org.br/"));

        CardView sebraeButton = findViewById(R.id.sebrae_button);
        sebraeButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(this, "https://sebrae.com.br/sites/PortalSebrae/cursosonline"));

        CardView ifrsButton = findViewById(R.id.ifrs_button);
        ifrsButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(this, "https://moodle.ifrs.edu.br/course/index.php"));
    }
}
