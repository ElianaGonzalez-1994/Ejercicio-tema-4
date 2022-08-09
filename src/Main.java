import java.lang.runtime.SwitchBootstraps;

public class Main {
    public static void main(String[] args) {
        String Numeroif = "positivo";

        if (Numeroif == "positivo") {
            System.out.println(5);
        } else if (Numeroif == "negativo") ;
        {
            System.out.println(0);
        }

    }
    public static void main(String[] args) {
         int contador = 2 ;

    while (contador > 2 ) {
        System.out.println(contador);
        contador = contador + 1;
    }
     do {
         System.out.println(contador);
         contador = contador + 1;

       }
          for (int contador = 0; contador <= 3; contador =contador + 1 ) {
              System.out.println(contador);
          }


          var estacion = "OTOÑO";

        switch (estacion){
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO"
                 System.out.println("es invierno");
                 break;
            default:
                System.out.println("estoy en default");
        }
    }
}

