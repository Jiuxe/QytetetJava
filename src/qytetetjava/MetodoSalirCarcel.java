package qytetetjava;

public enum MetodoSalirCarcel {
    TIRANDODADO, PAGANDOLIBERTAD  
}


public class Coche {
    private int year;
    private String brand;
    private int price;
    private int number;

    private Coche(String b, int year, int price, int number){
        year = year;
        brand = b;
        price = price;
        number = number;      
    }

    private int get_year()                {
        return year;
    }

    private String get_brand(){
        return brand;
    }
    
    private void set_brand(new_b){
        brand = new_b;
    }

    private int get_price(){
        return price_model;
    }

    private int get_number(){
        return number;
    }
