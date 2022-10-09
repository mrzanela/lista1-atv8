import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite quanto você ganha por hora: ");
       double salHora = sc.nextDouble();
       System.out.println("Digite quantas horas foram trabalhadas no mês: ");
       double horaMes = sc.nextDouble();
       sc.close();
       //Calcule e mostre o total do seu salário no referido mês.
       double salMes = salHora * horaMes;
       System.out.println("O seu salário desse mês é: " +salMes);
    }
}
