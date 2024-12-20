/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package Clases;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Mammal extends Animal implements Serializable {
    private String hairType;
    private int numberOfTeeth;
    private String category;

    public Mammal(int ID, String name, String color, String sex, LocalDate birthDate, String hairType, int numberOfTeeth, String category) {
        super(ID, name, color, sex, birthDate);
        this.hairType = hairType;
        this.numberOfTeeth = numberOfTeeth;
        this.category = category;
    }
    
    public Mammal() {
        super();
        this.hairType = null;
        this.numberOfTeeth = 0;
        this.category = null;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getData() {
        return super.getData() + """
                Tipo de pelo: %s
                Cantidad de dientes: %s
                Categoría: %s
                """.formatted(getHairType(), getNumberOfTeeth(), getCategory());
    }
    static ArrayList<Animal> getAnimals(ArrayList<Animal> list) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("mammals.dat"));
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
}

