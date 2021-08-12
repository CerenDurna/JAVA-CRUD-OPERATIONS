/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author support
 */
public class admins {
    private int admin_id;
    private String admin_nick;
    private String admin_password;
    private String admin_fname;
    private String admin_lname;

    public admins(int admin_id, String admin_nick, String admin_password, String admin_fname, String admin_lname) {
        this.admin_id = admin_id;
        this.admin_nick = admin_nick;
        this.admin_password = admin_password;
        this.admin_fname = admin_fname;
        this.admin_lname = admin_lname;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_nick() {
        return admin_nick;
    }

    public void setAdmin_nick(String admin_nick) {
        this.admin_nick = admin_nick;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_fname() {
        return admin_fname;
    }

    public void setAdmin_fname(String admin_fname) {
        this.admin_fname = admin_fname;
    }

    public String getAdmin_lname() {
        return admin_lname;
    }

    public void setAdmin_lname(String admin_lname) {
        this.admin_lname = admin_lname;
    }

    
    
    
}
