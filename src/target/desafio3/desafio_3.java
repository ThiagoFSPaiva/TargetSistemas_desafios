package target.desafio3;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;


public class desafio_3 {
    public static void main(String[] args) {


        try (FileReader reader = new FileReader("src" + File.separator + "target" + File.separator + "desafio3" + File.separator + "dados.json")) {

            Faturamento[] data = new Gson().fromJson(reader, Faturamento[].class);


            Double resultadoMax = Arrays.asList(data).stream()
                    .map(faturamento -> faturamento.getValor())
                    .max(Comparator.comparing(Double::valueOf))
                    .get();

            System.out.println("O maior é: " + resultadoMax);


            Double resultadoMin = Arrays.asList(data).stream()
                    .map(faturamento -> faturamento.getValor())
                    .filter(valor -> valor != 0.0)
                    .min(Comparator.comparing(Double::valueOf))
                    .get();

            System.out.println("O menor é: " + resultadoMin);


            Double media = Arrays.asList(data).stream()
                    .mapToDouble(Faturamento::getValor)
                    .filter(valor -> valor != 0.0)
                    .average()
                    .getAsDouble();

            System.out.println("A media é: " + media);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
