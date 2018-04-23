package com.frank.marquee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;

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


        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });


    }
}
