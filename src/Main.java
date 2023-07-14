class main {
    public static void main(String[] args) {
        returningArr(new int[]{1, 2, 3, 4, 5, 6, 7});
    }
    public static int [] returningArr (int [] array) {
        for (int i = 2; i < 7; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
            System.out.println(array[i]);
        }
        return array;
     }
}