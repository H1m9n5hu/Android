package com.himanshu.cookies;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        displayImage();
        displayText();
    }

    private void displayImage () {
        ImageView image = ( ImageView ) findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.after_cookie);
    }

    private void displayText() {
        TextView text = ( TextView ) findViewById( R.id.status_text_view );
        text.setText ( "I'm so full");
    }
}