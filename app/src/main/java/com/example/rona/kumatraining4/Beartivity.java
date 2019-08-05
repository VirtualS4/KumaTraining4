package com.example.rona.kumatraining4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Beartivity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity);
        initEvent();
    }
    public void Hitung(){
        int angka1 = Integer.parseInt(((EditText) findViewById(R.id.angka1)).getText().toString());
        int angka2 = Integer.parseInt(((EditText) findViewById(R.id.angka2)).getText().toString());
        ((EditText) findViewById(R.id.hasil)).setText((angka1+angka2)+"");
    }
    private void initEvent(){
        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung();
            }
        });
    }

}
