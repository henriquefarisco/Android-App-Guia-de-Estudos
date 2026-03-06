package com.henriquefarisco.guiadeestudos;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public final class LinkNavigationHelper {

    private static final String PERSONALIZED_COURSES_URL =
            "https://www.henriquefarisco.com.br/pt-br/cursos/";

    private LinkNavigationHelper() {
    }

    public static void openUrl(AppCompatActivity activity, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException exception) {
            Toast.makeText(activity, R.string.browser_not_found, Toast.LENGTH_SHORT).show();
        }
    }

    public static void showCoursePortalNotice(AppCompatActivity activity, String url) {
        showCoursePortalNotice(activity, url, R.string.course_portal_notice_message);
    }

    public static void showCoursePortalNotice(
            AppCompatActivity activity,
            String url,
            int messageResId
    ) {
        new AlertDialog.Builder(activity)
                .setTitle(R.string.course_portal_notice_title)
                .setMessage(messageResId)
                .setPositiveButton(R.string.course_portal_open_link,
                        (dialog, which) -> openUrl(activity, url))
                .setNeutralButton(R.string.course_portal_open_recommendations,
                        (dialog, which) -> openUrl(activity, PERSONALIZED_COURSES_URL))
                .setNegativeButton(android.R.string.cancel, null)
                .show();
    }
}
