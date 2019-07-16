package vendmachine;



/**
 *
 * @author admin
 */
public class Coins extends Money{
    
    public Coins(){
        super();
    }
    
    public void insertCoin(int coin){
        switch(coin){
            case 10:
                addMoney(0.1);
                break;
            case 20:
                addMoney(0.2);
                break;
            case 50:
                addMoney(0.5);
                break;
            default:
                System.out.printf("Invalid Coin! \n");
        }
    }
}