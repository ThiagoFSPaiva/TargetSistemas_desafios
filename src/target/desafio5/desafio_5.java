package target.desafio5;

public class desafio_5 {
    public static void main(String[] args) {

        System.out.println(inverterString("Cuidado"));
        System.out.println(inverterString("A target sistema e fera!"));

    }

    public static String inverterString(String s) {

        String inverter = "";

        for (int i = s.length() - 1; i >= 0 ; i--){
            inverter += s.charAt(i);
        }

        return inverter;
    }
}
