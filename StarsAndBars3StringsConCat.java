
public class StarsAndBars3StringsConCat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create american flag with strings

		
		String stars6  = "*   *   *   *   *";
		String stars5  = "  *   *   *   *  ";
		String noBars  = "                 ";
		String bars    = "||||||||||||||||||||||||||||||||||"; 
		int temp = 0;
		
		for (int i = 0; i < 4;i++) {
			System.out.println(stars6 + bars);
			if(i % 1 == 0) {
				System.out.println(stars5 + noBars);
				
			}
		}
		if(temp != 1) {
		for(int i = 0; i < 1; i++) {
			System.out.println(stars6 + bars);
			temp += 1;
		}
			
//		for(int j = 0; j < 9; j++) {
//		System.out.println(stars5 + noBars);
//		}
			
	
}
}
}


//		}
//		//System.out.println(stars5);
//		
//		for (int i = 0; i < +6; i++ ) {
//			System.out.print(stars5);
//		}
//		 for (int i = 0; i < 6 ; i++ ) {
//			 System.out.print(noStars);
//		 }
	
	//System.out.println();
	
	//System.out.println();