package com.example.triplikate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PenawaranActivity extends AppCompatActivity {
    public ImageView pindahJalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penawaran);

        pindahJalan = findViewById(R.id.imageView16);
        pindahJalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jalan = new Intent(getApplicationContext(), PerjalananActivity.class);
                startActivity(jalan);
            }
        });
    }
}