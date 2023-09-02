package com.example.datetimeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to the TextView
        TextView dateTimeTextView = findViewById(R.id.dateTimeTextView);

        // Get the current date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy hh:mm a", Locale.getDefault());
        String currentDateTime = dateFormat.format(new Date());

        // Set the current date and time to the TextView
        dateTimeTextView.setText(currentDateTime);
    }
}
