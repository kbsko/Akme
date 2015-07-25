package com.dev.mobile.akme;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void onArticles(View v) {
        Intent intent = new Intent(this, ArticleActivity.class);
        startActivity(intent);
    }

    public void onTest(View v) {
        Intent intent = new Intent(this, PreTestActivity.class);
        startActivity(intent);
    }


}
