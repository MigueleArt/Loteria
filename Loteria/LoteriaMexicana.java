import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LoteriaMexicana {
    
    public static void main(String[] args) {
        CartaAleatoria();
        CartasAleatorias();
    }

    private static final List<String> CARTAS = Arrays.asList(
        "El Gallo", "El Diablo", "La Dama", "El Catrín", "El Paraguas",
        "La Sirena", "La Escalera", "La Botella", "El Barril", "El Árbol",
        "El Melón", "El Valiente", "El Gorrito", "La Muerte", "La Pera",
        "La Bandera", "El Bandolón", "El Violoncello", "La Garza", "El Pájaro",
        "La Mano", "La Bota", "La Luna", "El Cotorro", "El Borracho",
        "El Negrito", "El Corazón", "La Sandía", "El Tambor", "El Camarón",
        "Las Jaras", "El Músico", "La Araña", "El Soldado", "La Estrella",
        "El Cazo", "El Mundo", "El Apache", "El Nopal", "El Alacrán",
        "La Rosa", "La Calavera", "La Campana", "El Cantarito", "El Venado",
        "El Sol", "La Corona", "La Chalupa", "El Pino", "El Pescado",
        "La Palma", "La Maceta", "El Arpa", "La Rana"
    );

    private static void CartaAleatoria() {
        Random random = new Random();
        String cartaAleatoria = CARTAS.get(random.nextInt(CARTAS.size()));
        System.out.println("Carta aleatoria: " + cartaAleatoria);
    }

    private static void CartasAleatorias() {
        Collections.shuffle(CARTAS);
        System.out.println("--------------------------------------");
        System.out.println("Cartas en orden aleatorio:");
        for (String carta : CARTAS) {
            System.out.println(carta);
        }
    }
}
