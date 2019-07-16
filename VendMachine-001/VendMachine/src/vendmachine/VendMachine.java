/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendmachine;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class VendMachine {
    
    private static BankNotes banknotes =new BankNotes(); 
    private static Coins coins =new Coins(); 
    private static Item[] itemArray = new Item[10];
    
    
    public VendMachine(){
        itemArray[0] = new Item("01","Coke",1.50,10);
        itemArray[1] = new Item("02","Coke",1.50,10);
        itemArray[2] = new Item("03","Coke",1.50,10);
        itemArray[3] = new Item("04","Sarsi",1.50,10);
        itemArray[4] = new Item("05","Sarsi",1.50,10);
        itemArray[5] = new Item("06","100 plus",1.50,10);
        itemArray[6] = new Item("07","100 plus",1.50,10);
        itemArray[7] = new Item("08","100 plus",1.50,10);
        itemArray[8] = new Item("09","7 up",1.50,10);
        itemArray[9] = new Item("10","7 up",1.50,10);
    }
    
    public static void main(String[] args){
        VendMachine vm = new VendMachine();
        Scanner s = new Scanner(System.in);
        int option=0,amount=0;
        
        System.out.println("    === Menu ===");
        System.out.printf("%3s   %10s   %9s   %-5s\n","No.","Product","Price(RM)","QTY");
        
        for(int i=0;i<10;i++){
            System.out.printf("%-3s   %-10s   %-9.2f   %-5d\n",
                    vm.itemArray[i].getId1(),vm.itemArray[i].getItemName1(),vm.itemArray[i].getPrice1(),vm.itemArray[i].getStock1());
        }
        do{
        //interface function , but current use code to perform
        System.out.println("\n\n\n    === Function ===");
        System.out.println("1. Insert BankNote");
        System.out.println("2. Insert Coin");
        System.out.println("3. Purchase");
        System.out.println("4. Dispence Coin");
        System.out.println("5. End Program");
        System.out.printf("Current Amount : RM%.2f\n",Money.getTotal());
        System.out.print("Enter >>>");
        option = s.nextInt();
                
        
        switch(option){
            case 1:
                System.out.printf("Insert the banknote in single unit (RM 1=1) >>> ");
                amount = s.nextInt();
                banknotes.insertBankNote(amount);
                break;
            case 2:
                System.out.printf("Insert the coin in single unit (10 sen = 10) >>> ");
                amount = s.nextInt();
                coins.insertCoin(amount);
                break;
            case 3:
                System.out.printf("Enter the no of Item >>>>");
                String noItem = s.next();

                for(int i=0;i<10;i++){
                    if(noItem.equals(vm.itemArray[i].getId1())){
                        if(vm.itemArray[i].getPrice1()<=Money.getTotal() && vm.itemArray[i].getStock1() >=1){
                        System.out.printf("%-3s   %-10s   %-9.2f\n",
                            vm.itemArray[i].getId1(),vm.itemArray[i].getItemName1(),vm.itemArray[i].getPrice1());
                        System.out.printf("Purchase Successul !!\n Thank You!!\n");
                        vm.itemArray[i].setStock1(vm.itemArray[i].getStock1() -1); 
                        Money.setMoney(Money.getTotal()-vm.itemArray[i].getPrice1());
                    }
                        else{
                            System.out.println("Purchase Fail\n");
                        }
                    }
                }
                break;
            case 4:
                System.out.printf("\n\nRefund Amound : RM %.2f\n",Money.getTotal());
                Money.setMoney(0);
                break;
            case 5:
                break;
            default:
                System.out.println("Error !!!");
        }
        }while(option!=5);
        
    }
}
