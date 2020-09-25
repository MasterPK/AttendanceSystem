package com.masterpk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.masterpk.lib.ApiConnector;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    private Integer counter=0;
    private ApiConnector apiConnector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        ApiConnector apiConnector = new ApiConnector("192.168.1.102");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(counter.toString());
                counter++;
            }
        });
    }

}