package com.example.payoneer_task.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.payoneer_task.R;
import com.example.payoneer_task.adapter.ListResultRecyclerAdapter;
import com.example.payoneer_task.model.Applicable;
import com.example.payoneer_task.model.RemoteData;
import com.example.payoneer_task.view_model.RemoteDataViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private RecyclerView recycler_view;
    private ProgressBar progress_bar;

    private LinearLayoutManager layoutManager;
    private ArrayList<RemoteData> remoteDataArrayList = new ArrayList<>();
    private  ArrayList<Applicable> applicablesList = new ArrayList<>();
    RemoteDataViewModel remoteDataViewModel;
    private ListResultRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getRemoteData();
    }

    private void init() {
        progress_bar = findViewById(R.id.progress_bar);
        recycler_view = findViewById(R.id.recycler_view);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recycler_view.setLayoutManager(layoutManager);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recycler_view.setHasFixedSize(true);

        // adapter
//        mRecyclerView = view.findViewById(R.id.id_list_recyclerview);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new MovieArticleAdapter(MainActivity.this, articleArrayList);
        adapter = new ListResultRecyclerAdapter(MainActivity.this, applicablesList);
        recycler_view.setAdapter(adapter);

        // View Model
        remoteDataViewModel = new ViewModelProvider(this).get(RemoteDataViewModel.class);
//        articleViewModel = ViewModelProviders.of(this).get(ArticleViewModel.class);
    }
    private void getRemoteData() {
        remoteDataViewModel.getPaymentList() .observe(this, remoteData -> {
            if (remoteData != null  && remoteData.getPayment() != null ) {
                progress_bar.setVisibility(View.GONE);
                adapter.setValues(remoteData.getNetworks().getApplicable());
                applicablesList.addAll(remoteData.getNetworks().getApplicable());
                adapter.notifyDataSetChanged();
            }
        });
    }
}