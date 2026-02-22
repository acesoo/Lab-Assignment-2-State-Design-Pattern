public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("[Dispensing] Please wait, currently dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("[Dispensing] Error: Cannot accept coins while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            machine.setInventory(machine.getInventory() - 1);
            machine.setBalance(0);
            System.out.println("[Dispensing] Success! Item dropped. Inventory: " + machine.getInventory());
            
            if (machine.getInventory() > 0) {
                machine.setState(machine.getIdleState());
            } else {
                System.out.println("[Dispensing] Out of stock! Moving to OutOfOrder.");
                machine.setState(machine.getOutOfOrderState());
            }
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(machine.getOutOfOrderState());
    }
}