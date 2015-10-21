package net.qiujuer.powerback.ankey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import net.qiujuer.powerback.ankey.ui.SuperActivity;

public class MainActivity extends SuperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text_hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CreateActivity.class));
            }
        });
    }

    protected String getTitleFont() {
        return "fonts/Lobster.otf";
    }
}
