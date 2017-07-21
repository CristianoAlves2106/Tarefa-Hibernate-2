/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifmt.dai.escola;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 02376421152
 */
public class Eventos {

    private int idEventos;
    private String evento;
    private String dataEvento;

    public Eventos() {
    }

    public int getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(int idEventos) {
        this.idEventos = idEventos;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Set events = new HashSet();

    public Set getEvents() {
        return events;
    }

    public void setEvents(Set events) {
        this.events = events;
    }

}
