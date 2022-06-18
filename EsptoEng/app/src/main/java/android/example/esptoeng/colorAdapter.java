package android.example.esptoeng;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class colorAdapter extends ArrayAdapter<ColorList> {

    public colorAdapter(Activity context, ArrayList<ColorList> col){
        super(context, 0, col);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.color_list, parent, false);
        }

        ColorList currentCol = getItem(position);

        ImageView Color_Img = (ImageView) listItemView.findViewById(R.id.Color_images);

        Color_Img.setImageResource(currentCol.getColor_Image());

        TextView espColor = (TextView) listItemView.findViewById(R.id.esp_color);

        espColor.setText(currentCol.getEsp_color());

        TextView engColor = (TextView) listItemView.findViewById(R.id.eng_color);

        engColor.setText(currentCol.getEng_color());

        return listItemView;
    }
}
