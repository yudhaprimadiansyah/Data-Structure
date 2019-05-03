import java.util.Scanner;
public class MainQueue {
	public static void main(String []args){
		Scanner inp_int = new Scanner(System.in);
		Scanner inp_str = new Scanner(System.in);
		Queue<String> pengantri = new Queue<String>();

		while(true){
			String nama = "";
			System.out.println("1. enqueue");
			System.out.println("2. peek");
			System.out.println("3. dequeue");
			System.out.println("Pilih : ");
			int pilih = inp_int.nextInt();

			switch(pilih){
				case 1:
					System.out.println("Masukan Nama Pengantri : ");
					nama = inp_str.nextLine();
					pengantri.enqueue(nama);
					break;
				case 2:
					System.out.println("Antrian Pertama : "+pengantri.peek().toString());
					break;
				case 3:
					System.out.println("Pengantri Pertama : "+pengantri.dequeue()+"\nPengantri Selanjutnya : "+pengantri.peek().toString());
					break;
				default:
					break;
			}


		}

	}

}
