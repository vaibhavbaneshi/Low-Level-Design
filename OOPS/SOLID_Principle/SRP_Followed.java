import java.util.*;

class Products {
    public String name;
    public int price;

    Products(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    public List<Products> products = new ArrayList<>();
    
    public void addToCart(Products p) {
        products.add(p);
    }

    public List<Products> getProducts() {
        return products;
    }

    public int calculateTotalPrice() {
        int price = 0;
        for(Products p : products)
            price += p.price;

        return price;
    }
}

class ShoppingCartPrinter {
    private ShoppingCart cart;

    ShoppingCartPrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Shopping Cart Invoice : ");
        for(Products p : cart.getProducts()) 
            System.out.println("Product Name : " + p.name + " and Product Price : " + p.price);
    }
}

class ShoppingCartSaveDB {
    private ShoppingCart cart;

    ShoppingCartSaveDB(ShoppingCart cart) {
        this.cart = cart;
    }

    public void saveToDb() {
        System.out.println("Products have been added to the DB successfully.");
    }
}

public class SRP_Followed {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addToCart(new Products("Shampoo", 100));
        cart.addToCart(new Products("Conditioner", 200));

        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();

        ShoppingCartSaveDB saveDB = new ShoppingCartSaveDB(cart);
        saveDB.saveToDb();
    }
}