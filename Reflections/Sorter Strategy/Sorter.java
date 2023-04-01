import java.util.Scanner;

public class Sorter{
	Strategy strategy;


	double[] Sort(double arr[] , Strategy strategy)
	{
		return strategy.sortstrategy(arr);

	}

	double[] Sort(double arr[])
	{
		return strategy.sortstrategy(arr);
	}

	// void setStrategy(Strategy strategy)
	// {

	// }

	void display(double arr[])
	{
		for(int i =0 ; i < arr.length ; i++ )
		{
			System.out.print(arr[i] + ",");
		}

	}

	public static void main(String[] args)
	{
		Sorter sorter = new Sorter();

		double arr[] = {10,14,12,1,2,3,55,33,12,999};

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ny which sorting method you want to sort : \n \t 1)Bubblesort \n\t 2)Mergesort \n\t 3)Insertionsort :");
		int option = scanner.nextInt();

		switch(option)
		{
		case 1 : double outBubble[] = sorter.Sort(arr,new Bubblesort());
				 //Displaying the Bubblesort array.
				 System.out.print("The Bubblesort gives rise = [");
				 sorter.display(outBubble);
				 System.out.print("]");
				 System.out.println("");
			break;
		case 2 : double outMerge[] = sorter.Sort(arr,new MergeSort());
				//Displaying the Mergesort array.
				System.out.print("The Mergesort gives rise = [");
				sorter.display(outMerge);
				System.out.print("]");
				System.out.println("");
			break;
		case 3 : double outInsertion[] = sorter.Sort(arr,new InsertionSort());
				//Displaying the Insertionsort array.
				System.out.print("The Insertionsort gives rise = [");
				sorter.display(outInsertion);
				System.out.print("]");
				System.out.println("");
			break;

		default :
			System.out.println("You entered a wrong number");
		}


		
	}
}