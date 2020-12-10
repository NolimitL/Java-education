public class Student extends Person{

   long MatrikelNummer;
   public Student(String name, int age, long MatNum) {
      super(name, age);
      this.MatrikelNummer = MatNum;
   }
}
