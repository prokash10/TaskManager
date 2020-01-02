package com.example.taskmanager.api;


import com.example.taskmanager.model.Users;
import com.example.taskmanager.serverresponse.ImageResponse;
import com.example.taskmanager.serverresponse.SignupResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Userapi {

        @POST("users/signup")
        Call<SignupResponse> registerUser(@Body Users users);


    @FormUrlEncoded
    @POST("users/login")
    Call<SignupResponse> checkUser(@Field("username") String username,@Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

    @GET("users/me")
    Call<Users> getUserDetails(@Header("Authorization") String token);


}
