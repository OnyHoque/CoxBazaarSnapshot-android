package com.example.onyho.coxsbazaarsnapshot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class funding_status extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funding_status);

        ImageView img = findViewById(R.id.imageView);
        ImageView img22 = findViewById(R.id.imageView22);
        ImageView img23 = findViewById(R.id.imageView23);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fts.unocha.org/appeals/656/summary"));
                startActivity(browserIntent);
            }
        });

        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),aims_funds.class);
                startActivity(intent);
            }
        });

        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/sh/jp8e1mbqra7vmvs/AADNlauaKsOt69g9ml3rWrWja?dl=0"));
                startActivity(browserIntent);
            }
        });
    }
}
