package pl.accenture;

import java.util.Optional;

public class TravelOffice {

    private Customer[] customerArray = new Customer[2];

    private int getCustomerCount() {
        int customerCount = 0;

        for (Customer i : customerArray ) {
            if(i == null) break;
            customerCount++;
        }

        return customerCount;
    }

    private void insertCustomerIntoArray(Customer customer) {
        for(int i = 0; i < customerArray.length; i++) {
            if(customerArray[i] == null) {
                customerArray[i] = customer;
                break;
            }
        }
    }

    private void doubleCustomerArraySize() {
        Customer[] helper = new Customer[customerArray.length * 2];
        System.arraycopy(customerArray, 0, helper, 0, customerArray.length);
        customerArray = helper.clone();
    }

    private Boolean isNotFull() {
        return getCustomerCount() < customerArray.length;
    }

    public Customer[] addCustomer(Customer customer) {
        if(isNotFull()) {
            insertCustomerIntoArray(customer);
        } else {
            doubleCustomerArraySize();
            insertCustomerIntoArray(customer);
        }
        return customerArray;
    }

    @Override
    public String toString() {
        String info = new String();

        for (Customer i: customerArray) {
            info += Optional.ofNullable(i).map(Customer::toString).orElse("NULL");
            info += System.lineSeparator();
        }

        return  info;
    }
}
