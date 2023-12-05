package org.campusmolndal.jinh23.sveeri70;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnimalFacade animalFacade = new AnimalFacade("mongodb://localhost:27017", "djurdatabas", "djur");
        Animal animal = new Animal();
        animal.setName("Sixten");
        animal.setAge(5);
        animal.setSpecies("Dog");
        animalFacade.addAnimal(animal);
    }}
