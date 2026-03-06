package com.henriquefarisco.guiadeestudos;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TermsActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        EdgeToEdgeHelper.apply(this, R.id.main);

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        boolean termsAccepted = sharedPreferences.getBoolean("terms_accepted", false);

        if (!termsAccepted) {
            showTermsDialog();
        } else {
            goToMainActivity();
        }
    }

    private void showTermsDialog() {
        CardView acceptButton = findViewById(R.id.view);
        acceptButton.setOnClickListener(v -> {
            Animation brilho = AnimationUtils.loadAnimation(TermsActivity.this, R.anim.brilho_botao);
            acceptButton.startAnimation(brilho);

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("terms_accepted", true);
            editor.apply();

            acceptButton.postDelayed(this::goToMainActivity, 200);
        });
    }

    private void goToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
