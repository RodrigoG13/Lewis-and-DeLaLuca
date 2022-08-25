/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.com;
/**
 *
 * @author quiza rodrigo pero probablemente eidan
 */
public class ingrediente {
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
    
    public ingrediente(int id, String nombre, float cal, float grasas, float azucares, float proteinas, float cabohidratos, float fibra, float colesterol, int categoria) {
        createId();
        this.nombre = nombre;
        this.cal = cal;
        this.grasas = grasas;
        this.azucares = azucares;
        this.proteinas = proteinas;
        this.cabohidratos = cabohidratos;
        this.fibra = fibra;
        this.colesterol = colesterol;
        this.categoria = categoria;
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
    
    
    private void createId(){
        
    
    }

    
    
    
    
    
}
