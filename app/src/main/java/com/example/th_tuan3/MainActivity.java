package com.example.th_tuan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpenChild=(Button)
        findViewById(R.id.backtoMain);
        btnOpenChild.setOnClickListener(new
       View.OnClickListener() {
           public void onClick(View arg0) {
               doOpenChildActivity();
           }
       });
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(this, ChildActivity.class);
        startActivity(myIntent);
    }
}
