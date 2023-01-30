package src.test;

import src.domain.Customer;

public class CustomerTest {
    public static void main(String[] args){
        Customer giga=new Customer();
        giga.displayCustomerInfo();


        Customer hyuga=new Customer(126534,false,47623636);
    hyuga.setID(1223);
    hyuga.setNew(false);
    hyuga.setTotal(12775343);
    hyuga.displayCustomerInfo();

    }
}
