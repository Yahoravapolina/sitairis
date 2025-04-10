package com.example.printer;

// Конкретная стратегия: Цветная печать
public class ColorPrintStrategy implements PrintStrategy {
    @Override
    public void print(String document) {
        System.out.println("Печать документа в цветном формате: " + document);
    }
}