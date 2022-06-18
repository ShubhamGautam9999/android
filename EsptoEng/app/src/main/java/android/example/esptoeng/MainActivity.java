package android.example.esptoeng;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capture our view from layout
        ImageView ImageView1 = (ImageView)findViewById(R.id.numbers);
        // Register the onClick listener with the implementation above
        ImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumber();
            }
        });

        // Capture our view from layout
        ImageView ImageView2 = (ImageView)findViewById(R.id.family);
        // Register the onClick listener with the implementation above
        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openFamily();
            }
        });

        // Capture our view from layout
        ImageView ImageView3 = (ImageView)findViewById(R.id.colors);
        // Register the onClick listener with the implementation above
        ImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openColors();
            }
        });

        // Capture our view from layout
        ImageView ImageView4 = (ImageView)findViewById(R.id.phrases);
        // Register the onClick listener with the implementation above
        ImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openPhrases();
            }
        });



    }

    public void openNumber() {

        Intent Intent = new Intent(this, Numbers.class);
        startActivity(Intent);

    }

    public void openFamily() {

        Intent Intent = new Intent(this, FamilyMembers.class);
        startActivity(Intent);

    }

    public void openColors() {

        Intent Intent = new Intent(this, colors.class);
        startActivity(Intent);

    }

    public void openPhrases() {

        Intent Intent = new Intent(this, phrases.class);
        startActivity(Intent);

    }

}




