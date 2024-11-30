package com.example.task01test03;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button finishbutton;
    ImageView iv1jk , iv2em , iv3emneim , iv4ae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        iv1jk = findViewById(R.id.imagejk);
        iv1jk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,Page2.class));
            }

        });


        iv2em = findViewById(R.id.elonmusk);
        iv2em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Page3.class));
            }
        });

        iv3emneim = findViewById(R.id.eminemimage);
        iv3emneim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Page4.class));
            }
        });

        iv4ae = findViewById(R.id.albertimage);
        iv4ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Page5.class));
            }
        });


        finishbutton = findViewById(R.id.exitbuttonmain);
        finishbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });












        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void myfunc(){
        System.out.println("Test");
    }
}