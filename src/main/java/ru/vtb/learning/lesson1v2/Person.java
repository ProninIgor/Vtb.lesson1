package ru.vtb.learning.lesson1v2;

public class Person {
    private String name;
    private Transport transport;


    public Person(String name) {
        this.name = name;
    }

    public void Ride(Transport transport) throws Exception {
        if (this.transport != null){
            throw new Exception("Мы уже двигаемся, нужно остановиться");
        }

        this.transport = transport;
        System.out.println(this.name + " начал передвигаться на транспорте типа " + this.transport.getName());
    }

    public void Stop(){
        System.out.println(this.name + " прекратил движение на транспорте типа " + this.transport.getName());
        this.transport = null;

    }
}
