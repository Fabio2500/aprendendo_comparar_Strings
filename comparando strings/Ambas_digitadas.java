import java.util.Scanner;
class Ambas_digitadas{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String palavra1,palavra2;
		System.out.println("digite a primeira palavra:");
		palavra1 = new String(sc.nextLine().trim());
		System.out.println("agora digite a segunda palavra:");
		palavra2 = new String(sc.nextLine().trim());

		if(palavra1.equals(palavra2)){
			System.out.println("ambas as palavras são iguais");
		}else{
			System.out.println("as palavras são diferentes");
		}
	}
}
