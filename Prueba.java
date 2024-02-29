import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Prueba{

    public static void main(String[] args){
        ArrayList<Integer> listaNum = generarLista();
        System.out.println(listaNum);
        System.out.println("Resultado final: " + mineriaDatos(listaNum));
    }

    public static ArrayList<Integer> generarLista(){
        ArrayList<Integer> lista = new ArrayList<>();
        int longitud = (int) (Math.random()*30+1);

        for (int i = 0; i < longitud; i++) {
            lista.add((int) (Math.random()*10000+1));
        }

        return lista;

    }

    public static int sumarCifras(int n){
        int suma = 0;
        int cifra = 0;

        while (n != 0) {         
            cifra = n % 10;       
            suma = suma + cifra;   
            n = n / 10;            
        }

        return suma;
    }

    public static int sumarNumeros(ArrayList<Integer> numeros){
        int sol = 0;
        for (Integer numero : numeros) { 
            sol+= numero.intValue();
        }
        return sol;
    }

    public static int mineriaDatos(ArrayList<Integer> numeros){
        int suma = sumarNumeros(numeros);
        System.out.println("Suma de numeros: " + suma);
        int sumaCifras = sumarCifras(suma);
        System.out.println("Suma de cifras: " + sumaCifras);

        if(sumaCifras == 0){
            return 0;
        }

        if(sumaCifras % 9 == 0){
            return 9;
        }else{
            return sumaCifras % 9;
        }
    }
}
