package sed.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button begin = (Button) findViewById(R.id.begin);

        begin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                // Create a new intent to open the {@link PhrasesActivity}
                Intent beginIntent = new Intent(MainActivity.this, Question1.class);

                // Start the new activity
                startActivity(beginIntent);
            }
        });
    }






}
