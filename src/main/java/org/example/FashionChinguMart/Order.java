package org.example.FashionChinguMart;

public class Order {
    public static void main(String[] args) {
        Products dress = new Products("Onepiece",5600);
        Products shirt = new Products("Shirt",1500);
        Products trouser = new Products("Trouser",3000);
        Products shoes = new Products("Running Shoes",2000);
        Products bag = new Products("Bag",1000);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(dress);
        cart.addProduct(shoes);
        cart.getProduct().ifPresent(products -> products.forEach(p ->System.out.println("product in Cart"+p.getProductname()+" ~$"+p.getPrice())));
        cart.calculateTotal().ifPresent(total->System.out.println(total));

    }
}
