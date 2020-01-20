package com.example.onyho.coxsbazaarsnapshot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView img2 = findViewById(R.id.imageView2);
        ImageView img3 = findViewById(R.id.imageView3);
        ImageView img4 = findViewById(R.id.imageView4);
        ImageView img5 = findViewById(R.id.imageView5);
        ImageView img6 = findViewById(R.id.imageView6);
        ImageView img7 = findViewById(R.id.imageView7);
        ImageView img8 = findViewById(R.id.imageView8);
        ImageView img9 = findViewById(R.id.imageView9);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B2OGQevgsCT_NkVFLS1ObjBudDFYRC1adDNCT1FXVnFSaDNz"));
                startActivity(browserIntent);
            }
        });


        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/t2wn6kpgto5hafu"));
                startActivity(browserIntent);
            }
        });


        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B2OGQevgsCT_TW5jcjN6S2prUUFVNzR2UVBEa1h5cWFNODVv"));
                startActivity(browserIntent);
            }
        });


        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),funding_status.class);
                startActivity(intent);
            }
        });


        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),contact_list.class);
                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/sh/mvo4p4mfts05271/AACH6QGHSiBP4s5VPJFnLr_oa?dl=0"));
                startActivity(browserIntent);
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B2OGQevgsCT_MUR5dl9pZ2lMeGVhaGExTmpTa1VKY20tMDZv/view"));
                startActivity(browserIntent);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Sector_update.class);
                startActivity(intent);
            }
        });
    }
}
