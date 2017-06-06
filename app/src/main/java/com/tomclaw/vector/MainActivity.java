package com.tomclaw.vector;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ImageView> imageViews = new ArrayList<>();

        imageViews.add((ImageView) findViewById(R.id.image1));
        imageViews.add((ImageView) findViewById(R.id.image2));
        imageViews.add((ImageView) findViewById(R.id.image3));

        animateImageViews(imageViews);
    }

    private void animateImageViews(List<ImageView> imageViews) {
        for (ImageView imageView : imageViews) {
            animateImageView(imageView);
        }
    }

    private void animateImageView(ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = ((Animatable) drawable);
            animatable.start();
        }
    }
}
