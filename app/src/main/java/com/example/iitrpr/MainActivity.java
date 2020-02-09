package com.example.iitrpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    int flag;
    double value, sum=0.0, division=1.0, multiplication=1.0, subtraction=0.0, remainder=1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.textView);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.one)
        {
            display.setText(display.getText()+"1");
        }
        else if (view.getId() == R.id.two)
        {
            display.setText(display.getText()+"2");
        }
        else if (view.getId() == R.id.three)
        {
            display.setText(display.getText()+"3");
        }
        else if (view.getId() == R.id.four)
        {
            display.setText(display.getText()+"4");
        }
        else if (view.getId() == R.id.five)
        {
            display.setText(display.getText()+"5");
        }
        else if (view.getId() == R.id.six)
        {
            display.setText(display.getText()+"6");
        }
        else if (view.getId() == R.id.seven)
        {
            display.setText(display.getText()+"7");
        }
        else if (view.getId() == R.id.eight)
        {
            display.setText(display.getText()+"8");
        }
        else if (view.getId() == R.id.nine)
        {
            display.setText(display.getText()+"9");
        }
        else if (view.getId() == R.id.zero)
        {
            display.setText(display.getText()+"0");
        }
        else if (view.getId() == R.id.dec)
        {
            display.setText(display.getText()+".");
        }
        else if (view.getId() == R.id.add)
        {
            flag = 1;
            value = Double.parseDouble(display.getText().toString());
            sum = sum+value;
            display.setText("");
        }
        else if (view.getId() == R.id.subtract)
        {
            flag = 2;
            value = Double.parseDouble((display.getText().toString()));
            subtraction = value-subtraction;
            display.setText("");
        }
        else if (view.getId() == R.id.multiply)
        {
            flag =3;
            value = Double.parseDouble(display.getText().toString());
            multiplication = value*multiplication;
            display.setText("");
        }
        else if (view.getId() == R.id.divide)
        {
            flag = 4;
            value = Double.parseDouble(display.getText().toString());
            division = value/division;
            display.setText("");
        }
        else if (view.getId() == R.id.rem)
        {
            flag = 5;
            value = Double.parseDouble(display.getText().toString());
            remainder = value%remainder;
            display.setText("");
        }
        else if (view.getId() == R.id.del)
        {
            String str1 = "";
            String str = display.getText().toString();
            int l = str.length();
            int i;
            for (i = 0; i < l-1; i++)
            {
                str1 = str1 + str.charAt(i);
            }
            display.setText(str1);
        }
        else if (view.getId() == R.id.clear)
        {
            display.setText("");
            sum = 0.0;
            multiplication = 1.0;
            division = 1.0;
            subtraction = 0.0;
            remainder = 1.0;
        }
        else if (view.getId() == R.id.equals)
        {
            if (flag == 1)
            {
                sum = sum+Double.parseDouble(display.getText().toString());
                display.setText(Double.toString(sum));
                sum = 0.0;
            }
            if (flag == 2)
            {
                subtraction = subtraction-Double.parseDouble(display.getText().toString());
                display.setText(Double.toString(subtraction));
                subtraction = 0.0;
            }
            if (flag == 3)
            {
                multiplication = multiplication*Double.parseDouble(display.getText().toString());
                display.setText(Double.toString(multiplication));
                multiplication = 1.0;
            }
            if (flag == 4)
            {
                division = division/Double.parseDouble(display.getText().toString());
                display.setText(Double.toString(division));
                division = 1.0;
            }
            if (flag == 5)
            {
                remainder = remainder/Double.parseDouble(display.getText().toString());
                display.setText(Double.toString(remainder));
                remainder = 1.0;
            }
        }
    }
}
