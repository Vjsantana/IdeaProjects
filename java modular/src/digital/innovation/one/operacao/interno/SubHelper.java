package digital.innovation.one.operacao.interno;

import digital.innovation.one.operacao.Operacao;

public class SubHelper implements Operacao {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
