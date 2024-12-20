/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package Clases;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Veterinarian implements Serializable {
    private final int ID;
    private String name;
    private String specialization;
    private String phone;
    private final LocalDate dateOfBirth;
    private final LocalDate dateOfHire;

    public Veterinarian(int ID, String name, String specialization, String phone, LocalDate dateOfBirth, LocalDate dateOfHire) {
        this.ID = ID;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
    }
    
    public Veterinarian() {
        this.ID = 0;
        this.name = null;
        this.specialization = null;
        this.phone = null;
        this.dateOfBirth = null;
        this.dateOfHire = null;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public String getData() {
        return """
                Id. Veterinario: %s
                Nombre: %s
                Especialidad: %s
                Teléfono: %s
                Fecha de nacimiento: %s
                Fecha de Contratación: %s
                """.formatted(getID(), getName(), getSpecialization(), getPhone(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yy")), getDateOfHire().format(DateTimeFormatter.ofPattern("dd/MM/yy")));
    }

    static ArrayList<Veterinarian> getVeterinarians(ArrayList<Veterinarian> list) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("veterinarians.dat"));
            list = (ArrayList) input.readObject();
            input.close();
        } catch (FileNotFoundException ignored) {
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error E/S", "", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada", "", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    public void serialize(ArrayList<Veterinarian> list) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("veterinarians.dat"));
            list.add(this);
            output.writeObject(list);
            output.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo", "", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error E/S", "", JOptionPane.ERROR_MESSAGE);
        }
    }
}
