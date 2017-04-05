package sed.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question3 extends AppCompatActivity {

    //Define score (correctAnswer) and initialises string to hold users answer
    String q3answer;
    int correctAnswer;
    //int correctAnswer = getIntent().getExtras().getInt("correct2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        //Creates a button to load next activity window and send over score from this activity to the next
        Button q3sub = (Button) findViewById(R.id.q3sub);
        q3sub.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view){
            Intent q3Intent = new Intent(Question3.this,Question4.class);
            q3Intent.putExtra("correct3", correctAnswer);
            startActivity(q3Intent);
        }
        });
    }
    //Method that checks if correct checkboxes have been selected, if they have update score value
    public void q3answer(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.q37k:
                if (checked){
                    correctAnswer +=0;
                    q3answer = "7000";
                    break;
                }
            case R.id.q350k:
                if (checked){
                    correctAnswer +=0;
                    q3answer = "50000";
                    break;
                }
            case R.id.q390k:
                if (checked){
                    correctAnswer +=1;
                    q3answer = "90000";
                    break;
                }
            case R.id.q3125k:
                if (checked){
                    correctAnswer +=1;
                    q3answer = "12500";
                    break;
                }
        }
    }
}
