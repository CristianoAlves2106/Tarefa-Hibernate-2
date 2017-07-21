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
public class Pessoas {

    private int idPessoa;
    private int idade;
    private String primeiroNome;
    private String ultimoNome;

    public Pessoas() {
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    private Set evennts = new HashSet();

    public Set getEvennts() {
        return evennts;
    }

    protected void setEvennts(Set evennts) {
        this.evennts = evennts;
    }
    private Set email = new HashSet();

    public Set getEmail() {
        return email;
    }

    public void setEmail(Set email) {
        this.email = email;
    }
    private Set participantes = new HashSet();

    protected Set getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set participantes) {
        this.participantes = participantes;
    }
    public void adicionarParaEventos(Eventos event){
        this.getEvennts().add(event);
        
        
        
    }
}
