package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class homepage extends AppCompatActivity {
    public TextView tAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage);
        tAdmin = (TextView) findViewById(R.id.user);

        Bundle bundle = getIntent().getExtras();

        String s = bundle.getString("name");
        tAdmin.setText("Hi, " + s);

    }

    @Override
    public void onBackPressed(){
        Toast toast = Toast.makeText(this,"Silakan Logout",Toast.LENGTH_LONG);
        toast.show();

    }

    public void logout(View v){
        finish();
    }

}