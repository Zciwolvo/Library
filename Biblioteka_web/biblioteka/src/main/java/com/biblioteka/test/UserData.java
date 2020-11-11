package com.biblioteka.test;

import java.io.Serializable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;



@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
   private static final long serialVersionUID = 1L;

   public List<Czytelnik> getCzytelnicy() {
      ResultSet rs;
      Connection conn = getConnection();
      String stm = "SELECT * FROM czytelnicy";
      List<Czytelnik> records = new ArrayList<Czytelnik>();

      try {
         PreparedStatement pst = conn.prepareStatement(stm);
         pst.execute();
         rs = pst.getResultSet();

         while(rs.next()) {

            Czytelnik czt = new Czytelnik();
            czt.setId(rs.getInt(1));
            czt.setImie(rs.getString(2));
            czt.setNazwisko(rs.getString(3));
            czt.setPesel(rs.getString(4));
            czt.setData_urodzenia(rs.getString(5));
            records.add(czt);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return records;
   }
   public List<Ksiazka> getKsiazki() {
      ResultSet rs;
      Connection conn = getConnection();
      String stm = "SELECT * FROM ksiazki";
      List<Ksiazka> records = new ArrayList<Ksiazka>();

      try {
         PreparedStatement pst = conn.prepareStatement(stm);
         pst.execute();
         rs = pst.getResultSet();

         while(rs.next()) {

            Ksiazka ks = new Ksiazka();
            ks.setId(rs.getInt(1));
            ks.setNazwa(rs.getString(2));
            ks.setOpis(rs.getString(3));
            ks.setAutor(rs.getString(4));
            ks.setWydawnictwo(rs.getString(5));
            ks.setData_wydania(rs.getString(6));
            ks.setDostepnosc(rs.getString(7));
            records.add(ks);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return records;
   }
   public List<Wypozyczenie> getWypozyczenia() {
      ResultSet rs;
      Connection conn = getConnection();
      String stm = "SELECT * FROM wypozyczenia";
      List<Wypozyczenie> records = new ArrayList<Wypozyczenie>();

      try {
         PreparedStatement pst = conn.prepareStatement(stm);
         pst.execute();
         rs = pst.getResultSet();

         while(rs.next()) {

            Wypozyczenie wyp = new Wypozyczenie();
            wyp.setId(rs.getInt(1));
            wyp.setId_ksiazki(rs.getInt(2));
            wyp.setId_czytelnika(rs.getInt(3));
            wyp.setData_wypozyczenia(rs.getString(4));
            wyp.setZwrot_przewidywany(rs.getString(5));
            wyp.setZwrot_rzeczywisty(rs.getString(6));
            records.add(wyp);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return records;
   }
   public Connection getConnection() {
      String url = "jdbc:postgresql://localhost:5432/biblioteka";
      String user = "postgres";
      String password = "postgres";
      Connection conn = null;

      try {
         conn = DriverManager.getConnection(url, user, password);
         System.out.println("Polaczenie zakonczone sukcesem.");
      } catch (SQLException ex) {
         System.out.println(ex.getMessage());
      }

      finally {
      }
      return conn;
   }

}