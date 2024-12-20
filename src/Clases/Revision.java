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

public class Revision implements Serializable {
    private int ID_Revision;
    private int ID_Animal;
    private int ID_Veterinarian;
    private LocalDate revisionDate;
    private String remarks;
    private String animalType;

    public Revision(int ID_Revision, int ID_Animal, int ID_Veterinarian, LocalDate revisionDate, String remarks) {
        this.ID_Revision = ID_Revision;
        this.ID_Animal = ID_Animal;
        this.ID_Veterinarian = ID_Veterinarian;
        this.revisionDate = revisionDate;
        this.remarks = remarks;
    }
    public Revision() {
        this.ID_Revision = 0;
        this.ID_Animal = 0;
        this.ID_Veterinarian = 0;
        this.revisionDate = null;
        this.remarks = null;
    }

    public int getID_Revision() {
        return ID_Revision;
    }

    public int getID_Animal() {
        return ID_Animal;
    }

    public int getID_Veterinarian() {
        return ID_Veterinarian;
    }

    public LocalDate getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(LocalDate revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getData() {

        ArrayList<Veterinarian> veterinarianList = new ArrayList<>();
        veterinarianList = Veterinarian.getVeterinarians(veterinarianList);
        ArrayList<Animal> animals = new ArrayList<>();


        Animal tmp = this.animalType.equals("mammal") ? new Mammal() : new Bird();
        if (this.animalType.equals("mammal")) {
            animals = Mammal.getAnimals(animals);
            for (Animal i :
                    animals) {
                if (i.getId() == ID_Animal)
                    tmp = i;
            }
        } else {
            animals = Bird.getAnimals(animals);
            for (Animal i :
                    animals) {
                if (i.getId() == ID_Animal)
                    tmp = i;
            }
        }

        Veterinarian tmp2 = null;
        for (Veterinarian i :
                veterinarianList) {
            if (i.getID() == ID_Veterinarian)
                tmp2 = i;
        }

        assert tmp2 != null;
        return """
                    DETALLES DE UNA REVISIÓN
                ANIMAL
                    %s
                VETERINARIO
                    %s
                Fecha de Revisión: %s
                Observaciones: %s
                """.formatted(tmp.getData(), tmp2.getData(), getRevisionDate().format(DateTimeFormatter.ofPattern("dd/MM/yy")), getRemarks());
    }

    static ArrayList<Revision> getRevisions(ArrayList<Revision> list) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("revisions.dat"));
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

    public void serialize(ArrayList<Revision> list) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("revisions.dat"));
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
