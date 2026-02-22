public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(5);

        vm.selectItem();   // Works!
        vm.insertCoin();   // Balance: 1
        vm.dispenseItem(); // Dispenses and returns to Idle
        
        vm.insertCoin();   // Fails! (Must select item first)
    }
}