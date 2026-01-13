package com.korsau.gersalcalc;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.view.Window;
import static android.view.Window.*;
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

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewCompat.setOnApplyWindowInsetsListener(toolbar, (v, insets) -> {
            Insets sysBars = insets.getInsets(WindowInsetsCompat.Type.statusBars());
            v.setPadding(v.getPaddingLeft(), sysBars.top, v.getPaddingRight(), v.getPaddingBottom());
            return insets;
        });
        /* line 33-37
        we summon ViewCompat's method setOnApplyWindowInsetsListener, give it the insets of the users
        android system bars, the method gives the View padding which equals to insets in size which
        allows the app to adapt edge-to-edgeto for each device.
        */


        final List<String> langs = Arrays.asList("EN", "DE", "RU");
        final Spinner spinner = (Spinner) findViewById(R.id.langSelector); //lang selector is in activity_main xml

        SpinnerAdapter adapter = new SpinnerAdapter(getApplicationContext(), langs);

        adapter.setDropDownViewResource(R.layout.lang_dropdown_item); //res -> layout folder
        spinner.setAdapter(adapter);

    }

}

