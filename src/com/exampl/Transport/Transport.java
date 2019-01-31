//Создайте список цветов. В конструктор передаются их номера.
// Метод выводящий все цвета. Метод, который по введенному с
// кансоли номеру будет печатать какой цвет выбран.
package com.exampl.Transport;

import java.util.Scanner;

public class Transport {
    enum COLORLIST {
        // Использование инициализационных значений
        Yellow(1),

        Green(2), Blue(3),

        Brown(4), White(5),

        Red(6), Orange(7),

        Pink(8), Gray(9),

        Black(10);

        private int color;

        private COLORLIST(int c) {
            color = c;
        }
    }

    private void numberColor() {
        System.out.println("Введите номер цвета от 1 до 9");
        int numStr = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        if (sc.hasNextInt()) {
            numStr = sc.nextInt();
        }
        COLORLIST allColors[] = COLORLIST.values();

        System.out.println(allColors[numStr]);
    }

    public static void main(String args[]) {
        Transport bmw = new Transport();
        bmw.numberColor();
    }
}





