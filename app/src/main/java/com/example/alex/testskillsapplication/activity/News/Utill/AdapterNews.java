package com.example.alex.testskillsapplication.activity.News.Utill;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;
import com.example.alex.testskillsapplication.R;
import com.example.alex.testskillsapplication.activity.News.viewModel.NewsActivityViewModel;
import com.example.alex.testskillsapplication.databinding.ViewNewsItemsBinding;
import com.example.alex.testskillsapplication.http.model.Top;

import java.util.ArrayList;

/**
 * Created by alex on 05.03.18.
 */

public class  AdapterNews extends RecyclerView.Adapter<AdapterNews.BindingViewHolder> {
    private NewsActivityViewModel viewModel;
    private ArrayList<Top> mData;

    public AdapterNews(ArrayList<Top> mData,NewsActivityViewModel viewModel) {
        this.mData=mData;
        this.viewModel=viewModel;
    }

    @Override
    public AdapterNews.BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        ViewNewsItemsBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(context), R.layout.view_news_items, null, false);
        return new AdapterNews.BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
            holder.binding.setNews(mData.get(position));
            holder.binding.setVariable(BR.viewModel,viewModel);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class BindingViewHolder extends RecyclerView.ViewHolder {
        ViewNewsItemsBinding binding;

        public BindingViewHolder(ViewNewsItemsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
