package restaurante;

import javax.swing.JOptionPane;

public class Especial extends Restaurante {

    public Especial(String caldo, String sobremesaD, String arrozyhuevo, String acompañanteD, String D_especial, String principio, String carne, String sobremesaA, String postre) {
        super(caldo, sobremesaD, arrozyhuevo, acompañanteD, D_especial, principio, carne, sobremesaA, postre);
    }

    public void Desayuno() {
        JOptionPane.showMessageDialog(null, "El Desayuno Especial llevara:\n"
                +getD_especial()+
                "\n "+getSobremesaD());
    }

    public void almuerzo() {
        JOptionPane.showMessageDialog(null, "El Almuerzo Especial llevara:\n"
                + "Arroz\nPapa a la francesa\n"
                + getPrincipio()
                + "\n" + getCarne()
                + "\n" + getSobremesaA()+
                "\n"+getPostre());
    }
}
