package exerciciorevisao;

import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        System.out.println(" Entre com o total de vendas: ");
        Scanner teclado = new Scanner (System.in);
        double totalVendas = teclado.nextDouble();
        double comissao = totalVendas * 0.1;
        System.out.println (comissao);

    }
}
