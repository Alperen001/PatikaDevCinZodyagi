import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		int dogumyili;
		Scanner inp = new Scanner(System.in);
		System.out.println("Doðum Yýlýnýzý Giriniz");
		dogumyili = inp.nextInt();
		dogumyili = dogumyili % 12;
		switch (dogumyili) {

		case 0:
			System.out.print("Çin Zodyaðý Burcunuz: Maymun");
			break;

		case 1:
			System.out.print("Çin Zodyaðý Burcunuz: Horoz");
			break;

		case 2:
			System.out.print("Çin Zodyaðý Burcunuz: Köpek");
			break;

		case 3:
			System.out.print("Çin Zodyaðý Burcunuz: Domuz");
			break;

		case 4:
			System.out.print("Çin Zodyaðý Burcunuz: Fare");
			break;

		case 5:
			System.out.print("Çin Zodyaðý Burcunuz: Öküz");
			break;

		case 6:
			System.out.print("Çin Zodyaðý Burcunuz: Kaplan");
			break;

		case 7:
			System.out.print("Çin Zodyaðý Burcunuz: Tavþan");
			break;

		case 8:
			System.out.print("Çin Zodyaðý Burcunuz: Ejderha");
			break;

		case 9:
			System.out.print("Çin Zodyaðý Burcunuz: Yýlan");
			break;

		case 10:
			System.out.print("Çin Zodyaðý Burcunuz: At");
			break;

		default:
			System.out.print("Çin Zodyaðý Burcunuz: Koyun");

		}
	}
}
