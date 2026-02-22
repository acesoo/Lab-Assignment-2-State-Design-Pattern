public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) { System.out.println("[Error] Machine is Out of Order."); }
    
    @Override
    public void insertCoin(VendingMachine machine) { System.out.println("[Error] Machine is Out of Order."); }
    
    @Override
    public void dispenseItem(VendingMachine machine) { System.out.println("[Error] Machine is Out of Order."); }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) { System.out.println("[Error] Already Out of Order."); }
}