package Lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;


public class testSelectionSort
{
	private SelectionSort temp1;
	@Test
	public void test()
	{
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

// Here is a comment edit for Regulars

	public testSelectionSort() { }

	public void testPositive()
	{
		int[] arr = new int[5];
		arr[0]=8;
		arr[1]=9;
		arr[2]=7;
		arr[3]=10;
		arr[4]=2;

		int[] Sortedarr = new int[5];
		Sortedarr[0]=2;
		Sortedarr[1]=7;
		Sortedarr[2]=8;
		Sortedarr[3]=9;
		Sortedarr[4]=10;

		SelectionSort temp1 = new SelectionSort();
		int[] sortedArray = temp1.basicSelectionSort(arr);
		assert arr[0] == Sortedarr[0];
		assert arr[1] == Sortedarr[1];
		assert arr[2] == Sortedarr[2];
		assert arr[3] == Sortedarr[3];
		assert arr[4] == Sortedarr[4];

	}

	public void testNegative()
	{
		int[] arr = new int[5];
		arr[0]=-8;
		arr[1]=-9;
		arr[2]=-7;
		arr[3]=-10;
		arr[4]=-2;

		int[] Sortedarr = new int[5];
		Sortedarr[0]=-10;
		Sortedarr[1]=-9;
		Sortedarr[2]=-8;
		Sortedarr[3]=-7;
		Sortedarr[4]=-2;

		SelectionSort temp1 = new SelectionSort();
		int[] sortedArray = temp1.basicSelectionSort(arr);
		assert arr[0] == Sortedarr[0];
		assert arr[1] == Sortedarr[1];
		assert arr[2] == Sortedarr[2];
		assert arr[3] == Sortedarr[3];
		assert arr[4] == Sortedarr[4];

	}
  int food;
	int food = 1;
	// Test for Strange
	public void testMixed()
	{
		int[] arr = new int[5];
		arr[0]=-8;
		arr[1]=9;
		arr[2]=-7;
		arr[3]=10;
		arr[4]=2;

		int[] Sortedarr = new int[5];
		Sortedarr[0]=-8;
		Sortedarr[1]=-7;
		Sortedarr[2]=2;
		Sortedarr[3]=9;
		Sortedarr[4]=10;

		SelectionSort temp1 = new SelectionSort();
		int[] sortedArray = temp1.basicSelectionSort(arr);
		assert arr[0] == Sortedarr[0];
		assert arr[1] == Sortedarr[1];
		assert arr[2] == Sortedarr[2];
		assert arr[3] == Sortedarr[3];
		assert arr[4] == Sortedarr[4];

	}

	public void testDuplicates()
	{
		int[] arr = new int[5];
		arr[0]=-8;
		arr[1]=9;
		arr[2]=-8;
		arr[3]=10;
		arr[4]=10;

		int[] Sortedarr = new int[5];
		Sortedarr[0]=-8;
		Sortedarr[1]=-8;
		Sortedarr[2]=9;
		Sortedarr[3]=10;
		Sortedarr[4]=10;

		SelectionSort temp1 = new SelectionSort();
		int[] sortedArray = temp1.basicSelectionSort(arr);
		assert arr[0] == Sortedarr[0];
		assert arr[1] == Sortedarr[1];
		assert arr[2] == Sortedarr[2];
		assert arr[3] == Sortedarr[3];
		assert arr[4] == Sortedarr[4];


		int nom = 1;
		nom = 0;

		// REAL Test for Regulars
	}
}
