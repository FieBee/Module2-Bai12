import java.util.ArrayList;

public class Product implements Comparable<Product>{
    private String name;
    private int price = 100;
    private int id;

    public static int stt = 1;
    public static int count = 3;


    @Override
    public int compareTo(Product o) {
        return o.price - o.price;
    }

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getPrice() {
        return this.price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return  "Name = '" + this.name + '\'' +
                ", Price = " + this.price +
                ", Id= " + this.id ;

    }


}
