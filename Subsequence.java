import java.util.*;
public class Subsequence
{
    
    public int subseq(int[] arr, int j, ArrayList<Integer> subseqarr)
    {
        if(j == arr.length)
        {
            for(int num : subseqarr)
            {
                
                System.out.print(num+" ");
            }
            System.out.println();
            return 1;
        }
        
        int count = 0;
        subseqarr.add(arr[j]);
        count+=subseq(arr,j+1,subseqarr);
        
        subseqarr.remove(subseqarr.size()-1);
        count+=subseq(arr,j+1,subseqarr);
        return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array : ");
		String arstr = sc.nextLine();
	
		String[] starr= arstr.split(" ");
		int n = starr.length;
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i] = Integer.parseInt(starr[i]);
		}
		
		Subsequence main = new Subsequence();
		System.out.println("All the Subsequence value are ");
		int count = main.subseq(arr,0,new ArrayList<Integer>());
		
		System.out.println("Total number of subsequences: " + count);
	}
}
