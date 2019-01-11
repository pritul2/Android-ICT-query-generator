package com.example.pritul.ictquerygenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Information extends AppCompatActivity {

    TextView Name;
    TextView Info;
    ImageView Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Name = (TextView) findViewById(R.id.info_name);
        Image = (ImageView) findViewById(R.id.info_image);
        Info = (TextView) findViewById(R.id.info_information);

        Bundle extras = getIntent().getExtras();
        String info = extras.getString("Info");
        String name = extras.getString("Name");
        String image = extras.getString("Image");


        Name.setText(name.toUpperCase());
        Info.setText(info);
        Glide.with(getApplicationContext()).load(image).into(Image);


    }
}
