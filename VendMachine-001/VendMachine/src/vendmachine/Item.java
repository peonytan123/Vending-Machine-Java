
package vendmachine;


public class Item
{
	public String id;	
	public String itemName;	
        public double price;
	public int stock;	
        
        public Item(String id1,String itemName1, double price1, int stock1 )
        {
            id =id1;
            itemName= itemName1;
            price = price1;
            stock=stock1;
            
        }
        
        public void setId1(String id1)
        {
            id=id1;
            
        }
        
        public void setItemName1(String itemName1)
        {
            itemName=itemName1;
        }
        
        public void setPrice1(double price1)
        {
            price=price1;
        }
        
        public void setStock1(int stock1)
        {
            stock=stock1;
        }
        
        public String getId1()
        {
            return id;
        }
        
        public String getItemName1()
        {
            return itemName;
        }
        
        public double getPrice1()
        {
            return price;
        }
        
        public int getStock1()
        {
            return stock;
        }
               
}
	