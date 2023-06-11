package pro.sky.k2hw12test.service;


import org.springframework.stereotype.Service;
import pro.sky.k2hw12test.exception.DivByZeroException;

@Service
public class CalculatorService {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus (int a, int b){
        return a - b;
    }


    public int multiply (int a, int b){
        return a * b;
    }
    public double divide (int a, int b){
       if(b==0){
           throw new DivByZeroException();
       }

        return  (double) a/b;
    }
}