class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        /*
        int max = piles[0];
        int len = piles.length;
        for (int j=1; j < len; ++j) {
            if (piles[j] > max) {
                max = piles[j];
            }
        }

        if (len == h) return max;

        int k;
        for (k=1; k <= max; ++k) {
            int hrs = 0; 
            for (int i=0; i<len; ++i) {
                hrs += Math.ceil((double)piles[i]/k);
            }
            if (hrs <= h) {
                return k;
            }
        }

        return max;
        */

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


        
        // Arrays.sort(piles);
        // int k = 0;
        // int len = piles.length;
        // int low = 0, high = len - 1;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     k = piles[mid];
        //     int hrs = 0; 
        //     for (int i=0; i<len; ++i) {
        //         hrs += Math.ceil((double)piles[i]/k);
        //     }
        //     if (hrs <= h) {
        //         high = mid - 1;
        //     }
        //     else {
        //         low = mid + 1;
        //     }
        // }
        // return k;
        
    }
}
