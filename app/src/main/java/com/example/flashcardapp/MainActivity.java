package com.example.flashcardapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcardQuestion = findViewById(R.id.flashcard_question);
        TextView flashcardAnswer = findViewById(R.id.flashcard_answer);
        flashcardQuestion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.INVISIBLE);
                flashcardAnswer.setVisibility(View.VISIBLE);
            }
        });
        flashcardAnswer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.VISIBLE);
                flashcardAnswer.setVisibility(View.INVISIBLE);
            }
        });

        TextView flashcardAnswer1 = findViewById(R.id.flashcard_answer1);
        flashcardAnswer1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                flashcardAnswer1.setBackgroundColor(Color.parseColor("red"));
            }
        });

        TextView flashcardAnswer2 = findViewById(R.id.flashcard_answer2);
        flashcardAnswer2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                flashcardAnswer2.setBackgroundColor(Color.parseColor("red"));
            }
        });

        TextView flashcardAnswer3 = findViewById(R.id.flashcard_answer3);
        flashcardAnswer3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                flashcardAnswer3.setBackgroundColor(Color.parseColor("green"));
            }
        });
    }
}