public class BubbleSort {

    public static void main(String[] args) {
        int size = 5;
        int[] data = new int[size];
        for(int x = 0; x<size; x++ ){
            data[x] = (int) (Math.random() *100);
        }
        System.out.println("Before sort");
        for(int x = 0; x<size; x++ ){
            System.out.println(data[x]);
        }

        for(int x = 1; x<size; x++ ){
            for (int z = 0; z<size-x; z++) {
                if (data[z] > data[z+1] ){
                    int temp = data[z];
                    data[z] = data[z+1];
                    data[z+1]= temp;
                }
            }

        }

        System.out.println("Before sort");
        for(int x = 0; x<size; x++ ){
            System.out.println(data[x]);
        }
    }
}