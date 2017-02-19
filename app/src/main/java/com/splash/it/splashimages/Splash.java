package com.splash.it.splashimages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashinten = new Intent(Splash.this , MainActivity.class);
                Splash.this.startActivity(splashinten);
                Splash.this.finish();

            }
        } ,SPLASH_TIME_OUT);
    }


}
