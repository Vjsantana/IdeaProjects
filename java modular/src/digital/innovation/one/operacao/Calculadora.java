package digital.innovation.one.operacao;

import digital.innovation.one.operacao.interno.DivHelper;
import digital.innovation.one.operacao.interno.MultHelper;
import digital.innovation.one.operacao.interno.SubHelper;
import digital.innovation.one.operacao.interno.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;


    public int sum (int a, int b){
        return sumHelper.execute(a,b);

    }
    public int sub (int a, int b){
        return subHelper.execute(a,b);

    }

    public int mult (int a, int b){
        return multHelper.execute(a,b);

    }

    public int div (int a, int b){
        return divHelper.execute(a,b);

    }
}