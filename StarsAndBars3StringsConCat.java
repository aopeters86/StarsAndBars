
public class StarsAndBars3StringsConCat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create american flag with strings
		//56 total char per line
		
		String stars6  = "*   *   *   *   *   * ";//22
		String stars5  = "  *   *   *   *   *   ";//22 char
		String noBars  = "                                  "; //34 char
		String bars    = "//////////////////////////////////"; //34 char
		int temp = 0;
		int temp1 = 0;
		
		for (int i = 0; i < 4;i++) {
			System.out.println(stars6 + noBars);
			if(i % 1 == 0) {
				System.out.println(stars5 + bars);
				}
			}
		
			if(temp != 1) {
				for(int i = 0; i < 1; i++) {
					System.out.println(stars6 + noBars);
					temp += 1;
				}
		
				for (int i = 0; i < 2;i++) {
					System.out.println(bars + bars.substring(0,22));
					if(i % 1 == 0) {
						System.out.println(noBars);
					}		
				}	
			}
			if(temp1 != 1) {
				for(int i = 0; i < 1; i++) {
					System.out.println(noBars);
					temp1 += 1;
				}
			}
			
			
	}
	
//	public static void slicerBars(String x) {
//		System.out.println(x.substring(0, 22));
//	}
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

//		for(int j = 0; j < 9; j++) {
//		System.out.println(stars5 + noBars);
//		}