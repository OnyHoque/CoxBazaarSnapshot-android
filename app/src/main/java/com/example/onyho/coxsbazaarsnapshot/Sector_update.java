package com.example.onyho.coxsbazaarsnapshot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sector_update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sector_update);

        ImageView img12 = findViewById(R.id.imageView12);
        ImageView img13 = findViewById(R.id.imageView13);
        ImageView img14 = findViewById(R.id.imageView14);
        ImageView img15 = findViewById(R.id.imageView15);
        ImageView img16 = findViewById(R.id.imageView16);
        ImageView img17 = findViewById(R.id.imageView17);
        ImageView img18 = findViewById(R.id.imageView18);
        ImageView img19 = findViewById(R.id.imageView19);
        ImageView img20 = findViewById(R.id.imageView20);

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/bszpp4ev552gov5"));
                startActivity(browserIntent);
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/wmpsj6noe74dkqj"));
                startActivity(browserIntent);
            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/4yux4acmv31ka7b"));
                startActivity(browserIntent);
            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/kfd0l01gdsnu99b"));
                startActivity(browserIntent);
            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/bqce730ip5ktg2t"));
                startActivity(browserIntent);
            }
        });

        img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/pcp6cwzxbqcz8cb"));
                startActivity(browserIntent);
            }
        });

        img18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/j6p12aakgeeomkk"));
                startActivity(browserIntent);
            }
        });

        img19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/yp71h60vkp1gu5a"));
                startActivity(browserIntent);
            }
        });

        img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/g2h1ehbcn0bmga3"));
                startActivity(browserIntent);
            }
        });
    }
}
