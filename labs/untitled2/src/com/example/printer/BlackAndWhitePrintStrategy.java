package com.example.printer;

// Конкретная стратегия: Черно-белая печать
public class BlackAndWhitePrintStrategy implements PrintStrategy {
    @Override
    public void print(String document) {
        System.out.println("Печать документа в черно-белом формате: " + document);
    }
}