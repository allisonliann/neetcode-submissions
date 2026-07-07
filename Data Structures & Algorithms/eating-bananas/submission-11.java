class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        int len = piles.length;
        for (int j=1; j < len; ++j) {
            if (piles[j] > max) {
                max = piles[j];
            }
        }

        int lo = 1; 
        int hi = max, k = max; 

        Arrays.sort(piles);

        while (lo <= hi) {
            int mid = (lo + hi)/2; //2

            int hrs = 0; 
            for (int i=0; i<len; ++i) {
                hrs += Math.ceil((double)piles[i]/mid);
            }
            if (hrs <= h) {
                k = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return k;   
    }
}
