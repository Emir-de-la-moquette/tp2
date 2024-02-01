import java.util.HashMap;
import java.util.Map;

public class Auteur{
    private String nom;
    private Map<String, Perf> perform;

private class Perf{
    private String citation;
    private int perf;

    public Perf(String cita, int performance){
        this.citation = cita;
        this.perf = performance;
    }

    public int getPerf(){
        return this.perf;
    }
    public String getCita(){
        return this.citation;
    }
}


    public Auteur(String nomA, int perftragedie, String citatragedie, int perfcomdie, String citacomedie, int perfdrame, String citadrame){
        

        perform = new HashMap<>();

        this.nom = nomA;
        this.perform.put("TRAGEDIE", new Perf(citatragedie, perftragedie));
        this.perform.put("COMDEDIE", new Perf(citacomedie, perfcomdie));
        this.perform.put("DRAME", new Perf(citadrame, perfdrame));
    }

    

    public int getQualiteTragedie(){
        return this.perform.get("TRAGEDIE").getPerf();
    }
    public String getCitationTragedie(){
        return this.perform.get("TRAGEDIE").getCita();
    }
    public int getQualiteComedie(){
        return this.perform.get("COMDEDIE").getPerf();
    }
    public String getCitationComedie(){
        return this.perform.get("COMDEDIE").getCita();
    }
    public int getQualiteDrame(){
        return this.perform.get("DRAME").getPerf();
    }
    public String getCitationDrame(){
        return this.perform.get("DRAME").getCita();
    }

}
