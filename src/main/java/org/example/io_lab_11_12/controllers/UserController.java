package org.example.io_lab_11_12.controllers;

import org.example.io_lab_11_12.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Jan", "Kowalski", "jan.kowalski@example.com", "500100200"));
        users.add(new User(2, "Anna", "Nowak", "anna.nowak@example.com", "500100201"));
        users.add(new User(3, "Piotr", "Zieliński", "piotr.zielinski@example.com", "500100202"));
        users.add(new User(4, "Katarzyna", "Wiśniewska", "katarzyna.wisniewska@example.com", "500100203"));
        users.add(new User(5, "Marek", "Wójcik", "marek.wojcik@example.com", "500100204"));
        users.add(new User(6, "Agnieszka", "Krawczyk", "agnieszka.krawczyk@example.com", "500100205"));
        users.add(new User(7, "Tomasz", "Mazur", "tomasz.mazur@example.com", "500100206"));
        users.add(new User(8, "Magdalena", "Kaczmarek", "magdalena.kaczmarek@example.com", "500100207"));
        users.add(new User(9, "Paweł", "Grabowski", "pawel.grabowski@example.com", "500100208"));
        users.add(new User(10, "Ewa", "Zając", "ewa.zajac@example.com", "500100209"));

        return users;
    }

}
