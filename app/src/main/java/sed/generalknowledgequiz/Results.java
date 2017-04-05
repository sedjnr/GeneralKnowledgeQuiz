package sed.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;
import static android.widget.Toast.makeText;
import static sed.generalknowledgequiz.R.id.answertoast;

public class Results extends AppCompatActivity {
    int correctAnswer;
    //int correctAnswer = getIntent().getExtras().getInt("correct5");

    // Returns strings from previous activities and returns text stating the users answers
    public String q1answer;
    public String q2answer;
    public String q3answer;
    public String q4answer;
    public String q5answer;

    public String displayScore = "You have answered "+ correctAnswer +" out of 6 correctly!";
    public String displayAnswers = "Here are your answers\nQ1 - " + q1answer +
                                                        "\nQ2 - " + q2answer +
                                                        "\nQ3 - " + q3answer +
                                                        "\nQ4 - " + q4answer +
                                                        "\nQ5 - " + q5answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //Calls methods display answer and display score
        displayAnswer();
        displayScore();

        //Button to restart quiz for user, sends them back to homepage
        Button restart = (Button) findViewById(R.id.restart);

        restart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent restartIntent = new Intent(Results.this,MainActivity.class);
                startActivity(restartIntent);
            }
        });
        //Toast message displaying the correct answers for quiz in centre of the screen
        Button answertoast = (Button) findViewById(R.id.answertoast);
        answertoast.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast toast = Toast.makeText(Results.this,
                        "The correct answers are\n" +
                                "Question 1 - United Kingdom\n" +
                                "Question 2 - Donald Trump\n" +
                                "Question 3 - Blue\n" +
                                "Question 4 - False\n" +
                                "Question 5 - The building (Top left image)",
                        Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                toast.show();
            }
        });
    }
    //Modifies text view to display string displayAnswers
    public void displayAnswer() {
        TextView dispAnswer = (TextView) findViewById(R.id.displayAnswers);
        dispAnswer.setText(String.valueOf(displayAnswers));
    }
    //Modifies text view to display string displayScore
    public void displayScore() {
        TextView dispScore = (TextView) findViewById(R.id.displayScore);
        dispScore.setText(String.valueOf(displayScore));
    }
}
