public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("[Idle] Item selected. Transitioning to ItemSelectedState.");
        machine.setState(machine.getItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("[Idle] Cannot insert coin. Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("[Idle] Cannot dispense. No item selected.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("[Idle] Moving machine to OutOfOrderState.");
        machine.setState(machine.getOutOfOrderState());
    }
}