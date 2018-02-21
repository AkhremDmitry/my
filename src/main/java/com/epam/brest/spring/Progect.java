package com.epam.brest.spring;

public class Progect {
    String name;
    Manager manager;

    public Progect(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Progect{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }
}
