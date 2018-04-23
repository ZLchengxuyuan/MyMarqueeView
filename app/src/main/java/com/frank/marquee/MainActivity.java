package com.frank.marquee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarqueeLayout marqueeLayout = (MarqueeLayout) findViewById(R.id.mar);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        marqueeLayout.start();
        tv1.setVisibility(tv1.getTranslationY() == 0 ? View.VISIBLE : View.GONE);
        tv2.setVisibility(tv2.getTranslationY() == 0 ? View.VISIBLE : View.GONE);

    }
}
