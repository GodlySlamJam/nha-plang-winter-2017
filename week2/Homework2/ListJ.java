import java.util.Scanner;
import java.util.ArrayList;

class listJ{
  public static void main(String[] args) {

    int stay = 1;

    int list;
    Scanner lists = new Scanner(System.in);

    int num;
    Scanner nums = new Scanner(System.in);

    String item;
    Scanner items = new Scanner(System.in);

    int repeat;
    Scanner repeats = new Scanner(System.in);

    while (stay < 0){
      System.out.print("How many items do you want on your list:");
      list = Integer.parseInt(lists.next());

      String[] array = new String [list];

      System.out.print("How many items are you adding:");
      repeat = Integer.parseInt(repeats.next());

      while (repeat > 0){
        System.out.print("Replace which item on the list:");
        num = Integer.parseInt(nums.next());
        num = num - 1;

        System.out.print("What is the name of the new item:");
        item = items.next();

        array[num] = item;
      }
      int x = array.length;
      int y = 0;
      while(y< x){
        System.out.print(array[x]);

        y++;
      }


    }

  }
}
