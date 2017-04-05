package sed.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;
import static android.R.attr.onClick;

public class Question2 extends AppCompatActivity {

    //Define score (correctAnswer) and initialises string to hold answer
    int correctAnswer;
    //int correctAnswer = getIntent().getExtras().getInt("correct1");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        //Creates a button to load next activity window and send over score from this activity to the next
        Button q2sub = (Button) findViewById(R.id.q2sub);

        q2sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answerq2();

                Intent q2Intent = new Intent(Question2.this, Question3.class);
                q2Intent.putExtra("correct2", correctAnswer);
                startActivity(q2Intent);
            }
        });
    }

    public void answerq2(){
        // returns value entered into text field, if answered "Donald Trump, update score
        EditText q2answer = (EditText) findViewById(R.id.q2answer);

        String q2ans = q2answer.getText().toString();
        if (q2ans == "Donald Trump") {
            correctAnswer+=1;
        }else{
            correctAnswer+=0;
        }
    }
}
