public class Binary_Triangle {

	public static void main(String[] args) {
		
		int rows = 6;
		for(int i=1;i<=rows;i++) {
			int num;
			if(i % 2 == 0) {
				num = 0;
			}else {
				num = 1;				
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				
				if(num == 0) {
					num = 1;
				}else {
					num = 0;					
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
