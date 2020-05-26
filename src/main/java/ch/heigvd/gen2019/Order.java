package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(id);
        sb.append(", ");
        sb.append("\"products\": [");
        for (int j = 0; j < this.getProductsCount(); j++) {
            sb.append(this.getProduct(j));
        }
        return sb.toString();
    }
}
