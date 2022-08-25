/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.com;

import java.util.ArrayList;

/**
 *
 * @author quiza rodrigo pero probablemente eidan
 */
public class recetas {

    ArrayList<ingrediente> ingredientes = new ArrayList<>();
    int id;
    String nombre;
    float cal;
    float grasas;
    float azucares;
    float proteinas;
    float cabohidratos;
    float fibra;
    float colesterol;
    int categoria;
    time tiempo;

    public recetas(ArrayList<ingrediente> ingredientes) {
        crearId();
        this.ingredientes = ingredientes;
    }
    
    
    
    public ArrayList<ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCal() {
        return cal;
    }

    public void setCal(float cal) {
        this.cal = cal;
    }

    public float getGrasas() {
        return grasas;
    }

    public void setGrasas(float grasas) {
        this.grasas = grasas;
    }

    public float getAzucares() {
        return azucares;
    }

    public void setAzucares(float azucares) {
        this.azucares = azucares;
    }

    public float getProteinas() {
        return proteinas;
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public float getCabohidratos() {
        return cabohidratos;
    }

    public void setCabohidratos(float cabohidratos) {
        this.cabohidratos = cabohidratos;
    }

    public float getFibra() {
        return fibra;
    }

    public void setFibra(float fibra) {
        this.fibra = fibra;
    }

    public float getColesterol() {
        return colesterol;
    }

    public void setColesterol(float colesterol) {
        this.colesterol = colesterol;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public time getTiempo() {
        return tiempo;
    }

    public void setTiempo(time tiempo) {
        this.tiempo = tiempo;
    }
    
    private void crearId(){
    
    }
    
    
    
}
