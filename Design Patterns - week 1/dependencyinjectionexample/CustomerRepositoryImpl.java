public class CustomerRepositoryImpl
        implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        return "Customer Found : Bhagyasri (ID: " + id + ")";
    }
}