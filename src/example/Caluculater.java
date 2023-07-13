package example;

import java.util.Scanner;

public class Caluculater {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int mathematics;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("どの計算にしますか？");
		System.out.println("1:足し算 2:引き算 3:掛け算 4:割り算 5:剰余 6:sin 7:cos 8:tan 9:exit");
		
		String math = scanner.nextLine();
		mathematics = Integer.parseInt(math);
		
		Calculater2 num = new Calculater2();
		
		if(math.equals("1")) {
			num.first();
			String a = scanner.nextLine();
			
			num.second();
			String b = scanner.nextLine();
		
			int additional1 = Integer.parseInt(a);
			int additional2 = Integer.parseInt(b);
			
			int additional = additional1 + additional2;
			
			System.out.println("答えは　　　　" + additional);
			
		} else if(math.equals("2")) {
			num.first();
			String a = scanner.nextLine();
			
			num.second();
			String b = scanner.nextLine();
			
			int subtraction1 = Integer.parseInt(a);
			int subtraction2 = Integer.parseInt(b);
			
			int subtraction = subtraction1 - subtraction2;
			
			System.out.println("答えは　　　　　" + subtraction);
			
		} else if(math.equals("3")) {
			num.first();
			String a = scanner.nextLine();
			
			System.out.println("二番目の数を入力してください");
			String b = scanner.nextLine();
			
			int multipiled1 = Integer.parseInt(a);
			int multipiled2 = Integer.parseInt(b);
			
			int multipiled = multipiled1 * multipiled2;
			System.out.println("答えは　　　　　" + multipiled);
			
		} else if(math.equals("4")) {
			num.first();
			String a = scanner.nextLine();
			
			num.second();
			String b = scanner.nextLine();
			
			Double division1 = Double.parseDouble(a);
			Double division2 = Double.parseDouble(b);
			
			double division = division1 / division2;
			System.out.println("答えは　　　　　" + division);
			
		}else if(math.equals("5")) {
			num.first();
			String a = scanner.nextLine();
			
			num.second();
			String b = scanner.nextLine();
			
			int surplus1 = Integer.parseInt(a);
			int surplus2 =Integer.parseInt(b);
			
			int surplus = surplus1 % surplus2;
			
			System.out.println("答えは　　　　" + surplus);
			
		}else if(math.equals("6")) {
			num.first();
			String a = scanner.nextLine();
			Double s = Double.parseDouble(a);
			double radian = Math.toRadians(s);
			double sin = Math.sin(radian);
			
			System.out.println("答えは　　　　　" + sin);
			
		} else if(math.equals("7")){
			num.first();
			String a = scanner.nextLine();
			Double n = Double.parseDouble(a);
			double radian = Math.toRadians(n);
			double cos = Math.cos(radian);
			
			System.out.println("答えは　　　　　" + cos);
			
		} else if(math.equals("8")){
			num.first();
			String a = scanner.nextLine();
			Double n = Double.parseDouble(a);
			double radian = Math.toRadians(n);
			double tan = Math.tan(radian);
			
			System.out.println("答えは　　　　　" + tan);
			
		} else if(math.equals("9")) {
			System.out.println("終了します");
			break;
	}
	} while(mathematics < 9 || mathematics > 9);
	}
}