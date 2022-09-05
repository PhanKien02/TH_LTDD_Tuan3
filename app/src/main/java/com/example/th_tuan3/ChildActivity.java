package com.example.th_tuan3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Button btnBacktoMaini= (Button)
                findViewById(R.id.backtoMain);
        btnBacktoMaini.setOnClickListener(new
       View.OnClickListener() {
           public void onClick(View v) {
               finish();
           }
       });
    }
    }