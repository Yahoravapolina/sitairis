package com.example.printer;

// Класс Клиента
public class Client {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Установка стратегии черно-белой печати
        printer.setPrintStrategy(new BlackAndWhitePrintStrategy());
        printer.print("Документ 1");

        // Установка стратегии цветной печати
        printer.setPrintStrategy(new ColorPrintStrategy());
        printer.print("Документ 2");

        // Установка стратегии черновой печати
        printer.setPrintStrategy(new DraftPrintStrategy());
        printer.print("Документ 3");
    }
}