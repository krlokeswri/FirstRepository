package com.example.aswitch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    String[] DeviceNames;
    int[] Ltrs;
    Context context;

    public CustomAdapter(String[] DeviceNames, int[] Ltrs, Context applicationContext) {
        this.DeviceNames = DeviceNames;
        this.Ltrs = Ltrs;
        this.context = applicationContext;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View view = mInflater.inflate(R.layout.blocks_list_row, parent, false);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new CustomAdapter.ViewHolder(v);
    }

    /*
     * binds the data to the textview in each cell
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(DeviceNames[position]);
       // holder.ltr.setText(Ltrs[position]);
        holder.ltr.setText(String.valueOf(Ltrs[position]));
        //holder.myTextView.setTypeface(segoe);
    }

    /*
     * total number of list size
     */
    @Override
    public int getItemCount() {
        return DeviceNames.length;
    }



    public class ViewHolder  extends RecyclerView.ViewHolder{
        // init the item view's
        TextView name, ltr;
        CardView cv;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.Deice_Name);
            ltr = (TextView) itemView.findViewById(R.id.LTR_s);
            cv=itemView.findViewById(R.id.card_view);

        }
    }
}

/*

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        // set the data in items
        viewHolder.name.setText((CharSequence) DeviceNames.get(i));
        viewHolder.ltr.setText((Integer) Ltrs.get(i));


    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // infalte the item Layout
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;

    }*/
/*@Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        // set the data in items
        viewHolder.name.setText((CharSequence) DeviceNames.get(i));
        viewHolder.ltr.setText((Integer) Ltrs.get(i));


    }
*//*





    @Override
    public int getItemCount() {
        return DeviceNames.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name, ltr;

        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.Deice_Name);
            ltr = (TextView) itemView.findViewById(R.id.LTR_s);

        }
    }
}
*/
