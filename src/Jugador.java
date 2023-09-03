class Jugador implements Personaje {
    @Override
    public void atacar() {
        System.out.println("El jugador ataca al enemigo Jefe");
    }

    @Override
    public void recibirDaño(int cantidad) {
        System.out.println("El jugador recibe " + cantidad + " puntos de daño totales");
    }
}
