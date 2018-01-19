package com.sabel.jpaBeispiel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("König", 44);
        person.setAdresse(new Adresse("Hauptstr","55","Roth", 91154));

        Person person1 = new Person("Meyer", 33);
        person1.setAdresse(new Adresse("Nebenstr","22", "Hilpoltstein", 91161));

        Person person2 = new Person("Huber", 22);
        person2.setAdresse(new Adresse("Hintere Strasse", "11", "Nürnberg", 91111));


        PersonService ps = new PersonService();
        ps.speichern(person);
        ps.speichern(person1);
        ps.speichern(person2);

        Person personAusDB = ps.findePerson(1);
        System.out.println(personAusDB.toString());

        List<Person> personen = ps.gibAllePersonen();
        for (Person p : personen) {
            System.out.println(p.toString());
        }
        ps.close();

    }

}
