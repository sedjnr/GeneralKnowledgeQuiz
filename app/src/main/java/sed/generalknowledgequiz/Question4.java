package sed.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

import static android.R.attr.checked;
import static android.R.attr.id;

public class Question4 extends AppCompatActivity {

    //Define score (correctAnswer) and initialises string to hold users answer
    String q4answer;
    int correctAnswer;
    //int correctAnswer = getIntent().getExtras().getInt("correct3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        //Creates a button to load next activity window and send over score from this activity to the next
        Button q4sub = (Button) findViewById(R.id.q4sub);

        q4sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q4Intent = new Intent(Question4.this, Question5.class);
                q4Intent.putExtra("correct4", correctAnswer);
                startActivity(q4Intent);
            }
        });

        Switch button =  (Switch) findViewById(R.id.q4Toggle);
        button.setChecked(true);
        button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q4answer ="True";
                }else {
                    q4answer="False";
                }
            }
        });
        if (button.isChecked()) {

            q4answer ="True";
            correctAnswer+=0;
        }else {
            q4answer="False";
            correctAnswer+=1;
        }
    }




}
