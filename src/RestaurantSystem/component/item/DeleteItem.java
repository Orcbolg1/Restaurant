package RestaurantSystem.component.item;

import RestaurantSystem.service.ItemService;

public class DeleteItem extends javax.swing.JFrame{

    private final ItemService itemService;

    /**
     * Creates new form DeleteItem
     */
    public DeleteItem(){
        //initComponents();
        //this.itemService = new ItemService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Functions:
     * add performFileRelatedTask()
     *
     * add deleteButtonActionPerformed()
     *
     * add backButtonActionPerformed
     *
     */

    public static void main(String args[])
    {
        new DeleteItem().setVisible(true);
    }
}
