public class Dragon extends Criatura {
    
    private String escamas;
    
    
    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }
    
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " ataca con fuego a " + objetivo.getNombre());
        int daño = fuerza * 2; // El dragon tiene un ataque más fuerte (fuerza*2)
        objetivo.defender(daño);
    }
    
    @Override
    public void defender(int daño) {
        int dañoReducido = daño / 2; 
        salud -= dañoReducido;
        System.out.println(nombre + " se defiende con sus escamas y recibe " + dañoReducido + " de daño");
        System.out.println(nombre + " tiene ahora " + salud + " de salud");
    }
    
    public String getEscamas() {
        return escamas;
    }
}