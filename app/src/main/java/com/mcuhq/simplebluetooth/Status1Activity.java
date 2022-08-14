package com.mcuhq.simplebluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;

public class Status1Activity extends AppCompatActivity {

    Button gohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status1);

        gohome = (Button) findViewById(R.id.status_gohome_btn);

        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(mConnectedThread != null)
//                    mConnectedThread.write("2");

            }
        });
    }
}
