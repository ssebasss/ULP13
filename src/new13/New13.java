/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new13;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Seba
 */
public class New13 {

    public static void main(String[] args) {
      try{
            Class.forName("org.mariadb.jdbc.Driver");
            String URL= "jdbc:mariadb://localhost:3306/tp13_ulp";
            String USUARIO="root";
            String PASSWORD ="";
            Connection con=DriverManager.getConnection(URL,USUARIO,PASSWORD);
            
            List<Alumno> alumnos = new ArrayList<>();
            alumnos.add(new Alumno(46333465, "Aguero", "Juliana", LocalDate.of(2000, Month.MARCH, 17), true));
            alumnos.add(new Alumno(35767572, "Peñiñorey","Alan",LocalDate.of(1991,Month.MARCH,25),true));
            alumnos.add(new Alumno(12345678, "Cardona", "Mateo", LocalDate.of(1999, Month.APRIL, 5), true));
            alumnos.add(new Alumno(98765432, "Castro", "Sebastian", LocalDate.of(1998, Month.JUNE, 7), true));
            
            
           //----------------------------Aca abajo incluir la lista de materias----------//
            List<Materia> materias= new ArrayList<>();
            materias.add(new Materia("Laboratorio I", 2023, true));
            materias.add(new Materia("Eda", 2023, true));
            materias.add(new Materia("Programacion Web I", 2023, true));
            materias.add(new Materia("Matematica I", 2023, true));
           
           
           //---------------------------Aca abajo Incluir la lista de inscripciones----------------//
           
           
           
           //--------------------------Aca incluimos los INSERT-----------------//
           String sqlAlumno="INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`)"
                    + "VALUES (?,?,?,?,?)";
           
           PreparedStatement psAlumno = con.prepareStatement(sqlAlumno);
           for(Alumno alumno : alumnos){
               psAlumno.
           }
           
           
            //insert,update, delete usamos: excecuteUpdate
            int filas = ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Alumno agregado");
            }
        }catch(ClassNotFoundException cnf){
            JOptionPane.showMessageDialog(null, "Error al cargar driver");
        }catch(SQLException sql){
            System.out.println(sql.getErrorCode());
            if(sql.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(null, "Ya exite un alumno con ese DNI");
            }else if(sql.getErrorCode() ==1049){
                JOptionPane.showMessageDialog(null, "La base de datos ya existe");
            }else
            JOptionPane.showMessageDialog(null,"Error al cargar el db");
        }
    }
    
}
