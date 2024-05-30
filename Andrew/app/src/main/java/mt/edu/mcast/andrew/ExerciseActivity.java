package mt.edu.mcast.andrew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ExerciseAdapter adapter;
    private List<Exercise> exerciseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);

        recyclerView = findViewById(R.id.rvLegs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String category = getIntent().getStringExtra("category");
        exerciseList = getExercise(category);

        adapter = new ExerciseAdapter(exerciseList);
        recyclerView.setAdapter(adapter);

        Button btn = findViewById(R.id.btnHome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private List<Exercise> getExercise(String category){
        List<Exercise> exercises = new ArrayList<>();
        switch (category) {
            case "leg":
                exercises.add(new Exercise("Leg Curl", "Build bicep muscles", R.drawable.legs1));
                exercises.add(new Exercise("Tricep Extension", "Strengthen your triceps", R.drawable.legs2));
                exercises.add(new Exercise("Hammer Curl", "Target your brachialis", R.drawable.legs3));
                break;
            case "chest":
                exercises.add(new Exercise("Bicep Curl", "Build bicep muscles", R.drawable.chest1));
                exercises.add(new Exercise("To change", "Strengthen your triceps", R.drawable.chest2));
                exercises.add(new Exercise("To change", "Target your brachialis", R.drawable.chest3));
                break;
            case "arm":
                exercises.add(new Exercise("Bicep Curl", "Build bicep muscles", R.drawable.bicepcurls));
                exercises.add(new Exercise("Tricep Extension", "Strengthen your triceps", R.drawable.tricepdips));
                exercises.add(new Exercise("Hammer Curl", "Target your brachialis", R.drawable.hammercurl));
                break;
            case "shoulder":
                exercises.add(new Exercise("To change", "To change", R.drawable.shoulder1));
                exercises.add(new Exercise("To change", "To change", R.drawable.shoulder2));
                exercises.add(new Exercise("To change", "To change", R.drawable.shoulder3));
                break;
            case "back":
                exercises.add(new Exercise("Back bar pull", "To change", R.drawable.backbar));
                exercises.add(new Exercise("Pull up", "To change", R.drawable.backpullup));
                exercises.add(new Exercise("Dead-lift", "To change", R.drawable.backdeadlift));
                break;
        }

        return exercises;
    }
}