import java.util.Scanner;
public class MainBS {
	public static void main(String []args){
		Scanner inp_int = new Scanner(System.in);
		Scanner inp_str = new Scanner(System.in);
		BinarySearchTree pohon = new BinarySearchTree();

		while(true){
			int angka;
			System.out.println("\n1. add");
			System.out.println("2. find");
			System.out.println("3. preorder");
			System.out.println("4. inorder");
			System.out.println("5. postorder");
			System.out.println("Pilih : ");
			int pilih = inp_int.nextInt();

			switch(pilih){
				case 1:
					System.out.println("Masukan Angka : ");
					angka = inp_int.nextInt();
					pohon.add(angka);
					break;
				case 2:
					System.out.println("Cari Angka : ");
					angka = inp_int.nextInt();
					System.out.println(pohon.contains(angka));
					break;
				case 3:
					pohon.preOrder();
					break;
				case 4:
					pohon.inOrder();
					break;
				case 5:
					pohon.postOrder();
					break;
				default:
					break;
			}


		}

	}

}
