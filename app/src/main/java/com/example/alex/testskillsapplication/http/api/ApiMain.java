package com.example.alex.testskillsapplication.http.api;

import com.example.alex.testskillsapplication.http.model.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by alex on 04.03.18.
 */

public interface ApiMain {

        @GET("/news/dat/avto/1/")
        Observable<BaseResponse> getData();


}
