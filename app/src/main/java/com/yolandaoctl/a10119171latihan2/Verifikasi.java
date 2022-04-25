package com.yolandaoctl.a10119171latihan2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

//25 April 2022 10119171 Yolanda Octaviane IF5
public class Verifikasi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verifikasi);
    }

    public void verify (View view) {
        Intent intent = new Intent(this, Verifikasi_code.class);
        startActivity(intent);
    }
}
