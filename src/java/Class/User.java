/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ramir
 */
public class User {
          String password;
          String user;
          
          public User(String user, String password){
                    this.user = user;
                    this.password = password;
          }
          
          public String getUser() {
                    return user;
          }

          public void setUser(String user) {
                    this.user = user;
          }
          
          public String getPassword() {
                    return password;
          }

          public void setPassword(String password) {
                    this.password = password;
          }

          
}
