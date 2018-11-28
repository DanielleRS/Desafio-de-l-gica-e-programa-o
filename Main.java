import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instancia o scanner pra ler digitos do teclado
        Scanner sc = new Scanner(System.in);
        //printa na tela
        System.out.print("Digite a hora (entre 00 e 24): ");
        
        int hora = sc.nextInt();
        System.out.print("Digite o minuto (entre 00 e 60): ");
        int minuto = sc.nextInt();

        //valida hora
        if (hora < 0 || minuto < 0 || hora > 24 || minuto > 60) {
            System.out.println("Entrada inválida!");
            return ;
        }

        //tira o mod da hora de acordo com os ponteiros do relogio. 23h = 11h no relogio
        hora = hora % 12;
        minuto = minuto % 60;

        Relogio relogio = new Relogio();
        //00:00
        //instancia um gregoriancalendar com os valores do usuario
        GregorianCalendar g = new GregorianCalendar(2018, 11, 28, hora, minuto);
        //calcula o angulo
        long diferenca = relogio.retornaAnguloRelogio(g);
        //printa o angulo
        System.out.println("A diferença do ângulo entre os 2 ponteiros do relógio é: " + diferenca);

    }
}