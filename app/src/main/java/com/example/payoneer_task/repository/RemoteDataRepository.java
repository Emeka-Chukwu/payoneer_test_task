package com.example.payoneer_task.repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.payoneer_task.model.RemoteData;
import com.example.payoneer_task.retrofit.ApiRequest;
import com.example.payoneer_task.retrofit.RetrofitApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RemoteDataRepository {
    private static final String TAG = RemoteDataRepository.class.getSimpleName();
    private final ApiRequest apiRequest;
    public RemoteDataRepository() {
        apiRequest = RetrofitApi.getRetrofitInstance().create(ApiRequest.class);
    }

    public LiveData<RemoteData> getPaymentcardList() {

        final MutableLiveData<RemoteData> data = new MutableLiveData<>();
        apiRequest.getPaymentCards()
                .enqueue(new Callback<RemoteData>() {

                    @Override
                    public void onResponse(Call<RemoteData> call, Response<RemoteData> response) {

                        Log.d(TAG, logResponse(response.code()));

                        if (response.body() != null) {
                            data.setValue(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<RemoteData> call, Throwable t) {
                        data.setValue(null);
                    }
                });

        return  data;

    }

    String logResponse(int response){
        String message = "";
        switch(response){
            case 200:
                message = "message: successfully retrieved data";
                break;
            case 404:
                message = "message: No record found";
                break;
            case 500:
                message ="message: Internal server error";
                break;
        }
        return message;
    }

}
