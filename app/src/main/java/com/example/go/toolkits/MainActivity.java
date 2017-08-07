package com.example.go.toolkits;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.go.toolkits.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButton;
    private RadioGroup radioGroupId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        radioGroupId = (RadioGroup) findViewById(R.id.radioGroupId);
        radioGroupId.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                radioButton = (RadioButton) findViewById(checkedId);
                switch (radioButton.getId()){

                    case R.id.blue: {
                        Toast.makeText(getApplicationContext(),"BLUE！", Toast.LENGTH_LONG).show();


                        break;
                    }
                    case R.id.purple: {
                        Toast.makeText(getApplicationContext(), "PURPLE！", Toast.LENGTH_LONG).show();
                        break;
                    }
                    case R.id.red: {
                        Toast.makeText(getApplicationContext(),"RED！", Toast.LENGTH_LONG).show();
                        break;
                    }


                }

            }
        });




    }
}
