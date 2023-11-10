public class Main {
    public static void main(String[] args) {
        Paleteria paleteria = new Paleteria();

        Paleta<PaletaAgua> paletaAgua = new Paleta<>("Fresa", 15.0, new PaletaAgua(true));
        Paleta<PaletaCrema> paletaCrema = new Paleta<>("Chocolate", 20.0, new PaletaCrema(true));

        paleteria.agregarPaleta(paletaAgua);
        paleteria.agregarPaleta(paletaCrema);

        paleteria.mostrarTodasLasPaletas();
        
        // Cambiar el precio de todas las paletas
        paleteria.cambiarPrecioPaletas(5.0);
        
        System.out.println("Precios actualizados:");
        paleteria.mostrarTodasLasPaletas();
    }
}