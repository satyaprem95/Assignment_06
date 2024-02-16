package Assignment6P1;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in) ;
	        FixedStack fs = new FixedStack(3);
	        GrowableStack gs = new GrowableStack(3);
	        boolean run= true;
	        int stack_choice, choice,pushele,popele;


	        do{
	            System.out.print("\n\nWhat type of stack do you want:\n1)Fixed Stack\n2)Growable Stack\n3)Exit\n=");
	            stack_choice = sc.nextInt();

	            System.out.print("\nWhat operation do you want to perform(Stack Size=3)\n1.Push Element\n2.Pop Element\n3.Display Stack\n=");
	            choice = sc.nextInt();
	            switch(stack_choice)
	            {
	                case 1:
	                    switch (choice)
	                    {
	                        case 1:
	                            System.out.print("\nEnter element you want to push: ");
	                            pushele = sc.nextInt();
	                            fs.push(pushele);
	                            break;

	                        case 2:
	                            popele = fs.pop();
	                            if (popele == -1)
	                            {
	                                continue;
	                            }
	                            else {
	                                System.out.println(popele+ " Element Popped Successfully");
	                            }
	                            break;


	                        case 3:
	                            fs.printStack();
	                            break;
	                    }
	                    break;

	                case 2:
	                    switch (choice)
	                    {
	                        case 1:
	                            System.out.print("\nEnter element you want to push: ");
	                            pushele = sc.nextInt();
	                            gs.push(pushele);
	                            break;

	                        case 2:
	                            popele = gs.pop();
	                            if (popele == -1)
	                            {
	                                System.out.println("The Stack is empty. Cannot pop elements.");
	                            }
	                            else {
	                                System.out.println(popele+ " Element Popped Successfully");
	                            }
	                            break;

	                        case 3:
	                            gs.printStack();
	                            break;
	                    }
	                    break;

	                case 3:
	                    run = false;
	                    break;

	            }
	        } while(run);
	    }
	

}
