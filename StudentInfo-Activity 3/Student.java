
package activity3;


class Student {
      private String IDNumber;
      private String LastName;
      private String FirstName;
      private String AcademicProgram,track;
       String university;
       String term; 
       String colleges;
    Student(String college, String term ){
        this.colleges=college;
        this.university="University of Cordillera";
        this.term= term;
    }
    public void IdSet (String id){
        IDNumber = id;
    }
    public String getId (){
        return IDNumber;
    }
    public void Lname (String lm){
        LastName = lm;
    }
    public String getLName (){
        return LastName;
    }
    public void Fname (String fm) {
        FirstName = fm;
    }
    public String getFname (){
     return FirstName;
    }
   public void acaProg (String ap){
       AcademicProgram = ap;
   }
   public String getProgram (){
       return AcademicProgram;
   }
    public void tra (String trak){
        track = trak;
    } 
    public String getTrack (){
        return track;
    }
   public void print (){
       System.out.println("____________________________");
       System.out.println("____________________________");
       System.out.println(university);
       System.out.println(term);
       System.out.println(colleges);
       System.out.println();
       System.out.println("Personal Info");
       System.out.println();
       System.out.println("ID Number:" + getId());
       System.out.println("Name: " + getFname() + ""+ getLName());
       System.out.println("Academic: " + getProgram()+""+ getTrack());
   }
}
