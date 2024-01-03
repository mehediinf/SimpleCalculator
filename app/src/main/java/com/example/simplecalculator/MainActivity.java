package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1,editText2;
    private Button addButton,subButton,multButton,divButton,squareButton,squareRootButton,modulusButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1Id);
        editText2 = findViewById(R.id.editText2Id);

        addButton = findViewById(R.id.addButtonId);
        subButton = findViewById(R.id.subButtonId);
        multButton = findViewById(R.id.multButtonId);
        divButton = findViewById(R.id.divButtonId);
        squareButton = findViewById(R.id.squareButtonId);
        squareRootButton = findViewById(R.id.squareRootButtonId);
        modulusButton = findViewById(R.id.modulusButtonId);

        resultTextView = findViewById(R.id.resultTextViewId);


        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
        squareRootButton.setOnClickListener(this);
        squareButton.setOnClickListener(this);
        modulusButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //try use ...........

        try {
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            //Converting into double
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId()==R.id.addButtonId){

                double sum = num1 + num2;
                resultTextView.setText("Result of Summation : "+sum);

            }
            else if (v.getId()==R.id.subButtonId){

                double sub = num1 - num2;
                resultTextView.setText("Result of Subtraction : "+sub);

            }
            else if (v.getId()==R.id.multButtonId){

                double mul = num1 * num2;
                resultTextView.setText("Result of Multiply : "+mul);

            }
            else if (v.getId()==R.id.divButtonId){

                double div = num1 / num2;
                resultTextView.setText("Result of Quotion : "+div);

            }
            else if (v.getId()==R.id.modulusButtonId){

                double modulus = num1 % num2;
                resultTextView.setText("Result of Modulus : "+modulus);

            }


        }catch (Exception e){
            Toast.makeText(MainActivity.this,"Please,Enter The Number!",Toast.LENGTH_SHORT).show();

        }
    //try end......
    //Again try use.........

        try {
            String number1 = editText1.getText().toString();

            //Converting into double
            double num1 = Double.parseDouble(number1);

            if (v.getId()==R.id.squareButtonId){

                double square = num1 * num1;
                resultTextView.setText("Result of Square : "+square);

            }
            else if (v.getId()==R.id.squareRootButtonId){

                double root = Math.pow(num1, 0.5);
                resultTextView.setText("Result of Root : "+root);

            }

        }catch (Exception e){


        }
        //try end...............


    }
}