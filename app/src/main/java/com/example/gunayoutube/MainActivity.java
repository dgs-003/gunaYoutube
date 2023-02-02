package com.example.gunayoutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button btnPlaySingle=(Button) findViewById(R.id.btnPlaySingle);
        Button btnStandalone=(Button) findViewById(R.id.btnStandalone);
        btnStandalone.setOnClickListener(this);
        btnPlaySingle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()) {


            case R.id.btnPlaySingle:
                intent=new Intent(this,YoutubeActivity.class);
        break;
            case R.id.btnStandalone:
                intent=new Intent(this,Standalone.class);
        }
        if(intent!=null)
        {
            startActivity(intent);
        }
    }
}