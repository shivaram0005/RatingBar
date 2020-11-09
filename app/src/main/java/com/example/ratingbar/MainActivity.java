package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingbar);
        Button b1=(Button)findViewById(R.id.buttonsubmit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating=String.valueOf(ratingBar.getRating());
                Toast.makeText(MainActivity.this, "The rating you submitted is " + rating , Toast.LENGTH_SHORT).show();

            }
        });
    }
}