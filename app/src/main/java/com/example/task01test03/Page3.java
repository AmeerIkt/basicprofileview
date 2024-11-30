package com.example.task01test03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//elon musk page
public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button exitbut = findViewById(R.id.backbuttonpage3);
        exitbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

        Button likebut = findViewById(R.id.likeuttonpage3);
        likebut.setOnClickListener(new View.OnClickListener() {
            private boolean isLiked = false; // Tracks the like state

            @Override
            public void onClick(View v) {
                // Toggle like state
                isLiked = !isLiked;

                // Update UI and show a toast
                if (isLiked) {
                    likebut.setText("Liked");
                    Toast.makeText(Page3.this, "You liked this!", Toast.LENGTH_SHORT).show();
                } else {
                    likebut.setText("Like");
                    Toast.makeText(Page3.this, "You unliked this!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}