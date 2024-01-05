public class Contacts {
    String name;
    String phonenumber;
    String email;

    public Contacts(String name, String phonenumber, String email){
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public String toString(){
        return name + ", " +  phonenumber + ", " + email;
    }

}
