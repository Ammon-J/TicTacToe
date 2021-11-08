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

         playGame(allButtons);
    }

    public void playGame(Button[] buttons) {
        if(buttons[0].getText().toString() == "X" && buttons[1].getText().toString() == "X" && buttons[2].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[0].getText().toString() == "O" && buttons[1].getText().toString() == "O" && buttons[2].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(buttons[3].getText().toString() == "X" && buttons[4].getText().toString() == "X" && buttons[5].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[3].getText().toString() == "O" && buttons[4].getText().toString() == "O" && buttons[5].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(buttons[6].getText().toString() == "X" && buttons[7].getText().toString() == "X" && buttons[8].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[6].getText().toString() == "O" && buttons[7].getText().toString() == "O" && buttons[8].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(buttons[0].getText().toString() == "X" && buttons[3].getText().toString() == "X" && buttons[6].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[0].getText().toString() == "O" && buttons[3].getText().toString() == "O" && buttons[6].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(buttons[1].getText().toString() == "X" && buttons[4].getText().toString() == "X" && buttons[7].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[0].getText().toString() == "O" && buttons[3].getText().toString() == "O" && buttons[7].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(buttons[2].getText().toString() == "X" && buttons[5].getText().toString() == "X" && buttons[8].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[2].getText().toString() == "O" && buttons[5].getText().toString() == "O" && buttons[8].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(buttons[0].getText().toString() == "X" && buttons[4].getText().toString() == "X" && buttons[8].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[0].getText().toString() == "O" && buttons[4].getText().toString() == "O" && buttons[8].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(buttons[2].getText().toString() == "X" && buttons[4].getText().toString() == "X" && buttons[6].getText().toString() == "X") {
            playerTxtView.setText("Player X wins!");
            disableAllButtons();
        }

        else if(buttons[2].getText().toString() == "O" && buttons[4].getText().toString() == "O" && buttons[6].getText().toString() == "O") {
            playerTxtView.setText("Player O wins!");
            disableAllButtons();
        }

        else if(allButtonsHaveText(buttons)) {
            playerTxtView.setText("Its a Tie!");
            disableAllButtons();
        }
    }

    public boolean allButtonsHaveText(Button[] buttons) {
        for(int i  = 0; i < buttons.length; i++) {
            if(buttons[i].getText().toString() == "") {
                return false;
            }
        }

        return true;
    }

    public void disableAllButtons() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }

    public void enableAllButtons() {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
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

        enableAllButtons();
    }
}