package com.example.alex.testskillsapplication.activity.News;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alex.testskillsapplication.R;
import com.example.alex.testskillsapplication.activity.News.viewModel.NewsActivityViewModel;
import com.example.alex.testskillsapplication.databinding.ActivityNewsBinding;
import com.example.alex.testskillsapplication.http.model.Top;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {
public static final String TAG_DATA="tagInputData";
private ActivityNewsBinding binding;
private NewsActivityViewModel viewModel;

    public static void getInstanse(Context activity, ArrayList<Top> news){
        Intent intentOpen = new Intent(activity,NewsActivity.class);
        Bundle args = new Bundle();
        args.putParcelableArrayList(TAG_DATA,news);
        intentOpen.putExtras(args);
        activity.startActivity(intentOpen);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel=new NewsActivityViewModel(this);

        ActivityNewsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_news);
        binding.setViewModel(viewModel);
        setContentView(binding.getRoot());
    }
}
