package com.example.dice_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    CardView cardrolldice, cardrolldice1;
    ImageView imgdice, imgDice;
    TextView txtnumber, txtnumber1;

    private int img [] = {R.drawable.dice1, R.drawable.dice2,  R.drawable.dice3,  R.drawable.dice4, R.drawable.dice5,  R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardrolldice = findViewById(R.id.cardrolldice);
        cardrolldice1 = findViewById(R.id.cardrolldice1);
        imgdice= findViewById(R.id.imgdice);
        imgDice = findViewById(R.id.imgDice);
        txtnumber = findViewById(R.id.txtnumber);
        txtnumber1 = findViewById(R.id.txtnumber1);


        cardrolldice.setOnClickListener(view -> {

            Random random = new Random();
            int num = random.nextInt(6);

            setdice(num);

        });

        cardrolldice1.setOnClickListener(view -> {
            Random random = new Random();
            int num = random.nextInt(6);

            setdice1(num);
        });
    }

    private void setdice1(int num) {

        imgDice.setImageResource(img[num]);
        txtnumber1.setText("Dice Num :"+(num+1));
    }

    private void setdice(int num) {


        imgdice.setImageResource(img[num]);
        txtnumber.setText("Dice num :"+(num+1));
    }
}