package com.example.payoneer_task.view_model;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.AndroidViewModel;

import com.example.payoneer_task.model.RemoteData;
import com.example.payoneer_task.repository.RemoteDataRepository;

public class RemoteDataViewModel extends  AndroidViewModel {
    private RemoteDataRepository repository;
    private LiveData<RemoteData> remoteLiveDataLiveData;

    public  RemoteDataViewModel(@NonNull Application application){
        super(application);
        repository = new RemoteDataRepository();
        remoteLiveDataLiveData  = repository.getPaymentcardList();
    }

    public  LiveData<RemoteData> getPaymentList(){
        return  remoteLiveDataLiveData;
    }
}


