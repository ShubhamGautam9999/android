package android.example.esptoeng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<FamilyList> fam = new ArrayList<>();

        fam.add(new FamilyList("padre", "father"));
        fam.add(new FamilyList("madre", "mother"));
        fam.add(new FamilyList("hijo", "son"));
        fam.add(new FamilyList("hija", "daughter"));
        fam.add(new FamilyList("hermano", "brother"));
        fam.add(new FamilyList("hermana", "sister"));
        fam.add(new FamilyList("tio", "uncle"));
        fam.add(new FamilyList("tia", "aunt"));
        fam.add(new FamilyList("sobrino", "nephew"));
        fam.add(new FamilyList("sobrina", "niece"));

        familyAdapter adapter = new familyAdapter(this, fam);

        ListView listView = findViewById(R.id.list_item);

        listView.setAdapter(adapter);

    }
}