public class Guerrero extends Criatura {
    private String arma;
    
    
    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }
    
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " ataca con su " + arma + " a " + objetivo.getNombre());
        int daño = fuerza + 2; // El guerrero ataca con su espada (fuerza)
        objetivo.defender(daño);
    }
    
    @Override
    public void defender(int daño) {
       
        int dañoReducido = Math.max(1, daño - 2); 
        salud -= dañoReducido;
        System.out.println(nombre + " se defiende con su armadura y recibe " + dañoReducido + " de daño");
        System.out.println(nombre + " tiene ahora " + salud + " de salud");
    }
    
    public String getArma() {
        return arma;
    }
}