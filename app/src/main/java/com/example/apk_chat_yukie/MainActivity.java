package com.example.apk_chat_yukie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String KONTAK = "NAMA" ;
    private TextView PENERIMA ;
    public static final int TEXT_REQUEST=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pageAndi(View view) {
        Intent page1 = new Intent(MainActivity.this, halamanKirim.class);
        page1.putExtra(KONTAK, "Andi");
        startActivity(page1);
    }

    public void pageJoko(View view) {
        Intent page1 = new Intent(MainActivity.this, halamanKirim.class);
        page1.putExtra(KONTAK, "Joko");
        startActivity(page1);
    }

    public void pageDewi(View view) {
        Intent page1 = new Intent(MainActivity.this, halamanKirim.class);
        page1.putExtra(KONTAK, "Dewi");
        startActivity(page1);
    }
}