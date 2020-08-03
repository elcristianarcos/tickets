package com.example.tickets.model;

import android.util.Log;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.example.tickets.networking.ApiService;
import com.example.tickets.networking.RetrofitClient;

public class Repository {

    private ApiService apiInterface;
    private List<TicketObject> ticketObjectList;
    private MutableLiveData<List<TicketObject>> listMutableLiveData = new MutableLiveData<>();

    public Repository() {
        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiService.class);
    }

    public LiveData<List<TicketObject>> getTickets() {
        Call<List<TicketObject>> call = apiInterface.getTickets();
        call.enqueue(new Callback<List<TicketObject>>() {
            @Override
            public void onResponse(Call<List<TicketObject>> call, Response<List<TicketObject>> response) {
                ticketObjectList = response.body();
                listMutableLiveData.setValue(ticketObjectList);
            }

            @Override
            public void onFailure(Call<List<TicketObject>> call, Throwable t) {
                Log.d("Error - getTickets", t.getMessage());
            }
        });
        return null;
    }

}
