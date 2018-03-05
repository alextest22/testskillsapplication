package com.example.alex.testskillsapplication.activity.News.viewModel;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.util.Log;

import com.example.alex.testskillsapplication.BR;
import com.example.alex.testskillsapplication.R;
import com.example.alex.testskillsapplication.activity.News.NewsActivity;
import com.example.alex.testskillsapplication.activity.News.Utill.AdapterNews;
import com.example.alex.testskillsapplication.http.model.Top;

import java.util.ArrayList;
import java.util.List;

import static com.example.alex.testskillsapplication.activity.News.NewsActivity.TAG_DATA;

/**
 * Created by alex on 05.03.18.
 */

public class NewsActivityViewModel extends BaseObservable {
    private NewsActivity activity;
    private ArrayList<Top> list;
    private AdapterNews adapter;

    public NewsActivityViewModel(NewsActivity activity) {
        this.activity=activity;
        if (activity.getIntent().getExtras() != null) {
            list=activity.getIntent().getExtras().getParcelableArrayList(TAG_DATA);
        }
       Log.e("sdfsdf","size "+list.size());
       setAdapter(new AdapterNews(list,this));
    }

    public void openTab(Top news){
        if(news!=null) {
            String url = news.getUrl();
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(activity, Uri.parse(url));
        }
    }

    @Bindable
    public AdapterNews getAdapter() {
        return adapter;
    }


    public void setAdapter(AdapterNews adapter) {
        this.adapter = adapter;
        notifyPropertyChanged(BR.adapter);
    }
}
