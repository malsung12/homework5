import java.util.Scanner;
public class IsoscelesTriangleStars {
	Scanner c = new Scanner(System.in);
	int i, j, k, x;
	String height;
	
	public void sce(){
		for(x = 0; x <= 1; x--){
		System.out.print("이등변삼각형 높이입력: ");
		height = c.nextLine();
		
		if(height.equals("Q"))
			break;
		
		for(i = 1; i <= Integer.parseInt(height); i++){
			for(j = 1; j < Integer.parseInt(height)-i+1; j++){
				System.out.print(" ");
			}
			for(k = 1; k <= i+i-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	}
}
