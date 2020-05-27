package com.chunleedev.fuoyegp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HelpActivity extends AppCompatActivity {

    Toolbar toolbar3;
    TextView email, whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        toolbar3 = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        email = findViewById(R.id.email);
        whatsapp = findViewById(R.id.whatsapp);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToGMailz();
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToWhatsappz();
            }
        });

    }

    private void sendToWhatsappz() {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/2348145285552?text=Purpose:%20Fuoye%20GP:%20")));
    }

    private void sendToGMailz() {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "iamcodebusy@gmail.com"));
            intent.putExtra(Intent.EXTRA_TEXT, "Fuoye GP");
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("gmail.com")));
            e.printStackTrace();
        }
    }
}
