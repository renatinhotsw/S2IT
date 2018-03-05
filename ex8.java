public class ManipulacaoNumerica {

public static void GerarC(String a, String b) {

    if (a != null && b != null) {

        StringBuilder c = new StringBuilder();
        System.out.println("Valores de Entrada: " + a + " - " + b);
        int i = 0;
        int j = 0;

        loop: for (; i <= a.length();) {
            System.out.println(i);
            int proxi = i + 1;
            if (proxi <= a.length()) {
                c.append(a.substring(i, proxi)).toString();
            }
            i++;

            for (; j <= b.length();) {
                System.out.println(j);
                int proxj = j + 1;
                if (proxj <= b.length()) {
                    c.append(b.substring(j, proxj)).toString();
                }
                j++;

                continue loop;

            }
        }
        try{
            int valor = Integer.valueOf(c.toString());
            if (valor < 1000000) {
                System.out.println("Valor de Saída: " + c);
            } else {
                valor = -1;
                System.out.println("Número maior que 1.000.000:" + valor);
            }
        }catch (Exception e) {
            // TODO: handle exception
            int valor = -1;
            System.out.println("Ocorreu um erro na aplicação: "+ e +" o valor de c é: "+valor);
        }
    }
}

public static void Executa(String a, String b) {

    if(a.length() > b.length()){
        GerarC(a,b);
    }else{
        GerarC(b,a);
    }

}

public static void main(String[] args) {

    Executa("24", "1999");

}

}
