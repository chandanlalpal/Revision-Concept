package Array;

public class MergeSortedArray {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p = m - 1;        // pointer for nums1
            int lv = n - 1;       // pointer for nums2
            int l = m + n - 1;    // pointer for merged array (from the end)

            while (p >= 0 && lv >= 0) {
                if (nums1[p] >= nums2[lv]) {
                    nums1[l--] = nums1[p--];
                } else {
                    nums1[l--] = nums2[lv--];
                }
            }

            // If anything remains in nums2, copy it (in case p < 0)
            while (lv >= 0) {
                nums1[l--] = nums2[lv--];
            }
        }
    }

}
