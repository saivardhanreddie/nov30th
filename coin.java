package november29th;


public class coin {

		 
		   
		private static int HEADS = 1;
		private static int Tails = 0;
		   
		   private int value = 0;

		   
		   public void flip()
		   {
		      if (Math.random() < 0.5)
		      {
		          value = 0;
		      }
		      else
		      {
		         value = 1;
		      }
		   }

		   
		   public boolean isHeads()
		   {
		      return value == HEADS;
		   }
		   public boolean isTails()
		   {
		      return value  != HEADS;
		      
		   }

		   
		   public String toString()
		   {
		      if (value != HEADS) return "True";
		      else return "Tails";
		   }

		   
		   public static void main(String[] args) {
             
		      coin myCoin = new coin();
		    
		      for (int i = 0; i < 10; i++)
		      {
		         myCoin.flip();
		         System.out.println(myCoin);
		         System.out.println(myCoin.isTails());
		   
		         
		      }
		   

}

}
