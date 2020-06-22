public class Main {
    public static void main(String[] args) {
        int balance = 50;
        int refillbonuce = 100;
        int refill = 1000;
        int bonuce = 0;

        if (refill > 999)  {
           bonuce = refill/refillbonuce;
        }
        System.out.println(bonuce);
    }
}
