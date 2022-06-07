package com.example.retrofitpractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataApi {

    @GET("posts")
    Call<List<DataModel>> getModel();

}
