package org.campusmolndal.jinh23.sveeri70;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

public class AnimalFacade {
    private MongoDatabase database;
    private MongoClient mongoClient;
    private MongoCollection<Document> collection;

    public AnimalFacade(String connectionString, String databaseName, String collectionName) {
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase(databaseName);
        collection = database.getCollection(collectionName);
    }

    public void addAnimal(Animal animal) {
        // Skapa ett dokument
        // Lägg till dokumentet i databasen
    }

    public Animal getAnimal(String name) {
        // Hämta ett dokument från databasen
        // Skapa ett Animal objekt
        // Returnera Animal objektet
    }

    public List<Animal> getAllAnimals() {
        // Hämta alla dokument från databasen
        // Skapa en lista av Animal objekt
        // Returnera listan
    }

    public void updateAnimal(Animal animal) {
        // Skapa ett dokument
        // Uppdatera dokumentet i databasen
    }

    public void deleteAnimal(String name) {
        // Ta bort ett dokument från databasen
    }
}