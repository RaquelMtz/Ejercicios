import java.util.Scanner;
@SuppressWarnings("unused")
public class Tabla01 {
	public static void main(String[] ar){
		Scanner teclado=new Scanner(System.in);
		int i=1,j,k,l;
		
		//System.out.print("Situation - Left N - Self - Right N - DR1 DR2 DR3 DR4 DR5 DR6 DR7 DR8 DR9 DR9 DR10");
		System.out.print("Sit = Situation\nL = Left N\nS = Self\nR = Right N\n\n");
		System.out.print("Sit L S R DR1 DR2 DR3 DR4 DR5 DR6 DR7 DR8 DR9 DR9 DR10\n");
	           for(j=0;j<=2;j++){
	               for(k=0;k<=2;k++){
	                   for(l=0;l<=2;l++){
	                       System.out.println(i + " - "+ j + " "+ k + " "+ l);
	                       i++;
	                   }
	               }
	           }
	}
}
