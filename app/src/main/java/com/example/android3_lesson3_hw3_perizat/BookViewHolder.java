package com.example.android3_lesson3_hw3_perizat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {
    private ImageView bookImage;
    private TextView bookTitle;
    private TextView bookDescription;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Book book){
        bookImage=itemView.findViewById(R.id.image_view_icon);
        bookTitle=itemView.findViewById(R.id.text_view_title);
        bookDescription=itemView.findViewById(R.id.text_view_description);

        bookImage.setImageResource(book.image);
        bookTitle.setText(book.name);
        bookDescription.setText(book.description);

    }
}
