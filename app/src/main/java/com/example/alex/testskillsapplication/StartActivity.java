package com.example.alex.testskillsapplication;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alex.testskillsapplication.activity.News.NewsActivity;
import com.example.alex.testskillsapplication.databinding.ActivityMainBinding;
import com.example.alex.testskillsapplication.http.api.ApiMain;
import com.example.alex.testskillsapplication.http.client.RetrofitClient;
import com.example.alex.testskillsapplication.http.model.BaseResponse;
import com.example.alex.testskillsapplication.http.model.Top;

import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class StartActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String version = "";
        try {
            PackageInfo pInfo = this.getPackageManager().getPackageInfo(getPackageName(), 0);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVersion(version);
        setContentView(binding.getRoot());
        LoadData();
        context=this;
    }

    private void LoadData(){
        RetrofitClient.getClient(this).create(ApiMain.class).getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(BaseResponse response) {
                        NewsActivity.getInstanse(context ,new ArrayList<Top>(response.getTops()));
                        finish();
                    }


                    @Override
                    public void onError(@NonNull Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
