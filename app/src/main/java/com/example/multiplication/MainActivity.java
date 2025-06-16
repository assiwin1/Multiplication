package com.example.multiplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Model md = new Model();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void setLeftBtnFunc(View view)
    {
        md.setLeftBtn();
        showRandTwoNumbers();
    }
    public void setMiddleBtnFunc(View view)
    {
        md.setMiddleBtn();
        showRandTwoNumbers();
    }
    public void setRightBtnFunc(View view)
    {
        md.setRightBtn();
        showRandTwoNumbers();
    }
    public void showRandTwoNumbers()
    {
        TextView textView1 = findViewById(R.id.textView);
        textView1.setText(String.valueOf(md.getNum1()));
        TextView textView2 = findViewById(R.id.textView3);
        textView2.setText(String.valueOf(md.getNum2()));
    }
    public void checkAnswer(View view) {
        //todo need to check value from user that is the correct answer of mul two rand number

        EditText editTextNumber = findViewById(R.id.editTextNumber);
        String numberString = editTextNumber.getText().toString();
        if(!numberString.isEmpty())
        {
            int number = Integer.parseInt(numberString);
            if (md.isAnswerCorrect(number))
                Toast.makeText(this, "correct answer", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();

        }else
            Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show();
    }
}