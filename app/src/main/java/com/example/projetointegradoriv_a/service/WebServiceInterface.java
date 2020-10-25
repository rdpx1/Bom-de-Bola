package com.example.projetointegradoriv_a.service;

import com.example.projetointegradoriv_a.classes.Time;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WebServiceInterface {

//    @GET("$2y$12$C5B9ilbmPXWtsH8RYj7GbOamWTbRbQFYvpsB3T3g7VahHx7gJYPum")
    @GET("1")
    Call<List<Time>> getExample();

}
