/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernandez
 */
package Clases;


import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Animal implements Serializable {
    private final int id;
    private String name;
    private String color;
    private String sex;
    private final LocalDate dateOfBirth;

    public Animal(int id, String name, String color, String sex, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    public Animal() {
        this.id = 0;
        this.name = null;
        this.color = null;
        this.sex = null;
        this.dateOfBirth = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Period getAge() {
        return Period.between(Objects.requireNonNull(dateOfBirth), LocalDate.now());
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Objects.requireNonNull(dateOfBirth).format(formatter);
    }
    
    public LocalDate getDOB() {
        return dateOfBirth;
    }

    public String getData() {
        return """
                Id. Animal: %s
                Nombre: %s
                Color: %s
                Edad: %s años y %s y %s
                Sexo: %s
                Fecha de nacimiento: %s
                """.formatted(getId(), getName(), getColor(), getAge().getYears(), (getAge().getMonths() != 1) ? (getAge().getMonths() + " meses") : (getAge().getMonths() + " mes"), (getAge().getDays() != 1) ? (getAge().getDays() + " días") : (getAge().getDays() + " día") , getSex(), getDateOfBirth());
    }
    public static void serialize(ArrayList<Animal> list, Animal a) {
        try {
            ObjectOutputStream output;
            if (a instanceof Mammal) {
                output = new ObjectOutputStream(new FileOutputStream("mammals.dat"));
            } else {
                output = new ObjectOutputStream(new FileOutputStream("birds.dat"));
            }
            list.add(a);
            output.writeObject(list);
            output.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró el archivo","", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error E/S","", JOptionPane.ERROR_MESSAGE);
        }
    }
}
