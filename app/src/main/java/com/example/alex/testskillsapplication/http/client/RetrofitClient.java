package com.example.alex.testskillsapplication.http.client;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.alex.testskillsapplication.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {
    private static final int MAX_RETRY = 3;

    private static Retrofit retrofit      = null;


    public static Retrofit getClient(Context context, @NonNull Gson gsonCustom) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(context.getResources().getString(R.string.url_base))
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gsonCustom))
                .build();

        return retrofit;
    }

    public static Retrofit getClient(Context context) {
        Gson gson = new GsonBuilder()
                    .serializeNulls()
                    .setPrettyPrinting()
                    .setLenient()
                    .create();
        return getClient(context,gson);
    }





}