package com.example.flower;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UsersAPI {
    @GET("auth/user")
    Call<List<Users>> getData();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://cinema.areas.su/auth/register")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @POST("auth/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

    @POST("auth/register")
    Call<RegisterResponse> registerUsers(@Body RegisterRequest registerRequest);
}