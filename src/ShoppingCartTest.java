import java.util.Scanner;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Scanner reader = new Scanner(System.in);
        System.out.println("Price for first item: ");
        int n = reader.nextInt();
        System.out.println("Price for second item: ");
        int m = reader.nextInt();
        reader.close();
        Item item1 = new Item("Banana",n);
        Item item2 = new Item("Apple",m);

        cart.addItem(item1);
        System.out.println("Added " + item1.getUpcCode() + " to cart");
        cart.addItem(item2);
        System.out.println("Added " + item2.getUpcCode() + " to cart");


        //pay by paypal
        cart.pay(new PaypalStrategy("test@example.com", "password"));
        //pay by credit card
        cart.pay(new CreditCardStrategy("Jur van Zonneveld", "CardNumber", "786", "Mei 2018"));
    }

}