public class TwoDArray {
    private int[][] arr;

    public TwoDArray(int rows, int cols) {
        arr = new int[rows][cols];
    }

    public void set(int r, int c, int data) {
        arr[r][c] = data;
    }

    public int get(int r, int c) {
        return arr[r][c];
    }

    public void print() {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoDArray tda = new TwoDArray(3, 3);
        tda.set(0, 0, 1);
        tda.set(0, 1, 2);
        tda.set(0, 2, 3);
        tda.set(1, 0, 4);
        tda.set(1, 1, 5);
        tda.set(1, 2, 6);
        tda.set(2, 0, 7);
        tda.set(2, 1, 8);
        tda.set(2, 2, 9);
        
        tda.print(); 
    }
}