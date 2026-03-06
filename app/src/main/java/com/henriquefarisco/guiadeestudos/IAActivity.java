package com.henriquefarisco.guiadeestudos;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class IAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iaactivity);
        EdgeToEdgeHelper.apply(this, R.id.main);

        ImageView imageView = findViewById(R.id.view);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);

        CardView chatOpenaiButton = findViewById(R.id.gpt_button);
        chatOpenaiButton.setOnClickListener(v ->
                LinkNavigationHelper.openUrl(this, "https://chatgpt.com/"));

        CardView blackBoxButton = findViewById(R.id.blackbox_button);
        blackBoxButton.setOnClickListener(v ->
                LinkNavigationHelper.openUrl(this, "https://www.blackbox.ai/"));

        CardView sunoAiButton = findViewById(R.id.sunoai_button);
        sunoAiButton.setOnClickListener(v ->
                LinkNavigationHelper.openUrl(this, "https://www.suno.ai/"));

        CardView geminiGoogleButton = findViewById(R.id.geminiai_button);
        geminiGoogleButton.setOnClickListener(v ->
                LinkNavigationHelper.openUrl(this, "https://gemini.google.com/"));

        CardView opusClipButton = findViewById(R.id.opus_button);
        opusClipButton.setOnClickListener(v ->
                LinkNavigationHelper.openUrl(this, "https://www.opus.pro/"));

        CardView interViewerButton = findViewById(R.id.interviewer_button);
        interViewerButton.setOnClickListener(v ->
                LinkNavigationHelper.openUrl(this, "https://interviewer.ai/candidates/"));
    }
}
