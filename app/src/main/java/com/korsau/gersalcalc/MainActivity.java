package com.korsau.gersalcalc;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import java.util.Arrays;
import java.util.List;
import com.korsau.gersalcalc.spinner.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> langs = Arrays.asList("EN", "DE", "RU");
        final Spinner spinner = (Spinner) findViewById(R.id.langSelector); //lang selector is in activity_main xml

        SpinnerAdapter adapter = new SpinnerAdapter(getApplicationContext(), langs);

        adapter.setDropDownViewResource(R.layout.lang_dropdown_item); //res -> layout folder
        spinner.setAdapter(adapter);

    }

}

