public class CondicionalIf {
    public static void main(String[] args) {
        //Parte 01
        int numeroIf = -10;
        if(numeroIf > 0){
            System.out.println("La variable es positiva");
        } else if (numeroIf == 0) {
            System.out.println("La variable es 0");
        } else if (numeroIf < 0) {
            System.out.println("La variable es negativa");
        }
    }
}