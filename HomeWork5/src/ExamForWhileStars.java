import java.util.Scanner;

public class ExamForWhileStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondStars Dia = new DiamondStars();
		IsoscelesTriangleStars Iso = new IsoscelesTriangleStars();
		RectagleStars Rec = new RectagleStars();
		TriangleStars Tri = new TriangleStars();
		
		Scanner a = new Scanner(System.in);
		
		int select, i;
		
		for(i = 0; i < 1; i--){
		System.out.print("***********\n반복문 연습하기\n***********\n"
				+ "1.정사각형 별찌기\n2.직사각형 별찍기\n3.이등변삼각형 별찍기\n4.다이아몬드 별찍기\n5.종료하기\n"
				+ "원하는 메뉴는 >>> ");
		select = a.nextInt();
		
		if(select == 1)
			Rec.tag();
		if(select == 2)
			Tri.ang();
		if(select == 3)
			Iso.sce();
		if(select == 4)
			Dia.mon();
		if(select == 5)
			break;
		}
	}

}
