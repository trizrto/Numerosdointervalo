import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//um programa que leia um valor inteiro N. Este valor sera a quantidade de valores inteiros x que serao lidos em seguida. Mostre quantos destes valores x estão dentro do intervalo [10, 20] e quantos estao fora do intervalo, mostrando essas informações;
    int quantidadeDeNumerosDigitados = sc.nextInt();
    int valoresDentroDoIntervalo = 0;
    int numeroDigitado = 0;

    for (int i = 0; i < quantidadDeNumerosDigitados; i++){
      System.out.println("Digite o valor a ser comparado");
      numeroDigitado = sc.nextInt();
      if ( numeroDigitado >= 10 && numeroDigitado <= 20){
        valoresDentroDoIntervalo++;
      }else {
        valoresForaDoIntervalo++;
      }
    }

System.out.println("Dentro do intervalo temos: " + valoresDentroDoIntervalo);
    System.out.println("Fora do intervalo temos");





    
    sc.close();
  }


}