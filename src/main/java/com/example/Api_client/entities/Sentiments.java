package com.example.Api_client.entities;

import com.example.Api_client.enums.TypeSentiments;
import jakarta.persistence.*;

@Entity
@Table(name = "SENTIMENT")
public class Sentiments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String texte;
    private TypeSentiments type;
  @ManyToOne
    private Client client;


    public Sentiments() {

    }

    public Sentiments(int id, String texte, TypeSentiments type, Client client) {
        this.id = id;
        this.texte = texte;
        this.type = type;
        this.client = client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void setType(TypeSentiments type) {
        this.type = type;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public String getTexte() {
        return texte;
    }

    public TypeSentiments getType() {
        return type;
    }

    public Client getClient() {
        return client;
    }
}
