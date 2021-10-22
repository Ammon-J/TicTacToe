package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private TextView playerTxtView;
    private Button newGame;
    private String turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        playerTxtView = findViewById(R.id.playerTurnTxtView);
        newGame = findViewById(R.id.newGame);
        turn = "X";

        resetGame();
    }

    public void onClick(View view) {
        String button1Txt = button1.getText().toString();
        String button2Txt = button2.getText().toString();
        String button3Txt = button3.getText().toString();
        String button4Txt = button4.getText().toString();
        String button5Txt = button5.getText().toString();
        String button6Txt = button6.getText().toString();
        String button7Txt = button6.getText().toString();
        String button8Txt = button8.getText().toString();
        String button9Txt = button9.getText().toString();

        Button[] allButtons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
        Boolean isBtnFound = false; // Is the clicked button found
        Button clickedBtn = button1; // The found button that was clicked. button1 is set just for the beginning
         for(int i = 0; i < allButtons.length && !isBtnFound; i++) {
             if(view.equals(allButtons[i])) {
                 isBtnFound = true;
                 clickedBtn = allButtons[i];
             }
         }

         if(clickedBtn.getText().toString().equals("")) {
             if(turn.equals("X")) {
                 clickedBtn.setText(turn);
                 turn = "O";
             }

             else {
                 clickedBtn.setText("O");
                 turn = "X";
             }

             playerTxtView.setText("Player " + turn + "'s Turn");
         }

         if(view.equals((newGame))) {
             resetGame();
         }
    }

    public void resetGame() {
        turn = "X";
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        playerTxtView.setText("Player " + turn + "'s Turn");
    }
}