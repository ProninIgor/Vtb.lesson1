package ru.vtb.learning.lesson1;

public class Person {
    private String name;

    public void Ride(Skateboard skateboard){
        System.out.println("Человек начал передвигаться на транспорте типа Скейтборд");
    }

    public void Ride(Motorcycle motorcycle){
        System.out.println("Человек начал передвигаться на транспорте типа Мотоцикл");
    }

    public void Ride(Car car){
        System.out.println("Человек начал передвигаться на транспорте типа Машина");
    }


    public void Stop(){
        System.out.println("Человек остановился");
    }
}
