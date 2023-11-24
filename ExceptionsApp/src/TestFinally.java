import java.io.IOException;



public class TestFinally{
    
 

    public static void main(String[] args) {
      try {
        System.out.println("entrer votre code ");
        int x = System.in.read();
      } catch (IOException e) {
        e.printStackTrace();
      }

      System.out.println("Merci de votre visite");
     
    }

}


