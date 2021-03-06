/* judge samll:passed
   judge large:Time limit exceeded
   time complexity: O(n^3)
   Memo:        java.util.Arrays to use Arrays.sort(); 1)It is in place;
                java.util.ArrayList to use ArrayList; 1)ArrayList.get(index) to get one element;2)ArrayList.contains()
*/
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        if(num.length<3)
            return result;
        
        Arrays.sort(num);        
        for(int i=0;i<num.length-2;i++)
            for(int j=i+1;j<num.length-1;j++)
                for(int p=j+1;p<num.length;p++){
                    if(num[i]+num[j]+num[p]==0){
                         ArrayList<Integer> triplet = new ArrayList<Integer>(3);
                         triplet.add(num[i]);
                         triplet.add(num[j]);
                         triplet.add(num[p]);
                         if(!result.contains(triplet))
                            result.add(triplet);
                    }
                }
        
        return result;
    }
        
}