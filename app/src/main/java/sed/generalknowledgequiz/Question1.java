package sed.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import static android.R.attr.checked;
import static android.R.id.toggle;

public class Question1 extends AppCompatActivity {
    //Define score (correctAnswer) and initialises string to hold users answer
    int correctAnswer = 0;
    String q1answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        //Creates a button to load next activity window and send over score from this activity to the next
        Button q1sub = (Button) findViewById(R.id.q1sub);
        q1sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q1Intent = new Intent(Question1.this, Question2.class);
                q1Intent.putExtra("correct1", correctAnswer);
                startActivity(q1Intent);
            }
        });
    }
    //Method that monitors which radio button is pressed, if the correct button is pressed score will update.
    //answer selected is also stored and passed to Results page
    public void answerQ1(View view) {
        boolean checked = ((RadioButton)view) .isChecked();

        switch (view.getId()) {
            case R.id.unitedkingdom:
                if (checked);
                correctAnswer = 1;
                break;
            case R.id.australia:
                if (checked);
                q1answer = "Australia";
                break;
            case R.id.latvia:
                if (checked);
                q1answer = "Latvia";
                break;
            case R.id.belgium:
                if (checked);
                q1answer = "Australia";
                break;
        }
    }
}
