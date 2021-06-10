import java.util.Scanner;

/**
 * Ejercico5
 */
public class Ejercico5 {
    public static void main(String[] args) {
        int mayor,menor,seguir;
        mayor =0; menor =0; seguir =0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Que sexo pertenece escriba H hombre y M mujer");
            String sex = scanner.next();
            System.out.println("ingrese la edad");
            int edad = scanner.nextInt();
            if (sex.equalsIgnoreCase("h")) {
                if ((0<edad)&&(edad<18)){
                    menor++;
                }
            }else{
                if (sex.equalsIgnoreCase("m")) {
                    if (18<=edad) {
                        mayor++;
                    }
                }else{
                    System.out.println("NO ingreso correctamente el sexo");
                }
            }
            System.out.println("deseas seguir 1/0");
            seguir = scanner.nextInt();

        } while (seguir !=0);
        System.out.println("Mujeres mayores: "+mayor+" Hombres menores: "+menor);

    }
}