import java.util.Scanner;


class sorted {
    private int n;
    private int[] test;

    sorted(int size, int[] t) {
        n = size;
        test = t;
        for (int i = 1; i < size; i++) {
            int temp = test[i];
            int j = i;
            while (j > 0 && temp < test[j - 1]) {
                test[j] = test[j - 1];
                j--;
            }
            test[j] = temp;
        }
    }
        void print() {
            for (int i = 0; i < n; i++) {
                System.out.print(test[i] + " ");
            }
        }
}

    public class Main {
        public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           int n=input.nextInt();
           int[] test =new int[n];
                for (int i=0;i<n;i++){
                    test[i]= input.nextInt();
                }
            sorted s = new sorted(test.length, test);
            s.print();
        }
    }


