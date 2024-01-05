public class contactManagerDemo {
    public static void main(String[] args) {
        manager cmd = new manager();

        Contacts contact1 = new Contacts("Hakeem",  "07432404126", "Hakeemsta@hotmail.co.uk");
        Contacts contact2 = new Contacts("Farnaz", "07568328762", "Farnazissupposedlyill@liar.com");
        Contacts contact3 = new Contacts("Adnan", "078889347629", "Adnanisanicefriend@outlook.com");

        cmd.addContacts("Hakeem", contact1);
        cmd.addContacts("Farnaz", contact2);
        cmd.addContacts("Adnan", contact3);

        cmd.displayAllContacts();

        cmd.getContacts("Hakeem");

        cmd.deleteContacts("Adnan");

        cmd.displayAllContacts();
    }
}
