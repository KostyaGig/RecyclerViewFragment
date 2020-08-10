package com.kostya_zinoviev.recyclreviewfragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ExampleViewHolder> {
    private ArrayList<Person> persons = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        Person currentIndex = persons.get(position);
        holder.tvName.setText(currentIndex.getName());
        holder.tvAge.setText(currentIndex.getAge());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }


    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvAge;
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.name);
            tvAge = itemView.findViewById(R.id.age);
        }
    }

}
