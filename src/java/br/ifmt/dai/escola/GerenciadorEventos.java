/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifmt.dai.escola;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 02376421152
 */
public class GerenciadorEventos {

    public static void salvarEvento(String evento, String data) {
        try {
            SessionFactory sf = new Configuration().configure("hibernate/conexao/hibernate.cfg.xml").buildSessionFactory();
            Session s = sf.openSession();
            Transaction tx = s.beginTransaction();
            Eventos e = new Eventos();
            e.setDataEvento(data);
            e.setEvento(evento);
            s.saveOrUpdate(e);
            tx.commit();
            s.close();
            System.out.println("Evento incluido com sucesso");

        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());

        }

    }

    public List listarEventos() {
        SessionFactory sf = new Configuration().configure("hibernate/conexao/hibernate.cfg.xml").buildSessionFactory();
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        List lista = s.createQuery("from Eventos").list();
        s.getTransaction();

        return lista;
    }

    public void adicionarPesssoasEventos(int idPessoa, int idEvento) {
        SessionFactory sf = new Configuration().configure("hibernate/conexao/hibernate.cfg.xml").buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Pessoas p = (Pessoas) s.load(Pessoas.class, idPessoa);
        Eventos e = (Eventos) s.load(Eventos.class, idEvento);
        p.getEvennts().add(e);
        s.getTransaction().commit();
    }
}
