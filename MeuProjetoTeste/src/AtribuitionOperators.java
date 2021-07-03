public class AtribuitionOperators {

    public static void main(String[] args) {

        // Os operadores de atribuição são: =; -=; +=; *=; /= e %=.
        int salario1 = 1100;
        salario1 += 250;
        System.out.println("Remuneração 1 = "+salario1);

        int salario2 = 1300;
        salario2 -= 250;
        System.out.println("Remuneração 2 = "+salario2);

        int salario3 = 1500;
        salario3 *= 3;
        System.out.println("Remuneração 3 = "+salario3);

        int salario4 = 1700;
        salario4 /= 5;
        System.out.println("Remuneração 4 = "+salario4);

        int salario5 = 1800;
        salario5 %= 7;
        System.out.println("Remuneração 5 = "+salario5);

    }
}
