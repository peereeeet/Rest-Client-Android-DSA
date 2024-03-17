package edu.upc.dsa.rest_client.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import edu.upc.dsa.rest_client.R;

public class MainActivity extends AppCompatActivity {

    private Button tracksBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tracksBtn = findViewById(R.id.tracksButton);

        tracksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrackListActivity();
            }
        });
    }

    private void openTrackListActivity() {
        Intent intent = new Intent(MainActivity.this, TrackListActivity.class);
        startActivity(intent);
    }
}

