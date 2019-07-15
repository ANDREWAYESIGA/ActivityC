package com.example.activityc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Browser(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://andela.com/alc/"));
        startActivity(intent);
    }
    public void myprofile(View v){
        Intent i =new Intent(this,myprofile.class);
        startActivity(i);
    }
}
