import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException 
  {
		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner option = new Scanner(System.in);
    int UserNum;
    boolean menu = true;

    do
    {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
      UserNum = option.nextInt();
      
      if(UserNum == 1)
      {
        System.out.println("$98,345 average salary in South Florida!"); 
      }
      
      if(UserNum == 2)
      {
        System.out.println("US News - 100 Best Jobs!");
      }
      
      if(UserNum == 3)
      {
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }
      
      if(UserNum == 4)
      {
        while (fileScanner.hasNextLine())
        {
          String name = fileScanner.nextLine();
          System.out.println(name);
        }
      }
      
      if(UserNum == 5)
      {
        menu = false;
      }    
    }


    while(menu); 
    
	}
}