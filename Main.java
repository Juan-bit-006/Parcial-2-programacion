public class Main {
    public static void main(String[] args) {
 
        Dragon dragon = new Dragon("Smaug", 100, 20, "Escamas de diamante");
        Mago mago = new Mago("Gandalf", 70, 15, "Hechizos arcanos");
        Guerrero guerrero = new Guerrero("Aragorn", 85, 18, "Espada");
        

        System.out.println("=== BATALLA 1: DRAGÓN VS MAGO ===");
        simularBatalla(dragon, mago);
        
       
        dragon = new Dragon("Smaug", 100, 20, "Escamas de diamante");
        guerrero = new Guerrero("Aragorn", 85, 18, "Espada");
        
        System.out.println("\n=== BATALLA 2: DRAGÓN VS GUERRERO ===");
        simularBatalla(dragon, guerrero);
        
   
        mago = new Mago("Gandalf", 70, 15, "Hechizos arcanos");
        guerrero = new Guerrero("Aragorn", 85, 18, "Espada");
        
        System.out.println("\n=== BATALLA 3: MAGO VS GUERRERO ===");
        simularBatalla(mago, guerrero);
    }
    
    /**
     * @param criatura1 
     * @param criatura2 
     */
    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        int turno = 1;
        
        
        while (criatura1.estaViva() && criatura2.estaViva()) {
            System.out.println("\nTURNO " + turno);
            
            
            System.out.println(criatura1.getNombre() + " (Salud: " + criatura1.getSalud() + ")");
            criatura1.atacar(criatura2);
            
            if (!criatura2.estaViva()) {
                System.out.println(criatura2.getNombre() + " ha sido derrotado!");
                System.out.println(criatura1.getNombre() + " gana la batalla con " + criatura1.getSalud() + " de salud restante!");
                break;
            }
            
            
            System.out.println(criatura2.getNombre() + " (Salud: " + criatura2.getSalud() + ")");
            criatura2.atacar(criatura1);
            
            
            if (!criatura1.estaViva()) {
                System.out.println(criatura1.getNombre() + " ha sido derrotado!");
                System.out.println(criatura2.getNombre() + " gana la batalla con " + criatura2.getSalud() + " de salud restante!");
                break;
            }
            
            turno++;
        }
        
        
        System.out.println("\nResultado final de la batalla:");
        System.out.println(criatura1.getNombre() + ": " + (criatura1.estaViva() ? "Vivo (" + criatura1.getSalud() + " salud)" : "Derrotado"));
        System.out.println(criatura2.getNombre() + ": " + (criatura2.estaViva() ? "Vivo (" + criatura2.getSalud() + " salud)" : "Derrotado"));
    }
}
