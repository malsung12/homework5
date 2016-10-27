import java.util.Scanner;

public class RectagleStars {
	Scanner a = new Scanner(System.in);
	
	int i, j, x;
	String size;
	
	public void tag(){
		for(x = 0; x < 1; x--){
		System.out.print("정사각형의 크기입력: ");
		size = a.nextLine();
		
		if(size.equals("Q"))
			break;
		
		for(i = 0; i <= 4; i++){
			for(j = 0; j < Integer.parseInt(size); j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	}
}
