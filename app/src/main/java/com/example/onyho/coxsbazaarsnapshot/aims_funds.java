package com.example.onyho.coxsbazaarsnapshot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class aims_funds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aims_funds);

        ImageView img25 = findViewById(R.id.imageView25);
        ImageView img26 = findViewById(R.id.imageView26);
        ImageView img27 = findViewById(R.id.imageView27);
        ImageView img28 = findViewById(R.id.imageView28);
        ImageView img29 = findViewById(R.id.imageView29);

        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/llh7pvoscfe5mop/AIMS%20LINE.png?dl=0"));
                startActivity(browserIntent);
            }
        });

        img26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/cqnynv32wfzdzau/COMMITMENT.png?dl=0"));
                startActivity(browserIntent);
            }
        });

        img27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/qa5rd8c6ytykwfu/DISBURSEMENT.png?dl=0"));
                startActivity(browserIntent);
            }
        });

        img28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/hatm9olc1rnlvwu/AIMS%20PIE.png?dl=0"));
                startActivity(browserIntent);
            }
        });

        img29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/mj1h9gbljxdo600/EXPENDITURE.png?dl=0"));
                startActivity(browserIntent);
            }
        });
    }
}
