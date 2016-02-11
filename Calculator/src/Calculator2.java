import java.util.Scanner;

public class Calculator2 {


	public Calculator2()
	{
		return;
	}
	//add
	public double Add(double x, double y)
	{
		double z=x+y;
		return z;
	}
	//sub
	public double Subtract(double x, double y)
	{
		double z=x-y;
		return z;
	}
	//multiply
	public double Multiply(double x, double y)
	{
		double z=x*y;
		return z;
	}
	//divide
	public double Divide(double x, double y)
	{
		double z=x/y;
		return z;
	}
	public double Result(String input, double x, double y)
	{
		Calculator2 Calc = new Calculator2();
		switch (input)
		{
		case "+": 
			return Calc.Add(x,y); 
		case "-":
			return Calc.Subtract(x,y); 
		case "*": 
			return Calc.Multiply(x,y); 
		case "/": 
			return Calc.Divide(x,y); 
		default: 
			return 0;
		}
	}

	public static void main(String [] args)
	{
		double x, y=0;
		boolean status = true, status2 = true;

		Calculator2 Calc = new Calculator2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi! \nThis calculator can take two numbers and add, subtract, multiply or divide them!\n");
		while (status ==true)
		{
			System.out.println("What is your first value?");
			x = scan.nextInt();
			System.out.println("What are you doing? (+,-,*,/)");
			String input = scan.next();
			//		System.out.println(((input.equals("+"))||(input.equals("-"))||(input.equals("*"))||(input.equals("/"))));
			if((input.equals("+"))||(input.equals("-"))||(input.equals("*"))||(input.equals("/"))==true)
			{
				System.out.println("What is your second value?");
				y = scan.nextInt();
			}
			else	
			{
				status=false;
				while (status == false)

				{
					System.out.println("Error: Must input characters: +, -, *, or /");
					input = scan.next();
					System.out.println(input);
					if ((input.equals("+"))||(input.equals("-"))||(input.equals("*"))||(input.equals("/"))==false)	
					{
						status = true;
						System.out.println("What is your second value?");
						y = scan.nextInt();
					};
				}


			}
			System.out.print(x + " + " + y + " = " + Calc.Result(input, x, y)+"\n");

			status2 = true;
			while (status2 == true)
			{
				System.out.println("Do you want to use the calculator again? Yes or No?");
				input = scan.next();
				if(input.equals("Yes"))
				{ 
					status2 = false;
				}
				else if(input.equals("No"))
				{
					status = false;
					status2 = false;
					System.out.println("Goodbye");
				}
				else if(!input.equals("Yes"))
				{
					status2 = true;
					System.out.println("You must enter Yes or No");
				}
			}

		}


		scan.close();
	}

}

//switch (input)
//{
//case "+": System.out.println(Calc.Add(x,y)); 
//break;
//case "-": System.out.println(Calc.Subtract(x,y)); 
//break;
//case "*": System.out.println(Calc.Multiply(x,y)); 
//break;
//case "/": System.out.println(Calc.Divide(x,y)); 
//break;
//default: System.out.println("Error: Try Again");
//break;
//}

