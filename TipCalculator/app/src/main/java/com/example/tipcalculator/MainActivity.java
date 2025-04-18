package com.example.tipcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText editTextBillAmount, editTextTipPercentage;
    private TextView textViewTipAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBillAmount = findViewById(R.id.editTextBillAmount);
        editTextTipPercentage = findViewById(R.id.editTextTipPercentage);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewTipAmount = findViewById(R.id.textViewTipAmount);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTip();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void calculateTip() {
        String billAmountText = editTextBillAmount.getText().toString();
        String tipPercentageText = editTextTipPercentage.getText().toString();

        // Validate input
        if (billAmountText.isEmpty() || tipPercentageText.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter both values", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double billAmount = Double.parseDouble(billAmountText);
            double tipPercentage = Double.parseDouble(tipPercentageText);

            if (billAmount < 0 || tipPercentage < 0) {
                Toast.makeText(MainActivity.this, "Please enter positive values", Toast.LENGTH_SHORT).show();
                return;
            }

            // Calculate tip amount
            double tipAmount = (billAmount * tipPercentage) / 100;

            // Format the tip amount to display with 2 decimal places
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            String formattedTipAmount = decimalFormat.format(tipAmount);

            // Display the tip amount in the TextView
            textViewTipAmount.setText("Tip Amount: $" + formattedTipAmount);

        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Invalid input, please enter numbers", Toast.LENGTH_SHORT).show();
        }
    }
}
