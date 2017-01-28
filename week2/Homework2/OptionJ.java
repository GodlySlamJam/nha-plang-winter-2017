import java.util.Scanner;

class OptionJ{
  public static void main(String[] args) {

    int option;
  Scanner options = new Scanner(System.in);

    double tip;
  Scanner tips = new Scanner(System.in);

    String name = "fill";
  Scanner names = new Scanner(System.in);

    double amount;
  Scanner amounts = new Scanner(System.in);

    double price;
  Scanner prices = new Scanner(System.in);

    String tipy;
  Scanner tipys = new Scanner(System.in);

  double total;





  System.out.print("Food or Drinks (1 for food, 2 for drink):");
  option = Integer.parseInt(options.next());

if(option == 1){
  System.out.print("What food would you like:");
  name = names.next();

}else if(option == 2){
  System.out.print("What drink would you like:");
  name = names.next();

}

  System.out.print("How much does " + name + " cost?:");
  price = Double.parseDouble(prices.next());

  System.out.print("How much " + name + " do you want?:");
  amount = Double.parseDouble(amounts.next());

  System.out.print("Do you want to tip (Yes or No)?:");
  tipy = tipys.next();


  if (tipy == "yes"){
    System.out.print("How much do you want to tip:");
    tip = Double.parseDouble(tips.next());

    total = (amount * price);
    total = (total * 8.875) +(total * tip/100) + total;

    System.out.print("You will pay " + total + " dollars");

    total = total/11;

    System.out.print("It will take " + total + " hours to get the money to pay for it");

  }else if(tipy == "no"){

    total = (amount * price);
    total = (total * 8.875) + total;

    System.out.print("You will pay " + total + " dollars");

    total = total/11;

    System.out.print("It will take " + total + " hours to get the money to pay for it");

  }
  }
}
