/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package indoexplorer.indotour.view;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;
import java.sql.DriverManager;

public class Koneksi {
//Untuk koneksi ke MySQL
private String userid = "root";
private String password = "";
//silahkan digant url-nya, tapi tergantung nama databasenya
//formatnya: “jdbc:tipeDatabase://server:port/namaDatabase”
String url = "jdbc:mysql://localhost/saatnyaonline";

public Connection con;

// constructor
public Koneksi(){
getConnection();
}

public Connection getConnection(){
try {
Class.forName("com.mysql.jdbc.Driver");
}
catch (java.lang.ClassNotFoundException e){
System.err.print("Koneksi dengan Datagase gagal: ");
System.err.println(e.getException());
}

try {
con = DriverManager.getConnection(url, userid,password);
System.out.print("Nyambung");

}catch(SQLException e) {
System.err.println("ID dan Password Anda gagal " + e.getMessage());
}

return con;
}

public static void main(String[] args){
new Koneksi();
}
}
