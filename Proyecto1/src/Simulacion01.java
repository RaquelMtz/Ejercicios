import java.util.Scanner;
@SuppressWarnings("unused")
public class Simulacion01 {
	public static void main(String[] ar){
		Scanner teclado=new Scanner(System.in);
		int op;
		
		
		do{
			System.out.print("1. Uso de reglas, 2. Mostrar tabla, 3. Salir");
			System.out.print("Elija una opcion:");
            op = teclado.nextInt();
			
            
            switch(op){
                       case 1:
                            Reglas();
                            break;
                       case 2:
                            Tabla();
                            break;
                       case 3:
                            exit(1);
                       default:
                               printf("\n\n\topcion no existe...\n\n\t");
                               break;
            }
            system("pause");
     }while(op);
		
		
		
		
		do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor=teclado.nextInt();
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 dígitos.");
                } else {
                    System.out.println("Tiene 1 dígito.");
                }
            }
        } while (valor!=0);
	}
}
