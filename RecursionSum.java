package recursionExercise;

//---------------------------------------------------------------
//Recursive sum of even numbers
//Developer: עידן דרור
//Description: Recursively sums all even elements in an array.
//---------------------------------------------------------------


public class RecursionSum {

    public static int sumEven(int[] arr, int n) {
        // Base case: no elements left
        if (n == 0) {
            return 0;
        }

        // Recursive sum of the remaining elements
        int rest = sumEven(arr, n - 1);

        // Add the last element if it is even
        if (arr[n - 1] % 2 == 0) {
            return arr[n - 1] + rest;
        } else {
            return rest;
        }
    }

    public static void main(String[] args) {

        int[] nums = { 1, 4, 5, 8, 2, 7 };
        System.out.println(sumEven(nums, nums.length));  // Output: 14
    }
}


/*
סיבוכיות זמן:

נסמן 
T(n) = 
זמן הריצה של הפעולה על מערך בגודל 
n

בכל קריאה הפעולה:
1. 
מבצעת פעולה קבועה 
O(1)

2. 
קוראת לעצמה פעם אחת עם 
n-1 
איברים

לכן:
T(n) = T(n - 1) + O(1)

פתרון הנוסחה:
T(n) = O(1) + O(1) + ... (n times) = O(n)

כלומר זמן ריצה ליניארי

סיבוכיות מקום:

בגלל שהפעולה רקורסיבית, בכל קריאה נוסף פריים אחד למחסנית הקריאות
יש 
n 
קריאות עד שמגיעים ל
n = 0 
לכן עומק המחסנית הוא 
n

=> סיבוכיות מקום: O(n)


*/