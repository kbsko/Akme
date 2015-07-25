package com.dev.mobile.akme;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Kubish on 25.07.2015.
 */
public class PreTestActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_test_activity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TextView tvDisplay = (TextView)findViewById(R.id.textView4);
        Linkify.addLinks(tvDisplay, Linkify.ALL);

    }

    public void  startTest(View v){
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }

}
