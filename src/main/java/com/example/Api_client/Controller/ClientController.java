package com.example.Api_client.Controller;


import com.example.Api_client.entities.Client;
import com.example.Api_client.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import  static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RestController
@RequestMapping(path = "client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
   public void Creer(@RequestBody  Client client){
        this.clientService.Creer(client);
   }
   @GetMapping(produces = APPLICATION_JSON_VALUE)
   public List<Client> recherche(){
        return this.clientService.rechercher();

    }
}
