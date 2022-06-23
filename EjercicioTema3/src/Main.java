public class Main {
    public static void main(String[] args) {
        //Parte 1
        suma(7, 4, 1);

        //Parte 2
        Coche miCoche= new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.numeroPuertas);

    }
    //Parte 1
    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}

//Parte 2
class Coche{
    public int numeroPuertas=0;

    public void agregarPuertas(){
        this.numeroPuertas++;
    }
}
