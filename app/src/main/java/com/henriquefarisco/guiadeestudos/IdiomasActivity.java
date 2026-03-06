package com.henriquefarisco.guiadeestudos;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class IdiomasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idiomas);
        EdgeToEdgeHelper.apply(this, R.id.main);

        ImageView imageView = findViewById(R.id.view);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);

        CardView basicEnglishButton = findViewById(R.id.basic_english);
        basicEnglishButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(
                        this,
                        "https://aprendamais.mec.gov.br/course/index.php",
                        R.string.idiomas_course_portal_notice_message
                ));

        CardView basicEspanishButton = findViewById(R.id.basic_espanhol);
        basicEspanishButton.setOnClickListener(v ->
                LinkNavigationHelper.showCoursePortalNotice(
                        this,
                        "https://aprendamais.mec.gov.br/course/index.php",
                        R.string.idiomas_course_portal_notice_message
                ));
    }
}
