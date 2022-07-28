import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double eur_dol= 1.19;
        double dol_eur=0.95;
        Scanner sc= new Scanner(System.in);
        System.out.println("Que tipo de cambio quieres:\n" +
                "Euros a dolares(introduce 1)\n" +
                "Dolares a Euros(introduce 2)");
        int cambio=sc.nextInt();
        System.out.println("Que cantidad quieres cambiar?:");
        double cantidad=sc.nextInt();
        if(cambio==1){
            System.out.println(cantidad+ " euros son "+(cantidad*eur_dol)+" dolares");
            System.out.println("No sale a cuenta");


        }else {
            System.out.println(cantidad+ " dolares son "+(cantidad*dol_eur)+" euros");
            System.out.println("No te sale a ceunta");
            

        }


    }


}
