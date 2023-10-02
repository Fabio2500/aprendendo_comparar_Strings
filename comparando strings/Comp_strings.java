import java.util.Scanner;

class Comp_strings{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String palavra;
		System.out.println("digite pamonha");
		palavra = new String(sc.next());
        
        if(palavra.equals("pamonha")){
        	System.out.println("perfeito!");
        }else{
        	System.out.println("você não digitou pamonha");
        }

	}
}