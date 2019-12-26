package com.to.aboomy.bannersample;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.to.aboomy.statusbar_lib.StatusBarUtil;

/**
 * auth aboom
 * date 2019-08-27
 */
public class LunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        StatusBarUtil.setStatusBarColor(this, Color.WHITE);

        findViewById(R.id.view1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LunchActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.view2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LunchActivity.this, IndicatorStyleActivity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.view3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LunchActivity.this, RecyclerActivity.class);
                startActivity(i);
            }
        });
    }
}
