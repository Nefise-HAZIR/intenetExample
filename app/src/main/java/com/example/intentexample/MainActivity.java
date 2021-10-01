package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editText);
        go=findViewById(R.id.button);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName=name.getText().toString();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("keyword",userName);
                startActivity(intent);
            }
        });
    }
}