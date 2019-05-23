package de.drunkenapps.howmuchtip;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityMain extends AppCompatActivity {

    TextView textViewAmount;
    TextView textView10;
    TextView textView15;
    TextView textView18;
    TextView textView20;
    TextView textView25;

    EditText editTextAmount;
    EditText editText10;
    EditText editText15;
    EditText editText18;
    EditText editText20;
    EditText editText25;

    EditText editText10Total;
    EditText editText15Total;
    EditText editText18Total;
    EditText editText20Total;
    EditText editText25Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAmount = findViewById(R.id.editTextAmount);

        editTextAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("log", "text: " + s.toString());

                if (s.length() == 0)
                    return;

                Double amount = Double.valueOf(s.toString());

                updateData(amount);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        editText10 = findViewById(R.id.editText10);
        editText15 = findViewById(R.id.editText15);
        editText18 = findViewById(R.id.editText18);
        editText20 = findViewById(R.id.editText20);
        editText25 = findViewById(R.id.editText25);

        editText10Total = findViewById(R.id.editText10Total);
        editText15Total = findViewById(R.id.editText15Total);
        editText18Total = findViewById(R.id.editText18Total);
        editText20Total = findViewById(R.id.editText20Total);
        editText25Total = findViewById(R.id.editText25Total);
    }

    void updateData(Double amount){

        Long num10 = Math.round(0.1 * amount);
        Long num15 = Math.round(0.15 * amount);
        Long num18 = Math.round(0.18 * amount);
        Long num20 = Math.round(0.2 * amount);
        Long num25 = Math.round(0.25 * amount);

        Long num10Total = Math.round(amount + num10);
        Long num15Total = Math.round(amount + num15);
        Long num18Total = Math.round(amount + num18);
        Long num20Total = Math.round(amount + num20);
        Long num25Total = Math.round(amount + num25);


        editText10.setText(num10.toString());
        editText15.setText(num15.toString());
        editText18.setText(num18.toString());
        editText20.setText(num20.toString());
        editText25.setText(num25.toString());

        editText10Total.setText(num10Total.toString());
        editText15Total.setText(num15Total.toString());
        editText18Total.setText(num18Total.toString());
        editText20Total.setText(num20Total.toString());
        editText25Total.setText(num25Total.toString());

    }


}
