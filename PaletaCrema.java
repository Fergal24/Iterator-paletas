class PaletaCrema implements PaletaTipo {
    private boolean contieneCrema;

    public PaletaCrema(boolean contieneCrema) {
        this.contieneCrema = contieneCrema;
    }

    public void mostrarCrema() {
        System.out.println("Contiene crema: " + contieneCrema);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de paleta: Crema");
        mostrarCrema();
    }
}