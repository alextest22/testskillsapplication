package com.example.alex.testskillsapplication.binding;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

/**
 * Created by alex on 05.03.18.
 */

public class RecyclerViewBindingAdapter {

    @BindingAdapter(value = {"app:adapter"})
    public static void bindMyLeagues( RecyclerView recyclerView,RecyclerView.Adapter adapter) {
            if (adapter != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

    }

}
