public class LogicOperators {

    public static void main(String[] args) {

        int idade = 18;
        float salario = 1400f;

        System.out.println(idade >=18 && salario >=1400);
        // Idade menor ou igual a 18 anos "e" Salário maior ou igual que R$ 1.400,00.

        System.out.println(idade >=18 || salario <1400);
        // Idade menor ou igual a 18 anos "ou" Salário menor que R$ 1.400,00.

        System.out.println(idade > 18 && salario >1400);
        // Idade maior que 18 anos "e" Salário maior que R$ 1.400,00.
    }
}
