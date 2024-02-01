import java.util.HashMap;
import java.util.Map;

public class Auteur{
    private String nom;
    private Map<String, Integer> tragedie;
    private Map<String, Integer> comedie;
    private Map<String, Integer> drame;



    public Auteur(String nomA, int perftragedie, String citatragedie, int perfcomdie, String citacomedie, int perfdrame, String citadrame){
        tragedie = new HashMap<>();
        comedie = new HashMap<>();
        drame = new HashMap<>();

        this.nom = nomA;
        this.tragedie.put(citatragedie, perftragedie);
        this.comedie.put(citacomedie, perfcomdie);
        this.drame.put(citadrame, perfdrame);
    }



}
