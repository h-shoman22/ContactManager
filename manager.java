import java.util.HashMap;

public class manager {
    HashMap<String, Contacts> contact;
    
    public manager(){
        this.contact = new HashMap<>();
    }

    public void addContacts(String name, Contacts contacts){
        contact.put(name, contacts);
    }

    public void deleteContacts(String name){
        contact.remove(name);
    }

    public void getContacts(String name){
        Contacts get = contact.get(name);
        System.out.println(get);
    }

    public void displayAllContacts(){
        for(Contacts i: contact.values()){
            System.out.println(i);
        }
    }
}
