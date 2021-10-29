package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {
    private EditText player1;
    private EditText player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
        player1 =findViewById(R.id.editTextTextPersonName);
        player2 =findViewById(R.id.editTextTextPersonName2);
    }
    public void submitButtonClick(View view){
        String Player1Name=player1.getText().toString();
        String Player2Name=player2.getText().toString();
        Intent intent=new Intent(this,GameDisplay.class);
        intent.putExtra("PLAYER_NAMES",new String []{Player1Name,Player2Name});
        startActivity(intent);
    }
}