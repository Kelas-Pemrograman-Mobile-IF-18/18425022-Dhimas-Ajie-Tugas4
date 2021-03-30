package com.dhimas.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class halaman2 extends AppCompatActivity {

    @BindView(R.id.TxtNama)
    TextView TxtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        ButterKnife.bind(this);

        Intent i = getIntent();
        String nama = i.getStringExtra( "nama");
        TxtNama.setText(nama);
    }
}