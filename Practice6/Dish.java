package Practice6;

public abstract class Dish {
    protected String name;
    protected int amount
;
    public Dish(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public Dish(){
        name = "Вилка";
        amount = 2;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAmount() {
        return amount
;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public abstract int getPrice();
    @Override
    public String toString() {
        return "Dish{" +
                "Name='" + name + '\'' +
                ", amount =" + amount + '}';
    }
}
