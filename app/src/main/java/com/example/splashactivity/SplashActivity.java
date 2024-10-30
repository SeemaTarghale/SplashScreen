package com.example.splashactivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override  //Annotation
    protected void onCreate(Bundle savedInstanceState) {
        ImageView image;
        TextView text1,text2;
        Animation fadeInAnim;
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        setContentView(R.layout.activity_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        image=findViewById(R.id.logo);
        text1=findViewById(R.id.text);
        text2=findViewById(R.id.text2);
        fadeInAnim= AnimationUtils.loadAnimation(SplashActivity.this,R.anim.animation);
        image.setAnimation(fadeInAnim);
        text1.setAnimation(fadeInAnim);
        text2.setAnimation(fadeInAnim);
        Handler h;  //object declaration
        h=new Handler(); // object Initialization
        //Handler h=new Handler();     Shortcut
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this, LoginActivity.class);   //Alt+Enter
                startActivity(i);
                finish();
            }
        },4000);


    }

}