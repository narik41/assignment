package QuestionFour;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {

    public static Map<UUID, NewCustomer> updatedCustomers = new HashMap<UUID, NewCustomer>();

    /**
     *  Here, I assume that the existing customer profile means having a customer id.
     *
     * @param customers only those customer having a customer id
     * @param customerId the customer id
     * @return
     */
    public static Map<UUID, NewCustomer> process(Map<Integer, Customer> customers, Integer customerId){

        if(customerId != null && customers.containsKey(customerId)){

            UUID newCustomerId =  UUID.randomUUID();
            Customer customer = customers.get(customerId);

            NewCustomer newCustomer = new NewCustomer(
                    customer.getId(),
                    newCustomerId,
                    customer.getName(),
                    customer.getAddress(),
                    customer.getRfid(),
                    customer.getJoinedDate()
            );
            updatedCustomers.put(newCustomerId, newCustomer);
        }

        return updatedCustomers;
    }

    public static  void main(String[] args){

        Map<Integer, Customer> customers = CustomerData.get();
        Main.process(customers, 1);

    }
}
