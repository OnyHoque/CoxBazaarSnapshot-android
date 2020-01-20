package com.example.onyho.coxsbazaarsnapshot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cloud_drive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_drive);

        ImageView img10 = findViewById(R.id.imageView10);

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B2OGQevgsCT_TW5jcjN6S2prUUFVNzR2UVBEa1h5cWFNODVv"));
                startActivity(browserIntent);
            }
        });
    }
}
