package com.jk.lab04_idnp;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter{
    private Context context;
    private ArrayList<Estudiante>listItems;

    public Adaptador(Context context, ArrayList<Estudiante> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    Estudiante item=(Estudiante) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        TextView tvNombre=(TextView)convertView.findViewById(R.id.nombre);
        TextView tvApellidos=(TextView)convertView.findViewById(R.id.apellidos);
        TextView tvCui=(TextView)convertView.findViewById(R.id.cui);

        tvNombre.setText(item.getNombre());
        tvApellidos.setText(item.getApellido());
        tvCui.setText(item.getCui());

        return convertView;
    }
}
