import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        String stringa = "Ciao";
        int index =0;
            StringBuilder str = new StringBuilder("Stringa: " + stringa + "\nStampare unicode del carattere nella posizione specificata.\n");

        if ( index >= stringa.length() || index < 0 ) {
            str.append("Errore, inserisci altro indice");
        } else {
            printUnicode(stringa, index);
            str.append("Il carattere nella posizione " + index + " corrisponde al codice unicode: ");
            str.append(printUnicode(stringa, index));
        }

            System.out.println(str);
    }

    static int printUnicode(String a, int i){
        return a.charAt(i);
    }
}