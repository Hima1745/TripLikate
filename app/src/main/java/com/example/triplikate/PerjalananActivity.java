package com.example.triplikate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PerjalananActivity extends AppCompatActivity {
    public ImageView akun;
    public ImageView pindahJalanDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perjalanan);

        akun = findViewById(R.id.imageView24);
        akun .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent akunn = new Intent(getApplicationContext(), AkunActivity.class);
                startActivity(akunn);
            }
        });

    }
}