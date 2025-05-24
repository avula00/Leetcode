class Solution {
    public int search(int[] nums, int target) {
       int start = 0,end = nums.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)  return mid;
            if(nums[start] <= nums[mid])
            {
                if(nums[start] <= target && target < nums[mid]) end = mid -1;
                else start = mid+1;
            
            }
            else{
                if(nums[mid] < target && target <= nums[end]) start= mid + 1 ;
                else end = mid-1;
            }
        }
        return -1;
    }
}        
// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0, high = nums.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             if (nums[low] <= nums[mid]) { // left part
//                 if (nums[low] <= target && target < nums[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             } else { // right part
//                 if (nums[mid] < target && target <= nums[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }