package org.example;
public class Main {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();
        Perro perro = new Perro("Firu", new Collar("rojo"));
        Gato gato = new Gato("Misu");
        vet.atender(perro);  // polimorfismo
        vet.atender(gato);   // polimorfismo
        Animal a = new Perro("Rocky", new Collar("azul")); // upcasting
        if (a instanceof Perro) {
            Perro p = (Perro) a; // downcasting
            // acción específica de Perro, p.ej. p.saludar();
        }
        Caja<Animal> caja = new Caja<>();
        caja.guardar(gato); // genérico sin colecciones
        Animal guardado = caja.obtener();
        vet.atender(guardado);
    }
}
