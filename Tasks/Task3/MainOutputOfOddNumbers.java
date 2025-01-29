package Task3;

public class MainOutputOfOddNumbers {
    public static void main(String[] args) {
        RepositoryMassive repositoryMassive = new RepositoryMassive();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {

            if (number % 2 == 0) {
                repositoryMassive.add(number);
            }

        }

        repositoryMassive.getMassive();


    }
}