package com.example.tickets.viewmodel;

import com.example.tickets.model.Repository;
import com.example.tickets.model.TicketObject;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelTicket extends ViewModel {
    private Repository repository;

    public ViewModelTicket() {
        repository = new Repository();
    }

    public LiveData<List<TicketObject>> observerListTicket() {
        return repository.getTickets();
    }

}
