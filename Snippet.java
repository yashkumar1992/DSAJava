package ai.skellam.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Snippet {
	
	public static void main(String[] args) {
		
//		int[][] matrix = new int[1][2];
//		matrix[0][0]=2;
//		matrix[0][1]=3;
//		int n = matrix.length;
//		int m = matrix[0].length;
//		int[] diagonal = new int[n*m];
//		diagonal = new Snippet().findDiagonalOrder(matrix);
//		System.out.println(diagonal.toString());
		
//		List<List<Integer>> res = new Snippet().generate(5);
//		System.out.println(res.toString());
		
		
		//List<List<Integer>> res = new Snippet().generate(5);
		//System.out.println(res.toString());
		
		int index = 0;
		
		//index = new Snippet().strStr("mississippi", "issip");
		//System.out.println(index);
		
		
		//index = new Snippet().strStr("mississippi", "issip");
		//System.out.println(index);
		
		//String[] strs = {"flower","flow","flight"};
//		String[] strs = {"aa","a"};
//		String prefix = new Snippet().longestCommonPrefix(strs);
//		System.out.println(prefix);
//		
//		int[] num = {2,3,4};
//		int[] inds = new Snippet().twoSum(num,6);
//		System.out.println(inds[0]);
//		System.out.println(inds[1]);
		
//		int[] num = {0,1};
//		int inds = new Snippet().findMaxConsecutiveOnes(num);
//		System.out.println(inds);
		
		
		int[] num = {10,2,3};
		int inds = new Snippet().minSubArrayLen(6,num);
		System.out.println(inds);
	}
	
	
	 public int minSubArrayLen(int s, int[] nums) {
	        
	        ArrayList<Integer> subArray = new ArrayList<Integer>();
	        
	        for(int i=0;i<nums.length;i++){
	            ArrayList<Integer> subArrayTemp = new ArrayList<Integer>();
	            boolean subArraySum = false;
	            int sum = nums[i];
	            subArrayTemp.add(nums[i]);
	            if(sum>=s){
	            	subArray =  subArrayTemp;
	            	break;
	            }
	            for(int j=i+1;j<nums.length;j++){
	                sum += nums[j];
	                subArrayTemp.add(nums[j]);
	                if(sum>=s){
	                	subArraySum = true;
	                    break;
	                }
	            }
	            
	            if((subArrayTemp.size()<=subArray.size() || subArray.size()<=0) && subArraySum){
	               subArray =  subArrayTemp;
	            }
	            
	            
	        }
	        
	        return subArray.size();
	    }
	
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int numOfTimes =0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i = 0;i<nums.length;i++){
            int numOfTimesTemp =0;
            if(nums[i]==1){
                numOfTimesTemp++;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]==1){
                    numOfTimesTemp++;
                }else{
                    break;
                }
              
            }
            if(numOfTimesTemp>numOfTimes){
                numOfTimes = numOfTimesTemp;
            }
                
            }
        }
        
        return numOfTimes;
    }
	
	
	
	 public int[] twoSum(int[] numbers, int target) {
	        
	        int sum = 0;
	        int[] ind = new int[2];
	       
	        for(int i=0;i<numbers.length-1;i++){
	            
	            for(int j=i+1;j<=numbers.length-1;j++){

	                if((numbers[i]+numbers[j])==target){
	                   ind[0] = i+1;
	                    ind[1] = j+1;
	                    break;
	                }
	                
	            }
	            
	        }
	        return ind;
	    }
	
public String longestCommonPrefix(String[] strs) {
	
	if(strs.length==0)
		return "";
	String prefix = strs[0];
	for(int i=0;i<strs.length;i++) {
		if(strs[i].length()==0)
			return "";
		if(strs[i].length()<prefix.length()) {
			prefix = strs[i];
		}
	}
	
	
	String result = "";
	int match =1;
	for(int n=0;n<prefix.length();n++) {
		char prefixchar = prefix.charAt(n);
		for(int i=0;i<strs.length;i++) {
			if(strs[i].length()==0)
				return "";
			if(strs[i].length()<prefix.length())
				continue;
			String str = strs[i];
			if(!(prefixchar==str.charAt(n))) {
				match =-1;
				break;
			}else {
				System.out.println("Char Match"+prefixchar);
			}
			
		}
		if(match==-1) {
			break;
		}else {
			result += prefixchar;
		}
		
	}
	return result;
        
    }
	
	
	
	 public int strStr(String haystack, String needle) {
		 
		 int nLen = needle.length();
		 if(nLen==0)
			 return 0;
		 int hlen = haystack.length();
		 int match = 1;
		 for(int i=0;i<=hlen-nLen;i++) {
			 
			 for(int n=0;n<nLen;n++) {
				 char hs = haystack.charAt(n+i);
				 char nd = needle.charAt(n);
				if(!(hs==nd)) {
					match=-1;
					break;
				}else {
					System.out.println("Char match "+hs+" : "+nd);
				}
			 }
		
			 if(match==1) {
			 return i;
			 }else {
				 match =1;
			 }
		 }
	     
		 return -1;
	    }
	
	
	  public String addBinary(String a, String b) {
		  
		  
		
		String res = "";
		int i = a.length()-1;
		int j = b.length()-1;
		int sum =0;
		
		while(i>=0 || j>=0 || sum==1) {
			sum += (i>=0)?Character.getNumericValue(a.charAt(i)):0;
			sum +=	(j>=0)?	Character.getNumericValue(b.charAt(j)):0;
			System.out.println(sum);
			
			// add 1 of sum is 1 or 3 otherwise add o and carry over the sum as remainder
			// add to result
			res = (char)sum%2 + res;
			System.out.println(res);
			// carry over
			sum/=2;
			System.out.println(sum);
			
			i--;
			j--;
		}
		System.out.println("--");
		System.out.println(res);
		  return res;
	        
	    }
	
	
	  public List<List<Integer>> generate(int numRows) {
		 
		  List<List<Integer>> result  = new ArrayList<List<Integer>>();
		  
		  for(int i=0;i<numRows;i++) {
			  int length = i+1;
			  int start = 0;
			  int end = i;
			  List<Integer> ar  = new ArrayList<Integer>();			  
			  for(int m=0;m<=i;m++) {
				  if(m==start || m==end) {
					  ar.add(1);
				  }else {
					  int sum = result.get(i-1).get(m-1)+result.get(i-1).get(m);
					  ar.add(sum);
				  } 
			  }			  
			  result.add(ar);  
		  }
	        
		  return result;
	    }
	
	
	
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans  = new ArrayList<Integer>();
		
		if(matrix.length == 0) {
			return ans;
		}
		
		int n = matrix.length;
		int m = matrix[0].length;
		boolean[][] seen = new boolean[n][m];
		
		int[] dr = {0,1,0,-1};
		int[] dc = {1,0,-1,0};
		
		int row = 0;
		int col = 0;
		int ind = 0;
		for(int d = 0; d<m*n;d++) {
			
			ans.add(matrix[row][col]);
			seen[row][col] = true;
			
			int cursor_row = row + dr[ind];
			int cursor_col = col + dc[ind];
			
			if(0<=cursor_row && cursor_row<n && 0<=cursor_col && cursor_col<m && !seen[cursor_row][cursor_col]) {
				//  if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]){
				row = cursor_row;
				col = cursor_col;
			}else {
				ind = (ind+1)%4;
				row += dr[ind];
				col += dc[ind];
			}
			
		}
		
		return ans;

	}
	
	
	
	
	public int[] findDiagonalOrder(int[][] matrix) {
		 
		int n = matrix.length;
	    if(n==0){
	        return new int[0];
	    }
		int m = matrix[0].length;
	    
	    
		
		int[] result = new int[n*m];
		int k = 0;
		ArrayList<Integer> interList = new ArrayList<Integer>();
		
		// iterate for all elements in first row and last column
		for(int i=0;i<m+n-1;i++) {
			
			// clear
			interList.clear();
			
			// find the head 
			int r = i < m ? 0:i-m+1;
			int c = i< m ? i:m-1;
			
			
			while(r < n && c > -1) {
				interList.add(matrix[r][c]);
				--c;
				++r;
			}
			
			if(i%2==0) {
			 Collections.reverse(interList);
			}
			
			
			for(int num:interList) {
				result[k++] = num;
			}
			
			
			
		}
		
		return result;
		
			 
			 
			 
			 
	}

}
