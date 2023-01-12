package Fax;

public class Main {


    public static void main(String[] args) {

        //nasledjivanje
        //enkapsulacija
        //apstrakcija
        //polimorfizam


       Student student = new Student("Pera", "Peric", "1234/2023");

       student.setIme("Zika");
       student.prezime = "Markovic";

       //System.out.println(student.getIme());

       student.ispisStudenta();

       Profesor profesor = new Profesor("Marko", "Markovic", "Java");

//       student.ispis();
//
//       profesor.ispis();


    }





}