package com.example.tickets.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tickets.model.TicketObject;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tickets.databinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterListadoTicket extends RecyclerView.Adapter<AdapterListadoTicket.ListadoPerroViewHolder> {

    private List<TicketObject> listTicket = new ArrayList<>();
    private PasarListaTicket listenerListaTicket;

    public AdapterListadoTicket(PasarListaTicket pasarListaTicket) {
        listenerListaTicket = pasarListaTicket;
    }

    @NonNull
    @Override
    public AdapterListadoTicket.ListadoPerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListadoTicket.ListadoPerroViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface PasarListaTicket{
        void pasarListaTicket(String subject);
    }

}
