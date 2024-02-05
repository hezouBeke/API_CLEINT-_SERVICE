package com.example.Api_client.Controller;


import com.example.Api_client.entities.Client;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "client")
public class ClientController {
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping 
   public void Creer(@RequestBody  Client client){

   }
}
