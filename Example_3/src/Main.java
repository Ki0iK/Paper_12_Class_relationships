public class Main {
    public static void main(String[] args)
    {
        Order order = new Order ();
        order.addProduct (new Laptop ("Macbook pro", 2566));
        order.addProduct (new Router ("Netgate", 600));
        order.print ();
    }
}
class Order
{
    Order () // constructing constructor
    {
        products = new Product [5];
        numProducts = 0;
    }
    public void addProduct (Product p)
    {
        products [numProducts] = p;
        numProducts++;
    }
    public void print ()
    {
        for (Product p : products) // loop through the products
            if (p != null) // if product is not empty
                System.out.println(p); // printing model and price after the making of String toString ()
    }
    public Product[] products;
    int numProducts;
}

class Product
{
    public Product (String model, int price)
    {
        this.model = model;
        this.price = price;
    }
    public String toString ()   // if not this then have to do it while printing like this
                                // -> ("model: " + p.model + "\nprice: " + p.price);
    {
        return model + " @ " + price;
    }
    public String model;
    public int price;
}

class Laptop extends Product
{
    public Laptop (String model, int price)
    {
        super (model, price);
    }
}

class Router extends Product
{
    public Router (String model, int price)
    {
        super (model, price);
    }
}