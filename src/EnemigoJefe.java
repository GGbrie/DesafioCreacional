class EnemigoJefe implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("El enemigo Jefe ataca al jugador con un ataque muy poderoso");
    }

    @Override
    public void recibirDaño(int cantidad) {
        System.out.println("El enemigo Jefe recibe " + cantidad + " puntos de daño del jugador");
    }
}
