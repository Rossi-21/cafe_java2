import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 4.00;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 3.75;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 1.75;

        Item item4 = new Item();
        item4.name = "Cappucino";
        item4.price = 3.50;
        
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        // order1.price = 
        // order1.total = 
        // order1.items = 

        Order order2 = new Order();
        order2.name = "Jimmy";
        //order2.total = order2.items(price);
        // order2.ready = 
        

        Order order3 = new Order();
        order3.name = "Noah";
        // order3.price = 
        // order3.total = 
        // order3.items = 

        Order order4 = new Order();
        order4.name = "Sam";
        // order4.price = 
        // order4.total = 
        // order4.items = 

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("Order 2 Total: $%s\n", order2.total);
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("Order 3 Total: $%s\n", order3.total);
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("%s, your total is: $%s\n",order4.name, order4.total);
        order1.ready = true;
        System.out.printf("Ready: %s\n", order1.ready);
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("%s, your total is: $%s\n",order4.name, order4.total);
        order2.ready = true;
        System.out.printf("Ready: %s\n", order2.ready);
    }
}
