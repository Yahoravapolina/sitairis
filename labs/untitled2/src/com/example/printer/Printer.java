package com.example.printer;

// Класс Принтера
public class Printer {
    private PrintStrategy printStrategy;

    public void setPrintStrategy(PrintStrategy strategy) {
        this.printStrategy = strategy;
    }

    public void print(String document) {
        if (printStrategy == null) {
            System.out.println("Стратегия печати не установлена!");
            return;
        }
        printStrategy.print(document);
    }
}