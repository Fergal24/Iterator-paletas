class PaletaAgua implements PaletaTipo {
    private boolean contieneAgua;

    public PaletaAgua(boolean contieneAgua) {
        this.contieneAgua = contieneAgua;
    }

    public void mostrarAgua() {
        System.out.println("Base de agua: " + contieneAgua);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de paleta: Agua");
        mostrarAgua();
    }
}