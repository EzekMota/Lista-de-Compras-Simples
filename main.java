import java.util.Scanner;

public class Main {



public static void main(String[] args) {

// TODO code application logic here



// Variáveis

double percipi, quantprod1, precunit1;

double vlsemipi1, vlcomipi1, vlvenda1, vltotal = 0;

String prod1, unid1;

int contadorloop, quantprod;



// Entrada de dados ip1

System.out.println("Entre com o percentual de ipi: ");

percipi = new Scanner(System.in).nextDouble();



// Entrada de quantide produtos

System.out.println("Entre com a quantidade de produtos desejado : ");

quantprod = new Scanner(System.in).nextInt();



// LOOP PRODUTOS
contadorloop = 1;
while ( contadorloop <= quantprod)

{

// Entrada de dados produto1



System.out.println("**** DIGITAÇÃO DO PRODUTO **** " + contadorloop);

System.out.println("Entre a descrição do produto: " + contadorloop);

prod1 = new Scanner(System.in).next();

System.out.println("Entre com quantidade do produto :" + contadorloop);

quantprod1 = new Scanner(System.in).nextDouble();

System.out.println("Entre a descrição da unidade do produto : " + contadorloop);

unid1 = new Scanner(System.in).next();

System.out.println("Entre com o preço unitário do produto :" + contadorloop);

precunit1 = new Scanner(System.in).nextDouble();

System.out.println(" ");



// Calcular preço Unitário x Quantidade

vlsemipi1 = quantprod1 * precunit1;



// Calcular Valor do Ipi

vlcomipi1 = vlsemipi1 * (percipi / 100);



// Calcular valor da venda

vlvenda1 = vlsemipi1 + vlcomipi1;



// Calcular valor total da venda

vltotal = vltotal + vlvenda1;



// Exibir todas às variáveis PRODUTO 1

System.out.println(" ****** PRODUTO 1 *********");

System.out.println("Produto=> " + contadorloop + " : " + prod1 + " Quant prod => " + contadorloop + " : " + quantprod1 + " Unidade prod => "+ contadorloop + " : " + unid1);

System.out.println("Preço unit prod => " + contadorloop + " : " + precunit1 + " Valor iPi prod => " + contadorloop + " : " + vlcomipi1 + " Val venda prod => "+ contadorloop + " : " + vlvenda1);

System.out.println(" ");
contadorloop = contadorloop + 1;

} //fim do for



// Exibir o Valor Total

System.out.println(" ****** Valor Total da Compra *********");

System.out.println("Valor Total da Compra: " + vltotal);



}

}
