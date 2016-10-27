import java.util.Scanner;

public class TriangleStars {
	Scanner b = new Scanner(System.in);
	
	int i, j, k, x;
	String height;
	
	public void ang(){
		for(x = -1; x < 0; x--){
		System.out.print("직각사각형의 왼쪽여백과 높이입력: ");
		height = b.nextLine();
		
		if(height.equals("Q"))
			break;
		
		for(i = 1; i <= Integer.parseInt(height); i++){
			for(j = 1; j < Integer.parseInt(height)-i+1 ; j++)
				System.out.print(" ");
			for(k = 1; k <= i; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		}
	}
}