package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String rom = "";
		int I=0;
		int nbr = Integer.parseInt(arabe);
		int nbr2=nbr;
		if(nbr>=10){
			for(int i=0; i<(nbr/10);i++){
				rom+="X";
				nbr2=nbr-10;
			}
		}
			if (nbr2 <4){
				for(int i=0; i<nbr2; i++){
					rom+="I";
				}	
			}else if (nbr2%5==4){
				rom+= "I";
				if(((nbr2/5)<1)){
					rom+="V";
				}else{
					rom+="X";
				}
			}else if (nbr2>=5 && nbr2<=8){
				rom+="V";
				for(int i=0; i<(nbr2-5);i++){
					rom+="I";
				}
			}
			
		
		
		
		return rom;
	}

	public String convertFromRoman(String roman) {
		
		return "1";
	}

}