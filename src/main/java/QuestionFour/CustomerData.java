package QuestionFour;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Dummy customer data for
 *
 * @author  Kiran Subedi
 * @Date 2021/08/08
 */
public class CustomerData {

    /**
     * Existing customer data
     *
     * @return
     */
    public static Map<Integer, Customer> get(){
        Map<Integer, Customer> customers = new HashMap();
        customers.put(1, new Customer(1, "Ram Bhandari", "Kathmandu", 1, new Date()));
        customers.put(2, new Customer(2, "Kiran Subedi", "Kathmandu", 2, new Date()));
        customers.put(null, new Customer(3,  "Santosh Thapa", "Kathmandu", 3, new Date()));
        customers.put(null, new Customer(4,  "Kiran Shrestha", "Kathmandu", 4, new Date()));

        return customers;
    }
}
