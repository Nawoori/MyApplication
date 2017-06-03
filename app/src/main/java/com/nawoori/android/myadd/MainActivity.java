package com.nawoori.android.myadd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nawoori.android.myapplication.R;

public class MainActivity extends AppCompatActivity {


    EditText editText, editText2;
    TextView result;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.result);
        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String value01 = editText.getText().toString();
                    String value02 = editText2.getText().toString();

                    int input01 = Integer.parseInt(value01);
                    int input02 = Integer.parseInt(value02);

                    int value03 = input01 + input02;
                    result.setText(String.valueOf(value03));
            }
        });



    }
}
