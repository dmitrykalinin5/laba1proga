import java.util.Arrays;

public class laba {
    public static void main(String[] args) {
        int[] z = new int[16]; // Первый массив
        double[] x = new double[15]; // второй
        double[][] w = new double[16][15];
        int value = 20; // переменна для заполнения массива
        for (int i = 0; i < z.length; i++) { // цикл заполняющий массивы
            z[i] = value;
            value--;
            if (i > 0) {
                double randomNumber = -3.0 + (Math.random() * 10.0); // Math.random() генерирует рандомное число от 0.0 до 1.0
                x[i-1] = Math.round(randomNumber * 10.0) / 10.0;     
            }
        }

        int[] checker = {5,7,9,10,11,12,18,19};

        // циклы для заполнения третьего массива по формулам
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                if (z[i] == 20) {
                    w[i][j] = Math.pow(Math.asin((x[j]+2)/1*Math.E+1) + 1/0.5, 2);
                } else if (Arrays.binarySearch(checker, z[i]) >= 0) {
                    w[i][j] = Math.pow(Math.pow(Math.exp(1), Math.cos(x[j])), 0.25/Math.tan(Math.cbrt(x[j])));
                } else {
                    w[i][j] = Math.pow(Math.tan(Math.sin(Math.pow(x[j], x[j]-3/x[j]))), Math.pow((1/2/Math.tan(Math.pow(x[j]/3, 3))), 
                    Math.asin(0.5 * (x[j]+2) /1 * Math.E + 1)) * (Math.pow(Math.exp(1), Math.tan(Math.pow(x[j], x[j])))) - 4);
                }
            }
        };
        
        // циклы для вывода информации
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                String out = Double.toString(w[i][j]); // Конвертируем double в String
                if (out != "NaN") { // Выводим значение, если оно не равно NaN (для красоты)
                    System.out.printf("%8.3f", w[i][j]); // Форматированная строка с табуляцией
                }       
            }
        }
    }
}