public class Mago extends Criatura {

    private String hechizos;
    
    
    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }
    
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " ataca con hechizos a " + objetivo.getNombre());
        int daño = fuerza + 1; // El mago ataca con hechizos(fuerza)
        objetivo.defender(daño);
    }
    
    @Override
    public void defender(int daño) {
        
        int dañoReducido = (int)(daño * 0.7);
        salud -= dañoReducido;
        System.out.println(nombre + " se defiende con un escudo mágico y recibe " + dañoReducido + " de daño");
        System.out.println(nombre + " tiene ahora " + salud + " de salud");
    }
    
    public String getHechizos() {
        return hechizos;
    }
}