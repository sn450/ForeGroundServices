package snehal.foregroundservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start_button, stop_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_button = findViewById(R.id.startforeground);
        stop_button = findViewById(R.id.stopforeground);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,CreateForegroundServiceActivity.class);
                in.setAction(CreateForegroundServiceActivity.ACTION_START_FOREGROUND_SERVICE);
                startService(in);
            }
        });
        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent out = new Intent(MainActivity.this,CreateForegroundServiceActivity.class);
                out.setAction(CreateForegroundServiceActivity.ACTION_STOP_FOREGROUND_SERVICE);
                startService(out);
            }
        });
    }
}
