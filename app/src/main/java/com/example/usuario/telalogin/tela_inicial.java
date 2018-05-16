package com.example.usuario.telalogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tela_inicial extends Activity implements Runnable {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        Handler handler = new Handler();
        handler.postDelayed(this, 2000);
    }

    public void run(){
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
