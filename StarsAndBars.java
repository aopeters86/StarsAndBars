
public class StarsAndBars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//only can decrement by 2?
		//these need to have 2 more rows under and stars added
		//figure out how to add spaces under each line inside the loop?
		
		int  n = 5;
		int n2 = 5;
		int n3 = 5;
		//6 down 5 side
		
		//controls rows
		for(int i =0; i < n; i++) {
			for(int j = 0; j < n ; j++) {
				
			if(n % 1 == i || n %3 ==i ) {
				
			System.out.print("*  ");
			//This is adding spaces to the right of the above star
			//System.out.print("    ");
			}
			
			else {
			System.out.print("  *");
			}
	}
			System.out.println();
}
}
}

//		for(int i = 0; i< n3; i++) {
//			for (int j = 0; j < n3; j++ ) {
//				System.out.print("/ ");
//			}
//		}