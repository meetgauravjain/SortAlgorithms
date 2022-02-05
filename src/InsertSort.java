public class InsertSort {
    public static void main(String[] args) {
        int size = 1000;
        int[] data = new int[size];
        for(int x = 0; x<size; x++ ){
            data[x] = (int) (Math.random() *100);
        }
        System.out.println("Before sort");
        for(int x = 0; x<size; x++ ){
            System.out.println(data[x]);
        }
        for(int x = 0; x<size; x++ ){
            for(int j = x; j>0; --j ){
               if (data[j-1] > data[j] ){
                   int temp = data[j];
                   data[j] = data[j-1];
                   data[j-1] = temp;
               }
            }
        }
        System.out.println("After sort");
        for(int x = 0; x<size; x++ ){
            System.out.println(data[x]);
        }
    }
}
