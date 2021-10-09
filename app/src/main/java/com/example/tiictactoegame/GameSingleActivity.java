package com.example.tiictactoegame;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameSingleActivity extends AppCompatActivity {
    TextView tvClick1;
    TextView tvClick2;
    TextView tvClick3;
    TextView tvClick4;
    TextView tvClick5;
    TextView tvClick6;
    TextView tvClick7;
    TextView tvClick8;
    TextView tvClick9;
    TextView tvWin;
    Button btReset;
    private boolean isChecked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_single);
        tvClick1 = findViewById(R.id.tvClick1);
        tvClick2 = findViewById(R.id.tvClick2);
        tvClick3 = findViewById(R.id.tvClick3);
        tvClick4 = findViewById(R.id.tvClick4);
        tvClick5 = findViewById(R.id.tvClick5);
        tvClick6 = findViewById(R.id.tvClick6);
        tvClick7 = findViewById(R.id.tvClick7);
        tvClick8 = findViewById(R.id.tvClick8);
        tvClick9 = findViewById(R.id.tvClick9);
        tvWin = findViewById(R.id.tvWin);
        btReset = findViewById(R.id.btReset);
        startGame();
        btReset.setOnClickListener(view -> {
            clear();
        });
    }

    @SuppressLint("ResourceAsColor")
    private void clear() {
        tvClick1.setText("");
        tvClick2.setText("");
        tvClick3.setText("");
        tvClick4.setText("");
        tvClick5.setText("");
        tvClick6.setText("");
        tvClick7.setText("");
        tvClick8.setText("");
        tvClick9.setText("");
        tvWin.setText("");
        tvWin.setVisibility(View.INVISIBLE);
//        tvClick1.setBackgroundColor(android.R.color.transparent);
//        tvClick2.setBackgroundColor(android.R.color.transparent);
//        tvClick3.setBackgroundColor(android.R.color.transparent);
//        tvClick4.setBackgroundColor(android.R.color.transparent);
//        tvClick5.setBackgroundColor(android.R.color.transparent);
//        tvClick6.setBackgroundColor(android.R.color.transparent);
//        tvClick7.setBackgroundColor(android.R.color.transparent);
//        tvClick8.setBackgroundColor(android.R.color.transparent);
//        tvClick9.setBackgroundColor(android.R.color.transparent);
        tvClick1.setClickable(true);
        tvClick2.setClickable(true);
        tvClick3.setClickable(true);
        tvClick4.setClickable(true);
        tvClick5.setClickable(true);
        tvClick6.setClickable(true);
        tvClick7.setClickable(true);
        tvClick8.setClickable(true);
        tvClick9.setClickable(true);
        TextView text = new TextView(this);
        text.getCurrentHintTextColor();
        text.getCurrentTextColor();
        text.getDrawingCacheBackgroundColor();
    }

    private void startGame() {
        tvClick1.setOnClickListener(view -> {
            if (isChecked) {
                tvClick1.setText("X");
                isChecked = false;
            } else {
                tvClick1.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick1.setClickable(false);
        });
        tvClick2.setOnClickListener(view -> {
            if (isChecked) {
                tvClick2.setText("X");
                isChecked = false;
            } else {
                tvClick2.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick2.setClickable(false);
        });
        tvClick3.setOnClickListener(view -> {
            if (isChecked) {
                tvClick3.setText("X");
                isChecked = false;
            } else {
                tvClick3.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick3.setClickable(false);
        });
        tvClick4.setOnClickListener(view -> {
            if (isChecked) {
                tvClick4.setText("X");
                isChecked = false;
            } else {
                tvClick4.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick4.setClickable(false);
        });
        tvClick5.setOnClickListener(view -> {
            if (isChecked) {
                tvClick5.setText("X");
                isChecked = false;
            } else {
                tvClick5.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick5.setClickable(false);
        });
        tvClick6.setOnClickListener(view -> {
            if (isChecked) {
                tvClick6.setText("X");
                isChecked = false;
            } else {
                tvClick6.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick6.setClickable(false);
        });
        tvClick7.setOnClickListener(view -> {
            if (isChecked) {
                tvClick7.setText("X");
                isChecked = false;
            } else {
                tvClick7.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick7.setClickable(false);
        });
        tvClick8.setOnClickListener(view -> {
            if (isChecked) {
                tvClick8.setText("X");
                isChecked = false;
            } else {
                tvClick8.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick8.setClickable(false);
        });
        tvClick9.setOnClickListener(view -> {
            if (isChecked) {
                tvClick9.setText("X");
                isChecked = false;
            } else {
                tvClick9.setText("O");
                isChecked = true;
            }
            matchCheck();
            tvClick9.setClickable(false);
        });
    }

    public void matchCheck() {
        if ((tvClick1.getText().toString() == "X") && (tvClick2.getText().toString() == "X") && (tvClick3.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick1.setBackgroundColor(Color.GREEN);
//            tvClick2.setBackgroundColor(Color.GREEN);
//            tvClick3.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick1.getText().toString() == "X") && (tvClick5.getText().toString() == "X") && (tvClick9.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick1.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick9.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick1.getText().toString() == "X") && (tvClick4.getText().toString() == "X") && (tvClick7.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick1.setBackgroundColor(Color.GREEN);
//            tvClick4.setBackgroundColor(Color.GREEN);
//            tvClick7.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick2.getText().toString() == "X") && (tvClick5.getText().toString() == "X") && (tvClick8.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick2.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick8.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick3.getText().toString() == "X") && (tvClick5.getText().toString() == "X") && (tvClick7.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick3.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick7.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick3.getText().toString() == "X") && (tvClick6.getText().toString() == "X") && (tvClick9.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick3.setBackgroundColor(Color.GREEN);
//            tvClick6.setBackgroundColor(Color.GREEN);
//            tvClick9.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick4.getText().toString() == "X") && (tvClick5.getText().toString() == "X") && (tvClick6.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick4.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick6.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick7.getText().toString() == "X") && (tvClick8.getText().toString() == "X") && (tvClick9.getText().toString() == "X")) {
            tvWin.setText("X WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick7.setBackgroundColor(Color.GREEN);
//            tvClick8.setBackgroundColor(Color.GREEN);
//            tvClick9.setBackgroundColor(Color.GREEN);
            win();
        }

        if ((tvClick1.getText().toString() == "O") && (tvClick2.getText().toString() == "O") && (tvClick3.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick1.setBackgroundColor(Color.GREEN);
//            tvClick2.setBackgroundColor(Color.GREEN);
//            tvClick3.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick1.getText().toString() == "O") && (tvClick5.getText().toString() == "O") && (tvClick9.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick1.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick9.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick1.getText().toString() == "O") && (tvClick4.getText().toString() == "O") && (tvClick7.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick1.setBackgroundColor(Color.GREEN);
//            tvClick4.setBackgroundColor(Color.GREEN);
//            tvClick7.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick2.getText().toString() == "O") && (tvClick5.getText().toString() == "O") && (tvClick8.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick2.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick8.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick3.getText().toString() == "O") && (tvClick5.getText().toString() == "O") && (tvClick7.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick3.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick7.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick3.getText().toString() == "O") && (tvClick6.getText().toString() == "O") && (tvClick9.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick3.setBackgroundColor(Color.GREEN);
//            tvClick6.setBackgroundColor(Color.GREEN);
//            tvClick9.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick4.getText().toString().equals("O")) && (tvClick5.getText().toString() == "O") && (tvClick6.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick4.setBackgroundColor(Color.GREEN);
//            tvClick5.setBackgroundColor(Color.GREEN);
//            tvClick6.setBackgroundColor(Color.GREEN);
            win();
        } else if ((tvClick7.getText().toString() == "O") && (tvClick8.getText().toString() == "O") && (tvClick9.getText().toString() == "O")) {
            tvWin.setText("O WIN");
            tvWin.setVisibility(View.VISIBLE);
//            tvClick7.setBackgroundColor(Color.GREEN);
//            tvClick8.setBackgroundColor(Color.GREEN);
//            tvClick9.setBackgroundColor(Color.GREEN);
            win();
        }
    }

    private void win() {
        tvClick1.setClickable(false);
        tvClick2.setClickable(false);
        tvClick3.setClickable(false);
        tvClick4.setClickable(false);
        tvClick5.setClickable(false);
        tvClick6.setClickable(false);
        tvClick7.setClickable(false);
        tvClick8.setClickable(false);
        tvClick9.setClickable(false);
    }


}