package com.galileoguzman.coffeedroid;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by galileoguzman on 31/03/15.
 */
public class ListViewAdapter extends BaseAdapter {
    // Declare Variables
    Context mContext;
    LayoutInflater inflater;
    private List<Panaderia> panaderiaList = null;
    private ArrayList<Panaderia> arraylist;

    public ListViewAdapter(Context context,
                           List<Panaderia> worldpopulationlist) {
        mContext = context;
        this.panaderiaList = worldpopulationlist;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<Panaderia>();
        this.arraylist.addAll(worldpopulationlist);
    }

    public class ViewHolder {
        TextView name;
        TextView description;
    }

    @Override
    public int getCount() {
        return panaderiaList.size();
    }

    @Override
    public Panaderia getItem(int position) {
        return panaderiaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item, null);

            // Locate the TextViews in listview_item.xml
            holder.name = (TextView) view.findViewById(R.id.txtNombre);
            holder.description = (TextView) view.findViewById(R.id.txtDescripcion);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(panaderiaList.get(position).getNombrePanaderia());
        holder.description.setText(panaderiaList.get(position).getDescripcionPanaderia());



        return view;
    }
}
