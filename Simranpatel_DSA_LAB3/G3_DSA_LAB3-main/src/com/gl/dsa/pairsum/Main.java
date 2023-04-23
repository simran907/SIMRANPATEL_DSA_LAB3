package com.gl.dsa.pairsum;
import java.util.Scanner;
import com.gl.dsa.pairsum.PairSum.Node;


public class Main {
	 public static void main(String[] args) {
	 System.out.println("Enter no of nodes");
	 Scanner input = new Scanner(System.in);
	 
	int n = input.nextInt();
	
	Node root = null;
	
	PairSum findSP = new PairSum();
	System.out.println("Insert Nodes");
	for(int i=0;i<n;i++)
	{
		
		root = findSP.insert(root, input.nextInt());
		
	}


	System.out.println("Insert Sum to find");
	int sum = input.nextInt();
	
	findSP.findPairWithGivenSum(root, sum);
	 }
}
