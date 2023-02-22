package com.librarymanagement.enums;

public enum Genre {
    ROMANCE("Romance"),
    FANTASY("Ficção/Fantasia"),
    BIOGRAPHY("Biografias/Memórias"),
    THRILLER("Suspense/Mistério"),
    HISTORY("História/Cultura");

    private final String value;
    
    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
