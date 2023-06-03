// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
        task3();
        task4();
//        task5();
//        task6();
//        task7();
    }

    public static void task1() {
        System.out.println("Задача 1,2");
        int[] array_1 = new int[3];
        double[] array_2 = {1.57, 7.654, 9.986};
        double[] array_3 = {1.667, 2.0, 5.789};

//        System.out.println(Arrays.toString(arr));
//
        for (int index = 0; index < array_1.length; index++) {
            if (index == array_1.length - 1) {
                System.out.println(array_1[index]);
                break;
            }
            System.out.print(array_1[index] + ", ");

        }
        for (int index = 0; index < array_2.length; index++) {
            if (index == array_2.length - 1) {
                System.out.println(array_2[index]);
                break;
            }
            System.out.print(array_2[index] + ", ");
        }
        for (int index = 0; index < array_3.length; index++) {
            if (index == array_3.length - 1) {
                System.out.println(array_3[index]);
                break;
            }
            System.out.print(array_3[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array_1 = new int[3];
        double[] array_2 = {1.57, 7.654, 9.986};
        double[] array_3 = {1.667, 2.0, 5.789};

        int index_1 = array_1.length - 1;
        int index_2 = array_3.length - 1;
        int index_3 = array_3.length - 1;

        for (; index_1 >= 0; index_1--) {
            if (index_1 == 0) {
                System.out.println(array_1[index_1]);
                break;
            }
            System.out.print(array_1[index_1] + ", ");
        }

        for (; index_2 >= 0; index_2--) {
            if (index_2 == 0) {
                System.out.println(array_2[index_2]);
                break;
            }
            System.out.print(array_2[index_2] + ", ");
        }

        for (; index_3 >= 0; index_3--) {
            if (index_3 == 0) {
                System.out.println(array_3[index_3]);
                break;
            }
            System.out.print(array_3[index_3] + ", ");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array_1 = new int[3];
        for (int index = 0; index < array_1.length; index++) {
            if (index == array_1.length - 1) {
                array_1[index] = array_1[index] + 2;
                System.out.println(array_1[index]);
                break;
            }
            array_1[index] = array_1[index] + 2;
            System.out.print(array_1[index] + ", ");
        }
    }
}


