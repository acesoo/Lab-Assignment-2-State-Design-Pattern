public class VendingMachine {
    // Instantiate states once to save memory
    private final VendingMachineState idleState = new IdleState();
    private final VendingMachineState itemSelectedState = new ItemSelectedState();
    private final VendingMachineState dispensingState = new DispensingState();
    private final VendingMachineState outOfOrderState = new OutOfOrderState();

    private VendingMachineState currentState;
    private int inventory;
    private int balance;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0;
        this.currentState = (inventory > 0) ? idleState : outOfOrderState;
    }

    // Delegation: The machine doesn't know "how" to do these, 
    // it just asks the current state to handle it.
    public void selectItem() { currentState.selectItem(this); }
    public void insertCoin() { currentState.insertCoin(this); }
    public void dispenseItem() { currentState.dispenseItem(this); }
    public void setOutOfOrder() { currentState.setOutOfOrder(this); }

    // Getters and Setters
    public void setState(VendingMachineState state) { this.currentState = state; }
    public VendingMachineState getIdleState() { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfOrderState() { return outOfOrderState; }

    public int getInventory() { return inventory; }
    public void setInventory(int inventory) { this.inventory = inventory; }
    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }
}