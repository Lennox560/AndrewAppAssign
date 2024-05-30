package mt.edu.mcast.andrew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnChest;
    Button btnBack;
    Button btnShoulder;
    Button btnArm;
    Button btnLeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnChest = findViewById(R.id.btnChest);
        btnBack = findViewById(R.id.btnBack);
        btnShoulder = findViewById(R.id.btnShoulder);
        btnArm = findViewById(R.id.btnArm);
        btnLeg = findViewById(R.id.btnLeg);

        btnChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("chest");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("back");
            }
        });

        btnShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("shoulder");
            }
        });

        btnArm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("arm");
            }
        });

        btnLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("leg");
            }
        });

    }

    private void openExerciseList(String category){
        Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }




}