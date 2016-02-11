import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {



	
		boolean status = true;
		int count = 0;
		System.out.println("What do you want to do?");
		while (status is true)
		{
			System.out.println("Add/Subtract/Multiply/Divide?");
			String answer = "";
			Scanner in = new
					Scanner(System.in);
			answer = in.nextLine();

			answer = answer.toLowerCase();
			if((answer.equals("add")||answer.equals("subtract")||answer.equals("multiply")||answer.equals("divide"))==false)
			{
				System.out.println("Error: Try Again:");
			}
			else if(answer.equals("add")||answer.equals("subtract")||answer.equals("multiply")||answer.equals("divide"))
			{
				System.out.println("You chose to: " + answer);
				System.out.println("What numbers do you want to "+ answer);

				float x=0, y=0, z=0;
				x = in.nextInt();
				y = in.nextInt();

				if(answer.equals("subtract"))
				{ 
					z =  x - y;
				}
				else if(answer.equals("multiply"))
				{ 
					z = x * y;
				}
				else if(answer.equals("divide")) 
				{ 
					z = (x / y);
				}
				else 	if(answer.equals("add"))
				{ 
					z = (x + y);
				}
				System.out.println("Your results: " + z);
				System.out.println("Do you want to continue? (Yes or No?)\n");

				Scanner check = new
						Scanner(System.in);
				String tf = "";
				tf= check.nextLine();
				tf = tf.toLowerCase();

				if((tf.equals("yes")||tf.equals("no"))==false)
				{
					System.out.println("Answer has to be Yes/No");
				}
				if(tf.equals("yes"))
				{
					status=true;
					count++;
					System.out.println("Loop Count: " + count + " Your results: " + z+ "\nWhat do you want to do?");
				}
				if(tf.equals("no"))
				{
					status=false;
					System.out.println("Goodbye");
					in.close();
					check.close();
				}

			}

		}
	}

}

