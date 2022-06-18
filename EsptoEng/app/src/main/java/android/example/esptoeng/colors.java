package android.example.esptoeng;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<ColorList> col = new ArrayList<>();

        col.add(new ColorList(R.drawable.red,"rojo", "red"));
        col.add(new ColorList(R.drawable.blue,"azul", "blue"));
        col.add(new ColorList(R.drawable.green,"verde", "green"));
        col.add(new ColorList(R.drawable.yellow,"amarillo", "yellow"));
        col.add(new ColorList(R.drawable.orange,"anaranjado", "orange"));
        col.add(new ColorList(R.drawable.pink,"rosado", "pink"));
        col.add(new ColorList(R.drawable.purple,"morada/purpura", "purple"));
        col.add(new ColorList(R.drawable.gray,"gris", "gray"));
        col.add(new ColorList(R.drawable.white,"blanco", "white"));
        col.add(new ColorList(R.drawable.black,"negro", "black"));



        colorAdapter adapter = new colorAdapter(this, col);

        ListView listView = findViewById(R.id.list_item);

        listView.setAdapter(adapter);


    }
}