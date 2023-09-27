package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributo
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int n){
        integerList.add(n);
    }

    public int calcularSomar(){
        int result = 0;
        if (!integerList.isEmpty()){
            for (Integer n : integerList){
                result += n;
            }
        }
        return result;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!integerList.isEmpty()){
            for (Integer n : integerList){
                if (n > maiorNumero){
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 999999999;
        if (!integerList.isEmpty()){
            for (Integer n : integerList){
                if (n < menorNumero){
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public void exibirnumeros(){
        System.out.println(integerList);
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(30);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(90);
        numeros.adicionarNumero(75);

        System.out.println(numeros.calcularSomar());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());

    }
}
