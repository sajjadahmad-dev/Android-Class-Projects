package com.example.sajjad_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText btninput=findViewById(R.id.input1);
        EditText btninput2=findViewById(R.id.input2);

        Button btnplus=findViewById(R.id.btnplus);
        Button btnsub=findViewById(R.id.btnsub);
        Button btnmul=findViewById(R.id.btnmul);
        Button btndiv=findViewById(R.id.btndiv);
        TextView textoutput=findViewById(R.id.textoutput);

        btnplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String input1 = btninput.getText().toString();
                String input2 = btninput2.getText().toString();

                if (input1.isEmpty() || input2.isEmpty()) {
                    textoutput.setText("Please enter both numbers");
                }
                else {
                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    int sum = num1 + num2;
                    textoutput.setText(String.valueOf(sum));
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = btninput.getText().toString();
                String input2 = btninput2.getText().toString();
                if (input1.isEmpty() || input2.isEmpty()) {
                    textoutput.setText("Please enter both numbers");
                } else {
                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    int sum = num1 - num2;
                    textoutput.setText(String.valueOf(sum));

                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = btninput.getText().toString();
                String input2 = btninput2.getText().toString();

                if (input1.isEmpty() || input2.isEmpty()) {
                    textoutput.setText("Please enter both numbers");

                }
                else {
                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    int sum = num1 * num2;
                    textoutput.setText(String.valueOf(sum));
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String input1 = btninput.getText().toString();
                String input2 = btninput2.getText().toString();
                if (input1.isEmpty() || input2.isEmpty()) {
                    textoutput.setText("Please enter both numbers");
                } else {
                    float num1 = Integer.parseInt(input1);
                    float num2 = Integer.parseInt(input2);
                    float sum = num1 / num2;
                    textoutput.setText(String.valueOf(sum));
                }

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}