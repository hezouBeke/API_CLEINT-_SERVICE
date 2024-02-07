package com.example.Api_client.service;

import com.example.Api_client.entities.Client;
import com.example.Api_client.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public List<Client> rechercher(){
        return this.clientRepository.findAll();
    }

    public void Creer(Client client){
       this.clientRepository.save(client);
    }
}
