package com.example.tickets.networking;

import com.example.tickets.model.TicketObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("TicketSAP")
    Call<List<TicketObject>> getTickets();
}
