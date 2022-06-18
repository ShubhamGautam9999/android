package android.example.esptoeng;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class phraseAdapter extends ArrayAdapter<PhraseList> {

    public phraseAdapter(Activity context, ArrayList<PhraseList> phrase){
        super(context, 0, phrase);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.phrase_list, parent, false);
        }

        PhraseList currentPhrase = getItem(position);

        TextView espPhrase = (TextView) listItemView.findViewById(R.id.esp_phrase);

        espPhrase.setText(currentPhrase.getEsp_phrase());

        TextView engPhrase = (TextView) listItemView.findViewById(R.id.eng_phrase);

        engPhrase.setText(currentPhrase.getEng_phrase());

        return listItemView;


    }
}
