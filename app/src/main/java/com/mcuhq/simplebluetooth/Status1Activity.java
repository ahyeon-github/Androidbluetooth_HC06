package com.mcuhq.simplebluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Status1Activity extends AppCompatActivity {

    Button gohome;

    ConnectedThread mConnectedThread = ((MeasureActivity)MeasureActivity.context_main).mConnectedThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status1);

        gohome = (Button) findViewById(R.id.status_gohome_btn);

        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mConnectedThread != null)
                    mConnectedThread.write("2");

                Intent intent = new Intent(getApplicationContext(), MeasureActivity.class);
                startActivity(intent);
            }
        });
    }
}
