package com.example.payoneer_task.retrofit;

import com.example.payoneer_task.model.RemoteData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {
    @GET("listresult.json")
    Call<RemoteData> getPaymentCards();
}
