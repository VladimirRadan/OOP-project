package Fax;

public class Student extends Person{

    String indexNum;

    public Student(String ime, String prezime, String indexNum) {
        super(ime, prezime);
        this.indexNum = indexNum;
    }

    public void ispisStudenta(){
        super.ispis();
        System.out.println(" Broj indexa: " + indexNum);
    }


}
