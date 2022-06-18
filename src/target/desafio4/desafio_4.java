package target.desafio4;

public class desafio_4 {
    public static void main(String[] args) {


        double[] faturamento = {67836.43,36678.66,29229.88,27165.48,19849.53};
        String[] estado = {"SP", "RJ", "MG", "ES", "Outros"};
        double total = 0;

        for(double f: faturamento){

            total = total + f;
        }


        for(int i=0 ;i < estado.length; i++ ){

            double porc = (faturamento[i]/total) * 100;
            System.out.printf("A porcentagem do estado %s é: %.2f%%\n", estado[i],porc);

        }
    }
}
