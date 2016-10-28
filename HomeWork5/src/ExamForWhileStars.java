import java.util.Scanner;

public class ExamForWhileStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		int select;
		
		for(;;){
		System.out.print("***********\n반복문 연습하기\n***********\n"
				+ "1.정사각형 별찌기\n2.직사각형 별찍기\n3.이등변삼각형 별찍기\n4.다이아몬드 별찍기\n5.종료하기\n"
				+ "원하는 메뉴는 >>> ");
		select = a.nextInt();
		
		swich(select)
		case:1 new RectagleStars().tag();
		case:2 new TriangleStars().ang();
		case:3 new IsoscelesTriangleStars().sce();
		case:4 new DiamondStars().mon();
		default break;
		}
	}

}
