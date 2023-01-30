package src.domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private double total;

    public void displayCustomerInfo (){
        System.out.println(" id пользователя = "+ID+" статус клієнта = "+isNew+" сума замовлень = "+total);
    }

    public Customer(int ID, boolean isNew, double total) {
        this.ID = ID;
        this.isNew = isNew;
        this.total = total;
    }

    public Customer() {
        this.ID = 27;
        this.isNew = true;
        this.total = 575462;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if(ID > 0){
            this.ID = ID;
       }
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        if(total > 0){
            this.total = total;
        }
    }
}

