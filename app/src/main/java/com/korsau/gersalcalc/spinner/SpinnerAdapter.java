package com.korsau.gersalcalc.spinner;

import com.korsau.gersalcalc.R;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SpinnerAdapter extends ArrayAdapter<String> {

    Context context;

    List<String> langList;

public SpinnerAdapter(Context context, List<String> langs){

    super(context, R.layout.my_selected_item, langs);
    this.context = context;
    this.langList = langs;

}

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
    LayoutInflater inflater = (LayoutInflater)  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View row = inflater.inflate(R.layout.lang_dropdown_item, parent, false);

    TextView lang = row.findViewById(R.id.langText);
    ImageView flag = row.findViewById(R.id.flag); //id flag and id langText are in res -> layout folder -> lang_dropdown_item



    Resources res = context.getResources();
    String drawableName = langList.get(position).toLowerCase();
    int resId = res.getIdentifier(drawableName, "drawable", context.getPackageName());
    Drawable drawable = res.getDrawable(resId);

    lang.setText(langList.get(position));
    flag.setImageDrawable(drawable);

    return row;

}


}
