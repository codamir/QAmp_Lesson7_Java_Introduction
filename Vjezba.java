public class Vjezba {
    public static void main(String[] args) {
        String someText = 13; // ne može se dodijeliti broj

        String someAnotherText = "13" // ako stavimo broj pod navodnike, nece biti sabran, jer se smatra tekstom
        System.out.println(someAnotherText+someAnotherText); // isprintat ce 1313, a ne zbir 26 (kao sto bi bio
                                                             // slucaj sa int varijablom)

        int someNumber = Hello world; // ne može se dodijeliti tekst
        double someAnotherNumber = Hello people; // ne može se dodijeliti tekst
        float someRandomNumber = Hello folks; // ne može se dodijeliti tekst
        boolean someBoolean = 155; // ne može se dodijeliti broj
        boolean someRandomBoolean = nottrue; // ne može se dodijeliti bilo koji tekst osim true ili false

        int someDoubleNumber = 13.1; // ne može se dodijeliti broj sa decimalama
        double someWholeNumber = 13; // može se dodijeliti cijeli broj
        float someRandomWholeNumber = 13; // može se dodijeliti cijeli broj

        String nameSurname = "Damir Covic";
        System.out.println(nameSurname);

        String firstLetterName = "D";
        System.out.println(firstLetterName);

        int yearOfBirth = 1985;
        System.out.println(yearOfBirth);

        long randomLongNumber = 100000000000L;
        double randomDoubleNumber = 42.001;

        char letterD = '\u24B9';
        char letterA = '\u24B6';
        char letterM = '\u24C2';
        char letterI = '\u24BE';
        char letterR = '\u24C7';

        System.out.print(letterD);
        System.out.print(letterA);
        System.out.print(letterM);
        System.out.print(letterI);
        System.out.print(letterR);

        System.out.println(letterD+""+letterA+""+letterM+""+letterI+""+letterR);


    }

}
