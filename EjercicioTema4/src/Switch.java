public class Switch {
    public static void main(String[] args) {
        String estacion = "AAAA";
        switch (estacion){
            case "INVIERNO":
                System.out.println("La estacion es Invierno.");
                break;
            case "VERANO":
                System.out.println("La estacion es Verano.");
                break;
            case "OTOÑO":
                System.out.println("La estacion es Otoño.");
                break;
            case "PRIMAVERA":
                System.out.println("La estacion es Primavera.");
                break;
            default:
                System.out.println("El dato ingresado no es una estacion.");
        }

    }
}
