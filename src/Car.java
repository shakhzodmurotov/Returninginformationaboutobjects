public class Car {
    private int model;
    private int year;
    private int price;
    private int quantity;
    private String brand;
    private String color;

    public Car (int model, int year,int price, int quantity,String brand,String color){
        this.model = model;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
    }

    public int getModel(){
        return model;
    }
    public void  setModel(int model){
        this.model = model;
    }
    public int getYear (){
        return year;
    }

}
