package com.example.tugasmob2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URISyntaxException;

public class DetailActivity extends AppCompatActivity {

    public static final String datanama="datanama";
    public static final String datadeskripsi="datadeskripsi";
    public static final String dataharga="dataharga";
    public static final String datagambar="datagambar";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvnama = findViewById(R.id.tv_nama);
        TextView tvharga = findViewById(R.id.tv_harga);
        TextView tvdeskripsi = findViewById(R.id.tv_deskripsi);
        ImageView ivgambar = findViewById(R.id.iv_gambar);
        Button btnbeli = findViewById(R.id.btn_beli);


        tvnama.setText(getIntent().getStringExtra(datanama));
        tvdeskripsi.setText(getIntent().getStringExtra(datadeskripsi));
        tvharga.setText(getIntent().getStringExtra(dataharga));
        ivgambar.setImageResource(getIntent().getIntExtra(datagambar,0));


    }

}
