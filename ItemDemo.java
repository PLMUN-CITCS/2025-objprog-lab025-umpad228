class Item {
    private String name;
    private static int itemCount = 0;

    // Constructor
    public Item(String name) {
        this.name = name;
        itemCount++;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("Item: " + name);
    }

    // Method to get the total number of objects created
    public static int getItemCount() {
        return itemCount;
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Create Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");
        
        // Display item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();
        
        // Display total number of objects created
        System.out.println("Total objects created: " + Item.getItemCount());
    }
}
