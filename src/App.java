public class App {

    public static void main(String[] args) {
        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar( 29, 24);
        System.out.println(somaDasIdades);

        int diferençasEntreIdades = calculadoraDeIdades.subtrai(29,24);
        System.out.println(diferençasEntreIdades);

        int multiplicaçãoDasIdades = calculadoraDeIdades.multiplica(29,24);
        System.out.println(multiplicaçãoDasIdades);

        double divisãoDasIdades = calculadoraDeIdades.divisão(29,24);
        System.out.println(divisãoDasIdades);

        Comparador comparadorDeValores = new Comparador();
        boolean menorQue = comparadorDeValores.menorQue(54,100);
        System.out.println(menorQue);

        boolean maiorQue = comparadorDeValores.maiorQue(54,100);
        System.out.println(maiorQue);

    }
}
