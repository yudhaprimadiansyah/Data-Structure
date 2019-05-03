import java.util.Scanner;
public class MainStack {
	public static void main(String []args){
		Scanner inp_int = new Scanner(System.in);
		Scanner inp_str = new Scanner(System.in);
		Stack<String> biskuit = new Stack<String>();

		while(true){
			String nama = "";
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. popAll");
			System.out.println("Pilih : ");
			int pilih = inp_int.nextInt();

			switch(pilih){
				case 1:
					System.out.println("Masukan Nama Biskuit : ");
					nama = inp_str.nextLine();
					biskuit.push(nama);
					break;
				case 2:
					System.out.println("Data Biskuit Yang di POP : "+biskuit.pop().toString());
					break;
				case 3:
					System.out.println("Data Biskuit Yang di Peek : "+biskuit.peek().toString());
					break;
				case 4:
					biskuit.popAll();
					break;
				default:
					break;
			}


		}

	}

}
