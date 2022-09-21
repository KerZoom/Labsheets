package Labsheet4.exercise2;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Title not available",0,"ISBN not available",0);
    }
    public Book(String title,double price,String ISBN,int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String ISBN(){
        return ISBN;
    }
    public int getPages(){
        return pages;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String toString(){
        return "Title: " + title + "\nPrice: " + price + "\nISBN: " + ISBN + "\nPages: " + pages;
    }
}
