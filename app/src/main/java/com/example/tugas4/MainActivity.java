package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText tUsername,tPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tUsername = (EditText) findViewById(R.id.username);
        tPassword = (EditText) findViewById(R.id.password);

    }
    public void loginProcess(View view){
        if(tUsername.getText().toString().equals("gilang")&& tPassword.getText().toString().equals("gilang")){
            Intent intent = new Intent(MainActivity.this, homepage.class);
            intent.putExtra("name",tUsername.getText().toString());
            startActivity(intent);
            reset2();
        }
        else{
            Toast toast = Toast.makeText(this,"Username kamu salah. Coba lagi?",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void resetText(View view){
        reset2();
    }
    public void reset2(){
        tUsername.setText("");
        tPassword.setText("");
        tUsername.requestFocus();
    }
}
