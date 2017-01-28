class IntrestJ {
  public static void main(String[] args) {
    double time = 10;
    double price = 1;
    double intrest = 0.1;
    double debt = 0;
    double compound = 2;
    double hold = 0;
    double exponent = 0;

    exponent = (1 + intrest/compound);
    hold = java.lang.Math.pow( compound,  time);
    debt = java.lang.Math.pow( exponent, hold);
    debt = debt + price;

    System.out.println("You will pay " + debt + " dollars");
  }
}
