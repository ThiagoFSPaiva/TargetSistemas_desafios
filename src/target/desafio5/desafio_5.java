package target.desafio5;

public class desafio_5 {
    public static void main(String[] args) {

        System.out.println(reverseString("Cuidado"));
        System.out.println(reverseString("A target sistema e fera!"));



    }

    public static String reverseString(String s) {

        String inverter = "";

        for (int i = s.length() - 1; i >= 0 ; i--){
            inverter += s.charAt(i);
        }

        return inverter;
    }
}
