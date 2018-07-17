package sg.edu.rp.dmsd.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by 17010603 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<DoList> doList;



    public CustomAdapter(@NonNull Context context, int resource,  @NonNull ArrayList<DoList> objects) {
        super(context, resource,  objects);
        parent_context = context;
        layout_id = resource;
        doList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvList = rowView.findViewById(R.id.textViewList);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        DoList currentList = doList.get(position);
        tvList.setText(currentList.getList());
        tvDate.setText(currentList.getDateString());
        return  rowView;

    }
}
