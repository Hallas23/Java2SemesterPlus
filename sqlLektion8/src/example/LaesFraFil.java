package example;

import java.io.FileInputStream;
import java.util.Scanner;

public class LaesFraFil {
	
	public static void main(String[] args) {
		try {
			
			String filenavn = "20190228";
			FileInputStream filein = 
			new FileInputStream("C:\\Users\\Simon\\Documents\\Datamatiker\\DAOS\\FilSti\\FilSti"
					              + filenavn + ".txt");	
			
			Scanner scan = new Scanner(filein);
			while(scan.hasNext()){
				String s = scan.nextLine();
				System.out.println("Læst fra fil " + s);
			}
			scan.close();
		} catch (Exception e) {
			System.out.println("fejl:  " + e.getMessage());
		}
	}

}
