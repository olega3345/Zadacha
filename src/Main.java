public class Main {
    public static int [] returningArray(int[] inputArray) {
        //Увеличиваем все четные числа на единицу
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                inputArray[i]++;
            }
        }
        //Возвращаем кусок массива с 3 по 7 элемент
        int[] subArray = new int[5];
        for (int i = 0; i < 5; i++) {
            subArray[i] = inputArray[i + 2];
        }
        return subArray;
    }
    public static void main(String[] args) {
        int[] inoutArray = {1, 2, 3, 4, 5, 6, 7};
        int [] result = returningArray(inoutArray);
        for (int num : result) {
            System.out.println(num);

        }
    }
}