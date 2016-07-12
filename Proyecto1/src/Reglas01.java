import java.util.Scanner;
@SuppressWarnings("unused")
public class Reglas01 {
	public static void main(String[] ar){
		Scanner teclado=new Scanner(System.in);
		int VI,yo,VD,DR,DRR = 0,SumSj,c;
		
		
		do{
	          System.out.print("Ingresa vecino izquierdo: ");
	          VI = teclado.nextInt();
	          System.out.print("Ingresa self: ");
	          yo = teclado.nextInt();
	          System.out.print("Ingresa vecino derecho: ");
	          VD = teclado.nextInt();
	          System.out.print("Ingresa la Regla de Desicion: ");
	          DR = teclado.nextInt();
	          switch(DR){
	                  case 1:
	                       DRR = 2;
	                       break;
	                  case 2:
	                       if(VI==2 || VD==2 || yo==2)
	                          DRR = 2;
	                       else
	                          DRR = 1;
	                       break;
	                  case 3:
	                       SumSj = VI + VD + yo;
	                       if(SumSj>=4)
	                          DRR = 2;
	                       else
	                          DRR = 1;
	                       break;
	                  case 4:
	                       SumSj = VI + VD + yo;
	                       if(SumSj==6)
	                          DRR = 2;
	                       else
	                          DRR = 1;
	                       break;
	                  case 5:
	                       SumSj = VI + VD + yo;
	                       if(SumSj==6)
	                          DRR = 1;
	                       else
	                          DRR = 2;
	                       break;
	                  case 6:
	                       if(VI==2 || VD==2 || yo==2)
	                          DRR = 2;
	                       else{
	                            if(VI==1 || VD==1 || yo==1)
	                               DRR = 1;
	                            else
	                               DRR = 0;
	                       }
	                       break;
	                  case 7:
	                       if(yo==1 || yo==2)
	                          DRR = 2;
	                       else
	                          DRR = 1;
	                       break;
	                  case 8:
	                       if(yo != VI)
	                          DRR = VI;
	                       else{
	                            if(VI==1 || VI==2)
	                               DRR = 2;
	                            else
	                               DRR = 1;
	                       }
	                       break;
	                  case 9:
	                       if(yo != VD)
	                          DRR = VD;
	                       else{
	                            if(VD==1 || VD==2)
	                               DRR = 2;
	                            else
	                               DRR = 1;
	                       }
	                       break;
	                  case 10:
	                       if(VI!=yo || VD!=yo){
	                          if(VI>VD)
	                             DRR = VI;
	                          else
	                             DRR = VD;
	                       }else{
	                             if(yo!=2)
	                                DRR = yo + 1;
	                             else
	                                DRR = 2;
	                       }
	          }
	          System.out.print("El resultado de la desicion es: ");
	          System.out.println(DRR);
	          System.out.print("Desea otra validacion: (1-si, 0-no): ");
	          c = teclado.nextInt();
	          
	       }while(c==1);
		}
}
