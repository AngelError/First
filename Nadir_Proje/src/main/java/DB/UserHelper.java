package DB;

import java.util.ArrayList;
import java.util.List;

public class UserHelper {
    public List<Object> products = new ArrayList<>();
    public List<Object> prices = new ArrayList<>();

    public List<Object> getProducts() {
        return products;
    }

    public List<Object> getPrices() {
        return prices;
    }

    public void addProduct(Object product) {
        products.add(product);
    }

    public void removeProduct(Object product) {
        products.remove(product);
    }

    public void addPrice(Object price) {
        prices.add(price);
    }

    public void removePrice(Object price) {
        products.remove(price);
    }

//    public void showProduct() {
//        for (int i = 0; i < products.size(); i++) {
//            System.out.println(products.get(i));
//        }
//    }
//
//    public void showPrice() {
//        for (int i = 0; i < prices.size(); i++) {
//            System.out.println(prices.get(i));
//        }
//    }

    public int getLength() {
        int length = 0;
        if (products.size() == prices.size()) {
            length = products.size();
        }
        return length;
    }
}
