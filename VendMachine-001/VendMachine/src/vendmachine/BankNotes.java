package vendmachine;




public class BankNotes extends Money{
    
    public BankNotes(){
        super();
    }
    
    public void insertBankNote(int BankNote){
        switch(BankNote){
            case 1:
                addMoney(1.0);
                break;
            case 5:
                addMoney(5.0);
                break;
            case 10:
                addMoney(10.0);
                break;
            default:
                System.out.printf("Invalid BankNotes! \n");
        }
    }
}
