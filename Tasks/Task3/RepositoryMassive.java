package Task3;

import java.util.Arrays;

public class RepositoryMassive {
    public int[] numbers = new int[0];

    public void add(int number) {
        int[] tmp = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            tmp[i] = numbers[i];
        }
        tmp[tmp.length - 1] = number;
        numbers = tmp;
    }

    public void getMassive() {
        System.out.println(Arrays.toString(numbers));
    }


}
