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

public class familyAdapter extends ArrayAdapter<FamilyList> {

    public familyAdapter(Activity context, ArrayList<FamilyList> fam){
        super(context, 0, fam);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.family_list, parent, false);
        }
       FamilyList currentFam = getItem(position);

        TextView espFamily = (TextView) listItemView.findViewById(R.id.esp_family);

        espFamily.setText(currentFam.getEsp_family());

        TextView engFamily = (TextView) listItemView.findViewById(R.id.eng_family);

        engFamily.setText(currentFam.getEng_family());

        return listItemView;
    }
}


