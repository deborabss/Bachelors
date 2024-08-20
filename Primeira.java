/* Leia um valor de temperatura em graus Celsius e converta-o em graus Fahrenheit e Kelvin. As fórmulas de
conversão são:
F = (9C + 160)/5
K = C + 273 */



import  java.util.Scanner;
class Main {
    public static void main(String[] args){

        double celsius, fahrenheit, kelvin;
        Scanner leituraTeclado = new Scanner (System.in);

        System.out.print("Insira a temperatura em celsius: ");
        celsius = leituraTeclado.nextDouble();
        fahrenheit = (9*celsius+160)/5;
        kelvin = celsius+273;
        System.out.println("A temperatura, em fahrenheit é = "+ fahrenheit);
        System.out.print("A temperatura, em kelvin é = "+ kelvin);

    }
}
