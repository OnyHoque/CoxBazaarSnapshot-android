package com.example.onyho.coxsbazaarsnapshot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class contact_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        ImageView img31 = findViewById(R.id.imageView31);
        ImageView img32 = findViewById(R.id.imageView32);
        ImageView img33 = findViewById(R.id.imageView33);

        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/89qduag39d484br/SECTOR%20CONTACTS.xlsx?dl=0"));
                startActivity(browserIntent);
            }
        });

        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17W-iia44qpfOC-MyQhhTiNkkKlFaR4ES/view?pli=1"));
                startActivity(browserIntent);
            }
        });

        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "123456789"));
                startActivity(intent);
            }
        });

    }
}
