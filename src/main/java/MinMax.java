public class MinMax {

    /**
     * Returns the smallest value in the array.
     * <p>
     * Traversal strategy: initialize your tracking variable to arr[0],
     * then loop from index 1 to the end, updating whenever you find
     * a smaller value.
     * <p>
     * Assume the array is non-null and has at least one element.
     * <p>
     * Example:
     * arr = {5, 3, 8, 1, 6}  →  returns 1
     * arr = {4, 4, 4}        →  returns 4
     */
    public int min(int[] arr) {
        // TODO: initialize a tracking variable to arr[0]
        int tracking = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tracking) {
                tracking = arr[i];
            }
        }
        // TODO: loop from index 1 to arr.length - 1
        //       if arr[i] is less than your tracking variable, update it

        // TODO: return the tracking variable
        return tracking; // placeholder
    }

    /**
     * Returns the largest value in the array.
     * <p>
     * Traversal strategy: same pattern as min(), but update when you
     * find a larger value instead.
     * <p>
     * Assume the array is non-null and has at least one element.
     * <p>
     * Example:
     * arr = {5, 3, 8, 1, 6}  →  returns 8
     * arr = {-2, -5, -1}     →  returns -1
     */
    public int max(int[] arr) {
        int tracking = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > tracking) {
                tracking = arr[i];
            }
        }
        return tracking;
    }
}
