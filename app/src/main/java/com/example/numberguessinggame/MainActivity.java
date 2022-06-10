package com.example.numberguessinggame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView input, helptext;
    TextView lastguess1, lastguess2, lastguess3, lastguess4, lastguess5, lastguess6, lastguess7, lastguess8, lastguess9, lastguess10;
    TextView lastresult1, lastresult2, lastresult3, lastresult4, lastresult5, lastresult6, lastresult7, lastresult8, lastresult9, lastresult10;
    Button start, restart, delete, guess, help;
    Button one, two, three, four, five, six, seven, eight, nine, zero;

    int mainNumber = 0;
    int guesscounter = 0, pluscounter = 0, minuscounter = 0;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastguess1 = (TextView) findViewById(R.id.lastguess1);
        lastguess2 = (TextView) findViewById(R.id.lastguess2);
        lastguess3 = (TextView) findViewById(R.id.lastguess3);
        lastguess4 = (TextView) findViewById(R.id.lastguess4);
        lastguess5 = (TextView) findViewById(R.id.lastguess5);
        lastguess6 = (TextView) findViewById(R.id.lastguess6);
        lastguess7 = (TextView) findViewById(R.id.lastguess7);
        lastguess8 = (TextView) findViewById(R.id.lastguess8);
        lastguess9 = (TextView) findViewById(R.id.lastguess9);
        lastguess10 = (TextView) findViewById(R.id.lastguess10);
        lastresult1 = (TextView) findViewById(R.id.lastresult1);
        lastresult2 = (TextView) findViewById(R.id.lastresult2);
        lastresult3 = (TextView) findViewById(R.id.lastresult3);
        lastresult4 = (TextView) findViewById(R.id.lastresult4);
        lastresult5 = (TextView) findViewById(R.id.lastresult5);
        lastresult6 = (TextView) findViewById(R.id.lastresult6);
        lastresult7 = (TextView) findViewById(R.id.lastresult7);
        lastresult8 = (TextView) findViewById(R.id.lastresult8);
        lastresult9 = (TextView) findViewById(R.id.lastresult9);
        lastresult10 = (TextView) findViewById(R.id.lastresult10);
        helptext = (TextView) findViewById(R.id.helptext);
        input = (TextView) findViewById(R.id.input);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        start = (Button) findViewById(R.id.start);
        delete = (Button) findViewById(R.id.delete);
        restart = (Button) findViewById(R.id.restart);
        guess = (Button) findViewById(R.id.guess);
        help = (Button) findViewById(R.id.help);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        start.setOnClickListener(this);
        delete.setOnClickListener(this);
        restart.setOnClickListener(this);
        guess.setOnClickListener(this);
        help.setOnClickListener(this);

        input.setText(null);
        lastguess1.setText(null);
        lastguess2.setText(null);
        lastguess3.setText(null);
        lastguess4.setText(null);
        lastguess5.setText(null);
        lastguess6.setText(null);
        lastguess7.setText(null);
        lastguess8.setText(null);
        lastguess9.setText(null);
        lastguess10.setText(null);
        lastresult1.setText(null);
        lastresult2.setText(null);
        lastresult3.setText(null);
        lastresult4.setText(null);
        lastresult5.setText(null);
        lastresult6.setText(null);
        lastresult7.setText(null);
        lastresult8.setText(null);
        lastresult9.setText(null);
        lastresult10.setText(null);

        one.setVisibility(View.INVISIBLE);
        two.setVisibility(View.INVISIBLE);
        three.setVisibility(View.INVISIBLE);
        four.setVisibility(View.INVISIBLE);
        five.setVisibility(View.INVISIBLE);
        six.setVisibility(View.INVISIBLE);
        seven.setVisibility(View.INVISIBLE);
        eight.setVisibility(View.INVISIBLE);
        nine.setVisibility(View.INVISIBLE);
        zero.setVisibility(View.INVISIBLE);
        guess.setVisibility(View.INVISIBLE);
        delete.setVisibility(View.INVISIBLE);
        restart.setVisibility(View.INVISIBLE);
        helptext.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.one:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("1");
                    else if(input.getText() != null)
                        input.append("1");
                }
                break;
            case R.id.two:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("2");
                    else if(input.getText() != null)
                        input.append("2");
                }
                break;
            case R.id.three:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("3");
                    else if(input.getText() != null)
                        input.append("3");
                }
                break;
            case R.id.four:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("4");
                    else if(input.getText() != null)
                        input.append("4");
                }
                break;
            case R.id.five:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("5");
                    else if(input.getText() != null)
                        input.append("5");
                }
                break;
            case R.id.six:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("6");
                    else if(input.getText() != null)
                        input.append("6");
                }
                break;
            case R.id.seven:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("7");
                    else if(input.getText() != null)
                        input.append("7");
                }
                break;
            case R.id.eight:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("8");
                    else if(input.getText() != null)
                        input.append("8");
                }
                break;
            case R.id.nine:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("9");
                    else if(input.getText() != null)
                        input.append("9");
                }
                break;
            case R.id.zero:
                if(input.length()!=4){
                    if(input.getText() == null)
                        input.setText("0");
                    else if(input.getText() != null)
                        input.append("0");
                }
                break;
            case R.id.delete:
                if(input.length()==4){
                    String s;
                    s = input.getText().toString();
                    String end = "";
                    end = s.substring(0, s.length()-1);
                    input.setText(end);
                }else if(input.length()==3){
                    String s;
                    s = input.getText().toString();
                    String end = "";
                    end = s.substring(0, s.length()-1);
                    input.setText(end);
                }else if(input.length()==2){
                    String s;
                    s = input.getText().toString();
                    String end = "";
                    end = s.substring(0, s.length()-1);
                    input.setText(end);
                }else if(input.length()==1)
                    input.setText(null);
                break;
            case R.id.guess:
                if(input.length()==4){
                    int num1, num2, num3, num4, numFull;
                    numFull = Integer.valueOf(input.getText().toString());
                    num1 = numFull/1000;
                    num2 = (numFull - (num1*1000)) / 100;
                    num3 = (numFull - (num1*1000) - (num2*100)) / 10;
                    num4 = numFull - (num1*1000) - (num2*100) - (num3*10);
                    compareNumbers(num1, num2, num3, num4);

                    if(num1 == 0){
                        //Toast.makeText(MainActivity.this,"First number can't be zero",Toast.LENGTH_LONG).show();
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Wrong Input")
                                .setMessage("First digit can't be zero")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        input.setText(null);
                                    }
                                })
                                .show();
                    }
                    else if(num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4){
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Wrong Input")
                                .setMessage("You must enter four different numbers")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        input.setText(null);
                                    }
                                })
                                .show();
                    }
                    else{
                        guesscounter++;
                        if(pluscounter == 4){
                            new AlertDialog.Builder(MainActivity.this)
                                    .setTitle("You WON!")
                                    .setMessage("Congratulations. Would you like to play again?")
                                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent intent = getIntent();
                                            finish();
                                            startActivity(intent);
                                        }
                                    })
                                    .show();
                        }
                        if(guesscounter == 1 || lastguess1.getText() == null){
                            lastguess1.setText("" + num1 + num2 + num3 + num4);
                            lastresult1.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 2 || lastguess2.getText() == null){
                            lastguess2.setText("" + num1 + num2 + num3 + num4);
                            lastresult2.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 3 || lastguess3.getText() == null){
                            lastguess3.setText("" + num1 + num2 + num3 + num4);
                            lastresult3.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 4 || lastguess4.getText() == null){
                            lastguess4.setText("" + num1 + num2 + num3 + num4);
                            lastresult4.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 5 || lastguess5.getText() == null){
                            lastguess5.setText("" + num1 + num2 + num3 + num4);
                            lastresult5.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 6 || lastguess6.getText() == null){
                            lastguess6.setText("" + num1 + num2 + num3 + num4);
                            lastresult6.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 7 || lastguess7.getText() == null){
                            lastguess7.setText("" + num1 + num2 + num3 + num4);
                            lastresult7.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 8 || lastguess8.getText() == null){
                            lastguess8.setText("" + num1 + num2 + num3 + num4);
                            lastresult8.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 9 || lastguess9.getText() == null){
                            lastguess9.setText("" + num1 + num2 + num3 + num4);
                            lastresult9.setText("+" + pluscounter + "/-" + minuscounter);
                        }
                        else if(guesscounter == 10){
                            lastguess10.setText("" + num1 + num2 + num3 + num4);
                            lastresult10.setText("+" + pluscounter + "/-" + minuscounter);

                            new AlertDialog.Builder(MainActivity.this)
                                    .setTitle("You LOST!")
                                    .setMessage("The number was: " + mainNumber + ". Would you like to try again?")
                                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent intent = getIntent();
                                            finish();
                                            startActivity(intent);
                                        }
                                    })
                                    .show();
                        }
                        pluscounter = 0;
                        minuscounter = 0;
                        input.setText(null);
                    }
                }
                break;
            case R.id.start:
                generateNumber();
                one.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
                six.setVisibility(View.VISIBLE);
                seven.setVisibility(View.VISIBLE);
                eight.setVisibility(View.VISIBLE);
                nine.setVisibility(View.VISIBLE);
                zero.setVisibility(View.VISIBLE);
                guess.setVisibility(View.VISIBLE);
                delete.setVisibility(View.VISIBLE);
                restart.setVisibility(View.VISIBLE);
                start.setVisibility(View.INVISIBLE);
                help.setVisibility(View.INVISIBLE);
                helptext.setVisibility(View.INVISIBLE);
                break;
            case R.id.restart:
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                break;
            case R.id.help:
                if(counter == 0){
                    helptext.setVisibility(View.VISIBLE);
                    counter++;
                }
                else if(counter ==1){
                    helptext.setVisibility(View.INVISIBLE);
                    counter--;
                }
                break;
        }
    }

    public void compareNumbers(int guess1, int guess2, int guess3, int guess4){

        int firstnumber, secondnumber, thirdnumber, forthnumber;
        //mainNumber = Integer.valueOf(input.getText().toString());
        firstnumber = mainNumber/1000;
        secondnumber = (mainNumber - (firstnumber*1000)) / 100;
        thirdnumber = (mainNumber - (firstnumber*1000) - (secondnumber*100)) / 10;
        forthnumber = mainNumber - (firstnumber*1000) - (secondnumber*100) - (thirdnumber*10);


        //----------------for the first number------------------//
        if(firstnumber == guess1)
            pluscounter++;
        else if(firstnumber==guess2 || firstnumber==guess3 || firstnumber==guess4)
            minuscounter++;

        //----------------for the second number------------------//
        if(secondnumber == guess2)
            pluscounter++;
        else if(secondnumber==guess1 || secondnumber==guess3 || secondnumber==guess4)
            minuscounter++;

        //----------------for the third number------------------//
        if(thirdnumber == guess3)
            pluscounter++;
        else if(thirdnumber==guess1 || thirdnumber==guess2 || thirdnumber==guess4)
            minuscounter++;

        //----------------for the fourth number------------------//
        if(forthnumber == guess4)
            pluscounter++;
        else if(forthnumber==guess1 || forthnumber==guess2 || forthnumber==guess3)
            minuscounter++;
    }

    public void generateNumber(){
        Random rand = new Random();
        int number1, number2, number3, number4;

        number1 = 0;
        while(number1 == 0)
            number1 = rand.nextInt(10);

        number2 = number1;
        number3 = number2;
        number4 = number3;

        while(number2 == number1)
            number2 = rand.nextInt(10);
        while(number3 == number2 || number3 == number1)
            number3 = rand.nextInt(10);
        while(number4 == number3 || number4 == number2 || number4 == number1)
            number4 = rand.nextInt(10);

        mainNumber = ((number1*1000) + (number2*100) + (number3*10) + number4);
        Log.d("methodTag", "mainNumber is " + mainNumber);
    }
}