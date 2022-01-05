package company;
import java.util.Scanner;

public class Controller {
   View view;
   Calculator calculator;
   Item item;
   public Controller(){this.view = new View();}

   public Calculator addItem(){
      boolean flag = true;

      while(flag) {
         Scanner scanner = new Scanner(System.in);
         Scanner scanner1 = new Scanner(System.in);
         System.out.println("Item name :");
         String name = scanner.nextLine();
         System.out.println("Item unit :");
         String unit = scanner.nextLine();
         System.out.println("Item quantity :");
         float quantity = scanner.nextFloat();
         String answer;
         System.out.println("jesli to wszystko wpisz Y");
         answer = scanner1.nextLine();
         if(answer.equalsIgnoreCase("Y")){
            flag = false;
         }


         view.calculator.addToList(name, quantity, unit);
      }

      return view.calculator;

   }

   public Calculator calculatedItem(){

      view.calculator.calculateItems(view.calculator.getItems(), view.calculator.getRatio());

      return view.calculator;
   }

   public Calculator setRatio(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Old dimension :");
      float oldValue = scanner.nextFloat();
      System.out.println("New dimension :");
      float newValue = scanner.nextFloat();
      view.calculator.calculateRatio(oldValue, newValue);

      return view.calculator;
   }


}
