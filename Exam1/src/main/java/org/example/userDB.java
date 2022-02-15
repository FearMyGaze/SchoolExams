package org.example;

public class userDB {
   public boolean changePassword(String username, String password){
       if (username.equals("admin")){
           return true;
       }
       return false;
   }
}
