package com.example.gpr_cossucala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        CharSequence text = "@string/BtnAndToast";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);
        button = findViewById(R.id.button);

    }

    public void onClick(View v) {
        toast.show();
    }
}