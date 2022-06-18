package android.example.esptoeng;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class numberAdapter extends ArrayAdapter<NumberList> {

    public numberAdapter(Activity context, ArrayList<NumberList> num) {
        super(context, 0, num);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.number_list, parent, false);
        }

        NumberList currentNum = getItem(position);

        ImageView Number_img = (ImageView) listItemView.findViewById(R.id.number_image);

        Number_img.setImageResource(currentNum.getNum_image());

        TextView espNumber = (TextView) listItemView.findViewById(R.id.esp_num);

        espNumber.setText(currentNum.getEsp_number());


        TextView engNumber = (TextView) listItemView.findViewById(R.id.eng_num);

        engNumber.setText(currentNum.getEng_number());

        return listItemView;
    }
}
