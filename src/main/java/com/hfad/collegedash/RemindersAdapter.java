package com.hfad.collegedash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RemindersAdapter extends RecyclerView.Adapter<RemindersAdapter.ReminderViewHolder> {

    private ArrayList<RemindersCard> dataList;

    public RemindersAdapter(ArrayList<RemindersCard> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ReminderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.reminders_card,parent,false);
        ReminderViewHolder reminderViewHolder = new ReminderViewHolder(v);
        return reminderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReminderViewHolder holder, int position) {
        RemindersCard remindersCard = dataList.get(position);
        holder.imageView.setImageResource(remindersCard.getmImageResourceId());
        holder.title.setText(remindersCard.getTitle());
        holder.desc.setText(remindersCard.getDesc());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }





    public static class ReminderViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView title;
        private TextView desc;
        public ReminderViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.image_reminder);
            this.title = itemView.findViewById(R.id.text_title);
            this.desc = itemView.findViewById(R.id.text_desc);
        }
    }
}
