package android.example.esptoeng;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);



        final ArrayList<PhraseList> phrase = new ArrayList<>();

        phrase.add(new PhraseList("Buenos dias", "Good Morning", R.raw.goodmorn));
        phrase.add(new PhraseList("Buenas tardes", "Good Afternoon", R.raw.goodaft));
        phrase.add(new PhraseList("Buenas noches", "Good Evening/Night", R.raw.goodnig));
        phrase.add(new PhraseList("Como estas?", "How are you?", R.raw.como));
        phrase.add(new PhraseList("Muy bien", "Very well", R.raw.well));
        phrase.add(new PhraseList("Muchas Gracias", "Thank you very much", R.raw.thank));
        phrase.add(new PhraseList("Lo siento", "I'm sorry", R.raw.sorry));
        phrase.add(new PhraseList("perdon", "pardon/excuse me", R.raw.excuse));
        phrase.add(new PhraseList("Por favor", "Please", R.raw.please));
        phrase.add(new PhraseList("Adios", "So long", R.raw.solong));
        phrase.add(new PhraseList("Ciao", "Bye", R.raw.bye));

        phraseAdapter adapter = new phraseAdapter(this, phrase);

        ListView listView = findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PhraseList phraseList = phrase.get(position);
                mediaPlayer = MediaPlayer.create(phrases.this, phraseList.getAudio_phrase());
                mediaPlayer.start();
            }
        });

    }
}