import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        ArrayList<ShopObject> Shop = new ArrayList<>();
        Shop.add(new Department("Товары для дома"));
        Shop.add(new Department("Электроника"));
        Shop.add(new Service("Доставка"));
        Shop.add(new Product("Труба"));
        Shop.add(new Product("Калькулятор"));
        for (ShopObject object: Shop) {
            System.out.println(object.toString());
        }
    }
}

class ShopObject {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ShopObject{" +
                "name='" + name + '\'' +
                '}';
    }

    public ShopObject(String name) {
        this.name = name;
    }
}

class Department extends ShopObject {

    public Department(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Отдел - " + name;
    }
}
class Product extends ShopObject {

    public Product(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Товар - " + name;
    }
}
class Service extends ShopObject {

    public Service(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Услуга - " + name;
    }
}
