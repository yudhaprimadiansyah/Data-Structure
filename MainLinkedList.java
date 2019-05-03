import java.util.Scanner;
public class MainLinkedList {
	public static void main(String []args){
		Scanner inp_int = new Scanner(System.in);
		Scanner inp_str = new Scanner(System.in);
		LinkedList<String> nama_mhs = new LinkedList<String>();

		while(true){
			String nama = "";
			System.out.println("1. AddFirst");
			System.out.println("2. AddLast");
			System.out.println("3. DeleteFirst");
			System.out.println("4. DeleteLast");
			System.out.println("5. View");
			System.out.println("Pilih : ");
			int pilih = inp_int.nextInt();

			switch(pilih){
				case 1:
					System.out.println("Masukan Nama Untuk Awal : ");
					nama = inp_str.nextLine();
					nama_mhs.insertFirst(nama);
					break;
				case 2:
					System.out.println("Masukan Nama Untuk Awal : ");
					nama = inp_str.nextLine();
					nama_mhs.insertLast(nama);
					break;
				case 3:
					nama_mhs.deleteFirst();
					System.out.println("Data Terhapus");
					break;
				case 4:
					nama_mhs.deleteLast();
					System.out.println("Data Terhapus");
					break;
				case 5:
					nama_mhs.showAll();
					break;
				default:
					break;
			}


		}

	}

}
