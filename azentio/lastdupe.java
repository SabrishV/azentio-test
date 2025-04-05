public class lastdupe {
    public Integer lastDupe(int[] arr) {
        Integer lastDupe = null;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lastDupe = arr[i];
                }
            }
        }
        return lastDupe;
    }

    public static void main(String[] args) {
        dupeinarray finder = new dupeinarray();
        int[] arr = {1, 2, 3, 2, 4, 3, 5};
        System.out.println("last dupe: " + finder.lastDupe(arr));
    }
}
