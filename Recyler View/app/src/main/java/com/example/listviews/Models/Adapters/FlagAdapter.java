package com.example.listviews.Models.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listviews.Models.FlagModel;
import com.example.listviews.R;

import java.util.List;

public class FlagAdapter extends RecyclerView.Adapter<FlagAdapter.ViewHolder> {

    private List<FlagModel> flagList; // List to hold FlagModel data

    // Constructor
    public FlagAdapter(List<FlagModel> flagList) {
        this.flagList = flagList;
    }

    // onCreateViewHolder: Inflate the layout (sample_recyclerview.xml)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sample_recycler, parent, false);  // CardView Layout
        return new ViewHolder(itemView);  // Return new ViewHolder instance
    }

    // onBindViewHolder: Bind data to the views (ImageView and TextView)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FlagModel currentFlag = flagList.get(position);
        holder.imageView.setImageResource(currentFlag.getImage1());  // Set Image
        holder.textView.setText(currentFlag.getText());  // Set Text
    }

    // getItemCount: Return the number of items in the list
    @Override
    public int getItemCount() {
        return flagList.size();
    }

    // ViewHolder Class: Holds references to the views for each item
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;  // ImageView for image (in CardView)
        TextView textView;    // TextView for text (country name)

        // Constructor for ViewHolder
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView); // Get the ImageView
            textView = itemView.findViewById(R.id.textView);   // Get the TextView
        }
    }
}
