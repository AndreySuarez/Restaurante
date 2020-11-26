package restaurante;

import javax.swing.JOptionPane;

public class Ejecutivo extends Restaurante {

    public Ejecutivo(String caldo, String sobremesaD, String arrozyhuevo, String acompañanteD, String D_especial, String principio, String carne, String sobremesaA, String postre) {
        super(caldo, sobremesaD, arrozyhuevo, acompañanteD, D_especial, principio, carne, sobremesaA, postre);
    }

    public void Desayuno() {
        JOptionPane.showMessageDialog(null, "El Desayuno Ejecutivo llevara:\n"
                + "Caldo de " + getCaldo()
                + "\n Arroz con huevos " + getArrozyhuevo()
                + "\n " + getSobremesaD() + " y " + getAcompañanteD());
    }

    public void almuerzo() {
        JOptionPane.showMessageDialog(null, "El Almuerzo Ejecutivo llevara:\n"
                + "Arroz\nPapa\n"
                + getPrincipio()
                + "\n" + getCarne()
                + "\n" + getSobremesaA());
    }
}
