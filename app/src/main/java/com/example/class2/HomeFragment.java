package com.example.class2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";
    View view;
    RecyclerView recyclerViewCategory;
    CategoryAdapter categoryAdapter;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container , false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        Log.d(TAG, "initView: is ok");
        recyclerViewCategory = view.findViewById(R.id.recycler_category_homeFragment);
        recyclerViewCategory.setHasFixedSize(true);
        categoryAdapter = new CategoryAdapter(makeFakeArrayList(getContext()), getContext());

        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(getContext() , RecyclerView.HORIZONTAL , false));
        recyclerViewCategory.setAdapter(categoryAdapter);
    }


    private List<CategoryModel> makeFakeArrayList(Context context) {
        List<CategoryModel> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            CategoryModel item = new CategoryModel();
            switch (i) {
                case 0:
                    item.setImage(ContextCompat.getDrawable(context, R.drawable.ic_baseline_accessibility_24));
                    item.setTitle("کفش ");

//                        item.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//
//                            }
//                        });
                    break;
                case 1:
                    item.setImage(ContextCompat.getDrawable(context, R.drawable.ic_baseline_accessibility_24));
                    item.setTitle("پوشاک");
////                        item.setOnClickListener(new View.OnClickListener() {
////                               @Override
////                               public void onClick(View view) {
////
////                               }
////                           });
                    break;
                case 2:
                    item.setImage(ContextCompat.getDrawable(context, R.drawable.ic_baseline_accessibility_24));
                    item.setTitle("کالای دیجیتال");
////                          item.setOnClickListener(new View.OnClickListener() {
////                                 @Override
////                                 public void onClick(View view) {
////
////                                 }
////                             });
                    break;
                case 3:
                    item.setImage(ContextCompat.getDrawable(context, R.drawable.ic_baseline_accessibility_24));
                    item.setTitle("کل لیست");
////                          item.setOnClickListener(new View.OnClickListener() {
////                                 @Override
////                                 public void onClick(View view) {
////
////                                 }
////                             });
                    break;
//
                case 4:
                    item.setImage(ContextCompat.getDrawable(context, R.drawable.ic_baseline_accessibility_24));
                    item.setTitle("مبل");
////                          item.setOnClickListener(new View.OnClickListener() {
////                                 @Override
////                                 public void onClick(View view) {
////
////                                 }
////                             });
                    break;
            }
            arrayList.add(item);


        }

        return arrayList;

    }

}
