import java.util.GregorianCalendar;

public class Relogio {
    //pra cada hora do relogio, são 30 graus
    private int obterPosicaoPonteiroHora(long hora, long minuto){
        //pego a hora, multiplico por 60 (2x cada grau da hora, para dividir depois por 2),
        // somo com os minutos e divido pra calcular a posicao do ponteiro
        return (int)(0.5 * (hora*60 + minuto));
    }

    //pra cada minuto do relogio, são 6 graus
    private int obterPosicaoPonteiroMinuto(long minuto){
        //cada minuto são 6 graus que o ponteiro move
        return (int)minuto*6;
    }

    public long retornaAnguloRelogio(GregorianCalendar horario){
        int posicaoPonteiroHora = obterPosicaoPonteiroHora(horario.getTime().getHours(),horario.getTime().getMinutes());
        int posicaoPonteiroMinuto = obterPosicaoPonteiroMinuto(horario.getTime().getMinutes());

        int angulo = Math.abs(posicaoPonteiroHora - posicaoPonteiroMinuto);

        angulo = Math.min(360-angulo, angulo);

        return angulo;
    }
}