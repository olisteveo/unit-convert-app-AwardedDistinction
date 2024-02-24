package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapp.Convertor.Converts;
import com.example.myapp.Convertor.Factory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText sourceInput;
    TextView sourceLabel;
    Spinner fromUnits;
    Spinner toUnits;
    Button switchUnitButton;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialise UI elements
        sourceInput = findViewById(R.id.sourceInput);
        sourceLabel = findViewById(R.id.txtCalcResult);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        switchUnitButton = findViewById(R.id.switchUnitButton);
        fromUnits = findViewById(R.id.spinner1);
        toUnits = findViewById(R.id.spinner2);
        clearButton = findViewById(R.id.clearButton);

        // Attach click listeners
        btnCalculate.setOnClickListener(this);
        switchUnitButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnCalculate) {
            calculate();
        } else if (view.getId() == R.id.switchUnitButton) {
            switchUnits();
        } else if (view.getId() == R.id.clearButton) {
            clear();
        }
    }


    private void switchUnits() {
        // Swap selected units in spinners
        int unit1Index = fromUnits.getSelectedItemPosition();
        int unit2Index = toUnits.getSelectedItemPosition();
        fromUnits.setSelection(unit2Index);
        toUnits.setSelection(unit1Index);
        calculate();
    }

    private void calculate() {
        String sourceUnit = fromUnits.getSelectedItem().toString();
        String targetUnit = toUnits.getSelectedItem().toString();
        String inputText = sourceInput.getText().toString();


        if (!inputText.isEmpty()) {
            double inputValue = Double.parseDouble(inputText);
//            double result = determineConversion(inputValue, fromUnits.getSelectedItemPosition(), toUnits.getSelectedItemPosition());
            double result = Factory.convert(inputValue, fromUnits.getSelectedItem().toString(), toUnits.getSelectedItem().toString());
            sourceLabel.setText(String.valueOf(result));
        } else {
            sourceLabel.setText("Enter a value");
        }
    }

    private void clear() {
        // Clear input value and result
        sourceInput.setText("");
        sourceLabel.setText("");
    }
}
