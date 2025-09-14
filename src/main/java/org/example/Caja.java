// src/main/java/org/example/Caja.java
package org.example;

public class Caja<T> {
    private T objeto;
    public void guardar(T objeto) { this.objeto = objeto; }
    public T obtener() { return objeto; }
}