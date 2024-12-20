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

public class Bird extends Animal implements Serializable {
    private String typeOfBeak;
    private boolean itFlights;
    private String size;

    public Bird(int ID, String name, String color, String sex, LocalDate birthDate, String typeOfBeak, boolean itFlights, String size) {
        super(ID, name, color, sex, birthDate);
        this.typeOfBeak = typeOfBeak;
        this.itFlights = itFlights;
        this.size = size;
    }
    
    public Bird() {
        super();
        this.typeOfBeak = null;
        this.itFlights = false;
        this.size = null;
    }

    public String getTypeOfBeak() {
        return typeOfBeak;
    }

    public void setTypeOfBeak(String typeOfBeak) {
        this.typeOfBeak = typeOfBeak;
    }

    public boolean isItFlights() {
        return itFlights;
    }

    public void setItFlights(boolean itFlights) {
        this.itFlights = itFlights;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getData() {
        return super.getData() + """
                Tipo de pico: %s
                Vuela: %s
                Categoría: %s
                """.formatted(getTypeOfBeak(), isItFlights() ? "si" : "no", getSize());
    }
    
    static ArrayList<Animal> getAnimals(ArrayList<Animal> list) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("birds.dat"));
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

