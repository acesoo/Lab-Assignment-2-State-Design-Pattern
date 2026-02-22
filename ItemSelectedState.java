public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("[Selected] Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        machine.setBalance(machine.getBalance() + 1);
        System.out.println("[Selected] Coin accepted. Current balance: $" + machine.getBalance());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getBalance() > 0) {
            System.out.println("[Selected] Payment confirmed. Moving to DispensingState.");
            machine.setState(machine.getDispensingState());
            // Automatically trigger the dispense logic
            machine.dispenseItem(); 
        } else {
            System.out.println("[Selected] Please insert coins first.");
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(machine.getOutOfOrderState());
    }
}