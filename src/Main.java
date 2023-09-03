public class Main {
    public static void main(String[] args) {
        FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
        Personaje jugadorGuerrero = fabricaGuerrero.crearPersonaje();

        FabricaEnemigos fabricaEnemigoJefe = new FabricaEnemigoJefe();
        Enemigo enemigoJefe = fabricaEnemigoJefe.crearEnemigo();

        jugadorGuerrero.atacar();
        enemigoJefe.recibirDaño(50);
        enemigoJefe.atacar();
        jugadorGuerrero.recibirDaño(30);
    }
}
