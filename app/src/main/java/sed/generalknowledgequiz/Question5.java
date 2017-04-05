package sed.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import static sed.generalknowledgequiz.R.id.gridview;
import static sed.generalknowledgequiz.R.id.q4sub;

public class Question5 extends AppCompatActivity {

    //Define score (correctAnswer) and initialises string to hold users answer
    String q5answer;
    int correctAnswer;
    //int correctAnswer = getIntent().getExtras().getInt("correct4");

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        //Creates a button to load next activity window and send over score from this activity to the next
        Button q5sub = (Button) findViewById(R.id.q5sub);
        q5sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q5Intent = new Intent(Question5.this, Results.class);
                q5Intent.putExtra("correct5", correctAnswer);
                startActivity(q5Intent);
            }
        });

        //Defines gridview and populates the grid
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        //Sets on click listener for each image in the grid, if the correct image is selected score is updated
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                switch (position){
                    case 0:
                        correctAnswer+=1;
                        q5answer = "Building";
                        break;
                    case 1:
                        correctAnswer+=0;
                        q5answer = "Shoe";
                        break;
                    case 2:
                        correctAnswer+=0;
                        q5answer = "Car";
                        break;
                    case 3:
                        correctAnswer+=0;
                        q5answer = "Seal";
                        break;
                }

                Toast.makeText(Question5.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}

