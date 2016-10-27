import java.util.Scanner;
public class DiamondStars {
	Scanner d = new Scanner(System.in);
	int i, j, k, x;
	String Size;
	
	public void mon(){
		
		for(x = 0; x <= 1; x--){
		System.out.print("다이아몬드의 크기 입력: ");
		Size = d.nextLine();
		
		if(Size.equals("Q"))
			break;
		
		for(i = 1; i <= Integer.parseInt(Size); i++){
			
			for(j = 1; j < Integer.parseInt(Size)-i+1; j++){
				System.out.print(" ");
			}
			for(k = 1; k <= i+i-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(i = Integer.parseInt(Size)-1; i >= 1; i--){
			
			for(j = 1; j <= Integer.parseInt(Size)-i; j++){
				System.out.print(" ");
			}
			
			for(k = 1; k <= 2*i-1 ; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	}

}
