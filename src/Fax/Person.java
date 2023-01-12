package Fax;

public class Person {

    //Modifikatori pristupa
    //public
    //protected
    //private
    //default

    private String ime;
    String prezime;


    Person(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    void ispis(){
        System.out.println("Ime: " + ime + " Prezime: " + prezime);
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }


}
