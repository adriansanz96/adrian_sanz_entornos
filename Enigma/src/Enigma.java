
public class Enigma {

	public static void main(String[] args) {
		String frase = "Hola Paco"; //FRASE QUE SE QUIERE CIFRAR
		String frase2 = ""; //LA FRASE CIFRADA
		
		int desplazamiento = 2; //NUMERO DE DESPLAZAMIENTOS DE LA CLAVE
		
		String min = "abcdefghijklmnopqrstuvwxyz"; 
		String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


		for(int i = 0; i < frase.length(); i++){
			for (int j = 0; j < min.length(); j++){
				if(frase.charAt(i) == min.charAt(j)){
					if(j + desplazamiento >= min.length()){
						frase2 += min.charAt((j + desplazamiento) % min.length());
						 
					}
					else{
						frase2 += min.charAt(j + desplazamiento);
					}}
					else if(frase.charAt(i) == may.charAt(j)){
						if(j + desplazamiento >= may.length()){
							frase2 += may.charAt((j + desplazamiento) % min.length());	 
						}
						else{
							frase2 += may.charAt(j + desplazamiento);
						}
					}
				}
		}
			System.out.print(frase); System.out.println(" =");
			System.out.println(frase2);
		}
	}