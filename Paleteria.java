import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Paleteria {
    private List<Paleta<?>> paletas;

    public Paleteria() {
        paletas = new ArrayList<>();
    }

    public void agregarPaleta(Paleta<?> paleta) {
        paletas.add(paleta);
    }

    public void mostrarTodasLasPaletas() {
        ListIterator<Paleta<?>> iterator = paletas.listIterator();
        while (iterator.hasNext()) {
            Paleta<?> paleta = iterator.next();
            paleta.mostrarInformacion();
            System.out.println(); // Separador entre paletas
        }
    }

    public void cambiarPrecioPaletas(double cambio) {
        ListIterator<Paleta<?>> iterator = paletas.listIterator();
        while (iterator.hasNext()) {
            Paleta<?> paleta = iterator.next();
            paleta.cambiarPrecio(cambio);
        }
    }
}