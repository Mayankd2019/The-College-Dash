package com.hfad.collegedash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClassCardAdapter extends RecyclerView.Adapter<ClassCardAdapter.ClassCardViewHolder> {

    ArrayList<CardClass> dataList;
    //public OnClickListener onClickListener;

    public ClassCardAdapter(ArrayList<CardClass> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ClassCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.class_card,parent,false);
        ClassCardViewHolder holder = new ClassCardViewHolder(cardView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClassCardViewHolder holder, int position) {
        CardClass currentItem = dataList.get(position);
        holder.imageView.setImageResource(currentItem.getmImageResourceId());
        holder.className.setText(currentItem.getmTextClassName());
        holder.attendanceBarText.setText(currentItem.getmTextAttendance());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }



    //this is the view holder
    public static class ClassCardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView className;
        TextView attendanceBarText;
        public ClassCardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.class_card_image);
            className = itemView.findViewById(R.id.class_card_name);
            attendanceBarText = itemView.findViewById(R.id.class_card_attendance_bar);
        }
    }



    //you have to settle the onClickListeners in here below with adding the precise interfaces which are public
    /*public interface OnClickListener {
        void onClassClicked(int position);
    }*/
}
