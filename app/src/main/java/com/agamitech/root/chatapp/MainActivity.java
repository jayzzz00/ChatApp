package com.agamitech.root.chatapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnchating;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        btnchating = (Button) findViewById(R.id.btnChating);

        btnchating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchintent = new Intent(context, ChatPage.class);
                startActivity(switchintent);

            }
        });

    }
}
