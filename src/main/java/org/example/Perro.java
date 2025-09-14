package org.example;

public class Perro extends Animal {
    private Collar collar;
    public Perro(String nombre, Collar collar) {
        super(nombre);
        this.collar = collar;
    }
    @Override
    public void sonido() {
        System.out.println(nombre + " dice: Guau Guau");
    }
    public void saludar() {
        System.out.println(nombre + " mueve la cola.");
    }
}