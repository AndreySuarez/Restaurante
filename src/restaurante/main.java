package restaurante;

public class main {
    public static void main (String[]args){
        Ejecutivo e1 = new Ejecutivo("Costilla","Chocolate","Pericos","Queso","","Pasta","Pollo","Jugo de mora","" );
        e1.Desayuno();
        e1.almuerzo();
        Especial e2 = new Especial("","Jugo de Naranja","","","Pancakes","Fruta","Costillitas BQ","Gaseosa","Esponjado de Maracuya");
        e2.Desayuno();
        e2.almuerzo();
    }
}
