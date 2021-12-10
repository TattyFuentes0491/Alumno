/*
10. Se  conoce  de  un alumno: cédula, nombre y  tres  notas  parciales  (nota1,  nota2,  nota3).
Desarrolle  una  aplicación  en  java  que  permita  crear  5  estudiantes  e  imprimir:  cédula, nombre, nota final e 
indique con un mensaje si el alumno aprobó (nota final >= 48) o no aprobó (nota final < 48) la asignatura.
 */
package alumno;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Alumno {
    //atributos
    String cedula,nombre;
    double n1,n2,n3;

    //metodo constructor
    public Alumno() {
    }
    
    //metodos setter y getter
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    
    public double calcularNotaFinal(double nt1,double nt2,double nt3){
        //variable
        double notaF;
        notaF = (nt1+nt2+nt3)/3;
        return notaF;
    }
    
    public String alumnoAprobo(double notaFinal){
        //variable
        String aprobo;
        //validamos la nota
        if(notaFinal >= 48){
          aprobo = "Aprobo";  
        }else{
            aprobo = "No Aprobo";
        }
        return aprobo;
    }
   
    //creando archivo txt para almacenar los datos ingresados
    public void crearArchivo(JTable jtab){
        try{
           String fileRectangulo = "D:\\Documents\\NetBeansProjects\\Alumno\\src\\Alumno\\datos.txt";
           BufferedWriter bfw = new BufferedWriter(new FileWriter(fileRectangulo));
            for (int i = 0; i < jtab.getColumnCount(); i++) {
                bfw.write(jtab.getColumnName(i) + "      ");
            }
            bfw.write("\n");
            for (int i = 0; i < jtab.getRowCount(); i++) {
                for (int j = 0; j < jtab.getColumnCount(); j++) {
                    bfw.write(jtab.getValueAt(i, j).toString() + "         ");
                }
                bfw.newLine();
            }
            bfw.close();
            JOptionPane.showMessageDialog(null, "El archivo fue creado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo." + e.getMessage());
        }
    }
    
    //llenar tabla con los registros
    public void llenarTabla(String ced, String nomb, double nt1, double nt2, double nt3, JTable tabla){
        //variables
        double nota_final;
        String aprobo;
        //asignar los valores obtenidos
        setCedula(ced);
        setNombre(nomb);
        setN1(n1);
        setN2(n2);
        setN3(n3);
        nota_final = calcularNotaFinal(nt1, nt2, nt3);
        aprobo = alumnoAprobo(nota_final);
        //añadimos el registro a la tabla
        try {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object nuevaTab[] = {ced,nomb,nt1,nt2,nt3,nota_final,aprobo};
            tb.addRow(nuevaTab);
            JOptionPane.showMessageDialog(null, "Registro Añadido exitosamente"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo añadir "+e.getMessage());
        }
    }
    
    // Eliminar datos de una tabla
    public void eliminaRegistro(JTable tabla){
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        if (tabla.getSelectedRow()>=0){
            tb.removeRow(tabla.getSelectedRow());
        } 
    }
    
    //guardar datos modificados
    public void guardarDatosModificados(JTable tabla, int filaSelec, String ced, String nomb, double nt1, double nt2, double nt3){
        //variables
        double notaFin=calcularNotaFinal(nt1,nt2,nt3);
        String aprob=alumnoAprobo(notaFin);
        try {            
            tabla.setValueAt(ced, filaSelec, 0);
            tabla.setValueAt(nomb, filaSelec, 1);
            tabla.setValueAt(nt1, filaSelec, 2);
            tabla.setValueAt(nt2, filaSelec, 3);
            tabla.setValueAt(nt3, filaSelec, 4);
            tabla.setValueAt(notaFin, filaSelec, 5);
            tabla.setValueAt(aprob, filaSelec, 6);
            
            JOptionPane.showMessageDialog(null, "Registro Modificado exitosamente");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
