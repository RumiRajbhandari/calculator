package com.example.root.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout=(GridLayout)findViewById(R.id.gridLayout);
        int count=gridLayout.getChildCount();
        ButtonClickHandler buttonClickHandler=new ButtonClickHandler();
    }
    private class ButtonClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Java Hookup, button clicked: " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();

        }
    }
}
