package com.example.class2;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
   List<CategoryModel> list;
   Context context;
   Typeface font;

    public CategoryAdapter(List<CategoryModel> itemList, Context context) {
        this.list = itemList;
        this.context = context;
//        font = Typeface.createFromAsset(context.getAssets(), "null");
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_catogery_list, parent , false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryModel currentItem = list.get(position);
        holder.title_TV.setText(currentItem.getTitle());
        holder.image_IV.setImageDrawable(currentItem.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    ///////////////// VIEW HOLDER CLASS

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
             ImageView image_IV;
             TextView title_TV;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            image_IV = itemView.findViewById(R.id.image_category_item);
            title_TV = itemView.findViewById(R.id.title_category_item);
        }
    }
}
