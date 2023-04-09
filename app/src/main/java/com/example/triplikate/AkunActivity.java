package com.example.triplikate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AkunActivity extends AppCompatActivity {
    public ImageView beranda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        beranda = findViewById(R.id.imageView32);
        beranda .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent branda = new Intent(getApplicationContext(), ConstActivity.class);
                startActivity(branda);
            }
        });
    }
}