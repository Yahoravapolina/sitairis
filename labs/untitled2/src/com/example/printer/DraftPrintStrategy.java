package com.example.printer;


// Конкретная стратегия: Черновая печать
public class DraftPrintStrategy implements PrintStrategy {
    @Override
    public void print(String document) {
        System.out.println("Печать документа в черновом формате: " + document);
    }
}