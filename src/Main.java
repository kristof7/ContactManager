public class Main {
    public static void main(String [] args) {


    // ------------------------------ContactsManager---------------------------------

        ContactsManager myContactsManager = new ContactsManager();

        Contact James = new Contact();
        James.name = "Chris";
        James.phoneNumber = "506333333";

        myContactsManager.addContact(James);

        Contact Marianne = new Contact();
        Marianne.name = "Marianne";
        Marianne.phoneNumber = "999443321";

        myContactsManager.addContact(Marianne);

        Contact Steve = new Contact();
        Steve.name = "Steve";
        Steve.phoneNumber = "111111111";

        myContactsManager.addContact(Steve);

        Contact Cris = new Contact();
        Cris.name = "Cris";
        Cris.phoneNumber = "507297441";

        myContactsManager.addContact(Cris);

        Contact Ola = new Contact();
        Ola.name = "Ola";
        Ola.phoneNumber = "666666666";

        myContactsManager.addContact(Ola);



        Contact result = myContactsManager.searchContact("Ola");
        System.out.println(result.phoneNumber);

    }
}