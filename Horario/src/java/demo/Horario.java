/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;
/**
 *
 * @author amanda
 */
public class Horario {
     /**
     * Atributo para armazenar um horário
     */
    private int hora;
    private int minutos;
    private int segundos;
   
    //Construtor
    public Horario(int hora, int minutos, int segundos){
        this.hora = hora; this.segundos = segundos; this.minutos = minutos;
    }
    
    //Métodos de retorno da hora formatada
    public String getHorario(){
        return hora+":"+minutos+":"+segundos;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
