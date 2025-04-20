/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_class;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Register_Manager {
    private static ArrayList<Register> reg = new ArrayList<>();

    public static void registerUser(String usr, String pass, String gender) {
        String hashedPass = hashPassword(pass);  // hash first  
        Register new_reg = new Register(usr, hashedPass, gender);
        reg.add(new_reg);
    }

    public static boolean isUsernameTaken(String usr) {
        for (Register r : reg) {
            if (r.getUsr().equalsIgnoreCase(usr)) {
                return true;
            }
        }
        return false;
    }

    public static Register searchUser(String usr, String pass) {
        for (Register r : reg) {
            if (r.getUsr().equals(usr) && r.getPass().equals(pass)) {
                return r;
            }
        }
        return null;
    }
    
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();

            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));  // change to hex
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Hashing algorithm not found.", e);
        }
    }
}
