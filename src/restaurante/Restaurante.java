package restaurante;

public class Restaurante {

    private String caldo;
    private String sobremesaD;
    private String arrozyhuevo;
    private String acompañanteD;
    private String D_especial;
    private String principio;
    private String carne;
    private String sobremesaA;
    private String postre;

    public Restaurante(String caldo, String sobremesaD, String arrozyhuevo, String acompañanteD, String D_especial, String principio, String carne, String sobremesaA, String postre) {
        this.caldo = caldo;
        this.sobremesaD = sobremesaD;
        this.arrozyhuevo = arrozyhuevo;
        this.acompañanteD = acompañanteD;
        this.D_especial = D_especial;
        this.principio = principio;
        this.carne = carne;
        this.sobremesaA = sobremesaA;
        this.postre = postre;
    }

    public String getCaldo() {
        return caldo;
    }

    public String getSobremesaD() {
        return sobremesaD;
    }

    public String getArrozyhuevo() {
        return arrozyhuevo;
    }

    public String getAcompañanteD() {
        return acompañanteD;
    }

    public String getD_especial() {
        return D_especial;
    }

    public String getPrincipio() {
        return principio;
    }

    public String getCarne() {
        return carne;
    }

    public String getSobremesaA() {
        return sobremesaA;
    }
    
    public String getPostre(){
        return postre;
    }

}
