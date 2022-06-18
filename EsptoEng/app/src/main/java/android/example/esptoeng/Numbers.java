package android.example.esptoeng;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<NumberList> num = new ArrayList<NumberList>();

        num.add(new NumberList(R.drawable.zero, "cero", "zero"));
        num.add(new NumberList(R.drawable.one,"uno", "one"));
        num.add(new NumberList(R.drawable.two,"dos", "two"));
        num.add(new NumberList(R.drawable.three,"tres", "three"));
        num.add(new NumberList(R.drawable.four,"cuatro", "four"));
        num.add(new NumberList(R.drawable.five,"cinco", "five"));
        num.add(new NumberList(R.drawable.six,"seis", "six"));
        num.add(new NumberList(R.drawable.seven,"siete", "seven"));
        num.add(new NumberList(R.drawable.eight,"ocho", "eight"));
        num.add(new NumberList(R.drawable.nine,"nueve", "nine"));




        numberAdapter adapter = new numberAdapter(this, num);

        ListView listView = findViewById(R.id.list_item);

        listView.setAdapter(adapter);

    }
}