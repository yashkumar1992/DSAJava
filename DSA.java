package ai.skellam.tests;

import java.util.ArrayList;
import java.util.Arrays;

public class DSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {-1,-1,-1,0,1,1};
		//int[] nums = {3, 6, 1, 0};
		int[] nums = {9};
		//int pivot =0;
		//pivot = new DSA().pivotIndex(nums);
		
//		int largeIndex =0;
//		largeIndex = new DSA().dominantIndex(nums);
//		System.out.println(largeIndex);
		
		int[] newarray = new int[nums.length];
		newarray = new DSA().plusOne(nums);
		System.out.println(Arrays.toString(newarray));
		
	}
	
	
	 public int[] plusOne(int[] digits) {
	        int remainder = 0;
	        int increment = 1;
	        int[] newDigits;
	        int ninesCount =0;
	        for(int n:digits) {
	        	if(n==9)
	        		ninesCount++;
	        }
	        if(ninesCount == digits.length) {
	        	newDigits = new int[digits.length+1];
	        }else {
	        	newDigits = new int[digits.length];
	        }
	        
	        for(int i =digits.length-1;i>=0;i--) {
	        	if((digits[i]+increment+remainder)>9) {
	        		
	        		newDigits[i] = digits[i]+increment+remainder -10 ;
	        		remainder =1;
	        	}
	        	else {
	        		newDigits[i] = digits[i] +increment+ remainder;
	        		remainder =0;
	        	}
	        	increment=0;
	        	
	        }
	        if(remainder >0)
	        	newDigits[0] = remainder;
	        
	        return newDigits;
	    }
	
	 public int dominantIndex(int[] nums) {
	       int dominantMaxIndex =-1;
	       int tempMax = Integer.MIN_VALUE;
	       int tempMax2 =Integer.MIN_VALUE;
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]>tempMax) {
				 tempMax2 = tempMax;
				 tempMax = nums[i];
				 dominantMaxIndex = i;
			 }else if(nums[i]>tempMax2) {
				 tempMax2 = nums[i];
			 }
			 
		 }
		 
//		 for(int n=0;n<nums.length;n++) {
//			 
//			 if(n==dominantMaxIndex) 
//				 continue;
//			 
//			 if(!(tempMax>=(2*nums[n]))) {
//				 tempMax = Integer.MIN_VALUE;
//				 dominantMaxIndex =-1;
//			 }
//			 
//		 }
		 
		 
		 return (tempMax >= 2*tempMax2) ? dominantMaxIndex:-1;
		 
		 
	    }
	
	
	
	
	
	
	
	

	    public int pivotIndex(int[] nums) {
	        int[] leftnumsum = new int[nums.length+1];
	        ArrayList<Integer> pivot =new ArrayList<Integer>();
	        
	        for(int i=0;i<leftnumsum.length;i++){  
	            leftnumsum[i] =0;
//	        	if(i==0) {
//	        		leftnumsum[i] = 0; 
//	        		continue;
//	        	}
	        	int sum =0;
	        	for(int m =0;m<i;m++) {
	        		sum += nums[m];
	        	}
	        	leftnumsum[i]  = sum;
	           //leftnumsum[i] = nums[i-1] + leftnumsum[leftnumsum.length-1];
	        }
	        
	        for(int n=0;n<nums.length;n++){ 
	            int rightnumsum =0;
	            rightnumsum = leftnumsum[leftnumsum.length-1]-leftnumsum[n]-nums[n];
	                                
	            if(rightnumsum==leftnumsum[n]){
	                pivot.add(n);
	            }
	        }
	        
	        if(pivot.size()==0){
	            pivot.add(-1);
	        }
	      // System.out.println(numsum); 
	        
	        
	    return pivot.get(0);
	    }
	    
	   
	
}
