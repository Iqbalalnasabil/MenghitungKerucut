package com.example.menghitungkerucut;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnVolume;
    Button btnSelimut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ejarijari = (EditText) findViewById(R.id.Jarijari);
        EditText etinggi = (EditText) findViewById(R.id.Tinggi);
        EditText ejariselimut = (EditText) findViewById(R.id.Jariselimut);
        btnVolume = (Button) findViewById(R.id.btnVolume);
        btnSelimut = (Button) findViewById(R.id.btnSelimut);
        TextView tvvolume = (TextView) findViewById(R.id.hvolume);
        TextView tvselimut = (TextView) findViewById(R.id.hselimut);

        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ejarijari.length() == 0 || etinggi.length() == 0 || ejariselimut.length() == 0){
                    ejarijari.setError("MASUKKAN JARI-JARI !!");
                    etinggi.setError("MASUKKAN TINGGI !!");
                    ejariselimut.setError("MASUKKAN JARI-JARI SELIMUT !!");
                } else{
                    double r, t, volume;
                    r = Double.valueOf(ejarijari.getText().toString().trim());
                    t = Double.valueOf(etinggi.getText().toString().trim());

                    volume = (3.14 * r * r * t) / 3;
                    String hasil2 = String.valueOf(volume);
                    tvvolume.setText(hasil2);
                }
            }

        });
                btnSelimut.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (ejarijari.length() == 0 || etinggi.length() == 0 || ejariselimut.length() == 0){
                            ejarijari.setError("MASUKKAN JARI-JARI !!");
                            etinggi.setError("MASUKKAN TINGGI !!");
                            ejariselimut.setError("MASUKKAN JARI-JARI SELIMUT !!");
                        } else{
                            double r, s, luas;
                            r = Double.valueOf(ejarijari.getText().toString().trim());
                            s = Double.valueOf(ejariselimut.getText().toString().trim());
                            luas = (3.14 * r * s);
                            String hasil1 = String.valueOf(luas);

                            tvselimut.setText(hasil1);
                        }
                    }
            });
    }
}



