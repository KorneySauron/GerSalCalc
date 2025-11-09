package com.korsau.gersalcalc;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView message;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.droidText);
        ImageView droid = findViewById(R.id.droidImage);

        droid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapDroid();
            }
        });
    }
    private void tapDroid() {
        counter++;
        String countAsText;
        switch (counter){
            case 1:
                countAsText = "once";
                break;
            case 2:
                countAsText = "twice";
                break;
            default:
                countAsText = String.format("%d times", counter);
        }
        message.setText(String.format("You touched the droid %s", countAsText));
    }
}

