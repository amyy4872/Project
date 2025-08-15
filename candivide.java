public class candivide {

    static boolean isPartitionPossible(int arr[],int n,int target)
    {
        if(target == 0) return true;
        if(n < 0 || target < 0) return false;

        boolean pick=isPartitionPossible(arr,n-1,target-arr[n]);
        boolean nopick=isPartitionPossible(arr,n-1,target);

        return pick || nopick;

    }

    public static void main(String args[])
    {
        int arr[]={1,5,11,5};
        int sum=0;
        boolean ans=false;
        for(int i=0;i<arr.length;i++) sum += arr[i];
        if(sum %2 != 0) ans=false;
        else
          ans =isPartitionPossible(arr,arr.length-1,sum/2);
        System.out.println(ans);
    }
    
}


/*
 * class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        boolean ans=false;
        for(int i=0;i<nums.length;i++) sum += nums[i];
        if(sum %2 != 0) return false;
        else
        { 
          Boolean dp[][]=new Boolean[nums.length][sum/2+1];
          ans =isPartitionPossible(nums,nums.length-1,sum/2,dp);
        }

        return ans;
    }

    boolean isPartitionPossible(int arr[],int n,int target,Boolean dp[][])
    {
        if(target == 0) return true;
        if(n < 0 || target < 0) return false;

        if(dp[n][target] != null) return dp[n][target];

        boolean pick=isPartitionPossible(arr,n-1,target-arr[n],dp);
        boolean nopick=isPartitionPossible(arr,n-1,target,dp);

        dp[n][target] = pick || nopick;
        return dp[n][target];

    }
}
 */