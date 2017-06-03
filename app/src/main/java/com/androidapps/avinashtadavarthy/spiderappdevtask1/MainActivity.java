package com.androidapps.avinashtadavarthy.spiderappdevtask1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout activity_main;
    Button btn;
    TextView text;
    int ct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
        btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view)
                                   {
                                       ct++;
                                       text.setText(String.valueOf(ct));
                                   }
                               }
        );

    }
}
