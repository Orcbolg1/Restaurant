package RestaurantSystem.component.billing;

public class BillingManagement extends javax.swing.JFrame{

    private BillingHelper t;
    private String name;
    private String quantity;
    private double totalPrice = 0;
    private double sum = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    /**
     * Creates new form BillManagement
     */
    public BillingManagement(){

    }

    public void display(){

    }

    private void performFileRelatedTask(){

    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
}
