/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author Marcus
 */
public class Vertice<TIPO> {
     private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;
    
    public Vertice(TIPO valor){
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }
    
    public void adicionarArestaEntrada(Aresta<TIPO> aresta){
        this.arestasEntrada.add(aresta);
    }
    
    public void adicionarArestaSaida(Aresta<TIPO> aresta){
        this.arestasSaida.add(aresta);
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestasSaida() {
        return arestasSaida;
    }
    
    
}
