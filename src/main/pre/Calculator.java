package com.example.tdddemo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        throw new UnsupportedOperationException("곱하기는 아직 구현이 안 되어 있습니다.");

    }

}
