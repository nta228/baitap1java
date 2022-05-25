package fpt.aptech.t2009m1helloworld.entity;

public class User {
    private  int id;
    private  String username;
    private  String passwordHash;
    private  int status;

    public User() {
    }

    public User(int id, String username, String passwordHash, int status) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString(){
        return "User{" + "id=" + id + ", username'" + username + '\'' + ", passwordHash=' " + passwordHash + '\''+ ", status= " + status +'}';
    }
}
