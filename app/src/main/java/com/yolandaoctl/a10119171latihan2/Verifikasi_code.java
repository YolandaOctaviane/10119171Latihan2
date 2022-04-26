package com.yolandaoctl.a10119171latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

    //25 April 2022 10119171 Yolanda Octaviane IF5
public class Verifikasi_code extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verifikasi_code);
    }

    public void send (View view) {
        Intent intent = new Intent(this, user.class);
        startActivity(intent);
    }
}
