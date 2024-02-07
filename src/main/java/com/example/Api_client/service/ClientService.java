package com.example.Api_client.service;

import com.example.Api_client.entities.Client;
import com.example.Api_client.repository.ClientRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
        Client clientDansLaBDD = this.clientRepository.findByEmail(client.getEmail());
         if (clientDansLaBDD == null){
             this.clientRepository.save(client);
         }
    }

    public Optional<Client> lire(int id){
        return this.clientRepository.findById(id);
    }
}
