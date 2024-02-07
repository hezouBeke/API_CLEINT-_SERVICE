package com.example.Api_client.repository;


import com.example.Api_client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client , Integer> {
   Client findByEmail( String email);
   Client finById(Integer id);
}
