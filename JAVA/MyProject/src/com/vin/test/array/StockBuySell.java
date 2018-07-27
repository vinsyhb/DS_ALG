package com.vin.test.array;

public class StockBuySell {

	//In this solution you can buy and sell the shares any number of times
	public static void printStockBuySell(int[] arr, int n) {
		// {100, 180, 260, 310, 40, 535, 695}

		int buy = 0;
		int sell = 0;
		int boutghValue = 0;
		int profit = 0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				if (arr[i] < arr[i - 1] && buy > 0) {
					profit += ( arr[i-1] - boutghValue);
					System.out.println("sell on" + (i - 1) + "th day");
				} else if (buy > 0) {
					profit += (  arr[i] - boutghValue);
					System.out.println("sell on" + i + "th day");
				}
				System.out.println("profit-->"+profit);
				break;
			}
			if (arr[i + 1] > arr[i]) {

				if (buy == 0) {
					buy++;
					boutghValue  = arr[i];
					System.out.println("but at" + i + "th day");
				} else {
					continue;
				}
			} else {

				if (buy > 0) {
					profit += ( arr[i] - boutghValue );
					System.out.println("sell at" + i + "th day");
					buy--;
				}
			}

		}

	}

	public static void main(String s[]) {
		//int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
		int[] arr = {10, 22, 5, 75, 65, 80};
		printStockBuySell(arr, 6);
	}

}
