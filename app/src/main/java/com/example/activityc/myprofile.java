package com.example.activityc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class myprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        ImageView imageView=(ImageView) findViewById(R.id.imageView2);
        EditText editText=(EditText)findViewById(R.id.head);
        TextView textView1=(TextView)findViewById(R.id.email);
        TextView textView2=(TextView)findViewById(R.id.profile);
        TextView textView3 =(TextView)findViewById(R.id.username);
        TextView textView4=(TextView)findViewById(R.id.track);
        TextView textView5=(TextView)findViewById(R.id.country);
    }

}
