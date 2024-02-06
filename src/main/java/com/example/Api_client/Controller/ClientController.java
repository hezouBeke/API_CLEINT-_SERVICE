package com.example.Api_client.Controller;


import com.example.Api_client.entities.Client;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import  static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RestController
@RequestMapping(path = "client")
public class ClientController {
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
   public void Creer(@RequestBody  Client client){

   }
}
