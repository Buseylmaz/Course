package course;
public class Main {
    public static void main(String[] args) {
        
        Student student=new Student();
        student.setId(1); 
        student.setFName("Buse");
        student.setLName(" Yılmaz");
        student.setMail("aaaa");
        
        Instructor ınstructor=new Instructor();
        ınstructor.setId(1);
        ınstructor.setFName("Ahmet");
        ınstructor.setLName(" Kara");
        ınstructor.setMail("bbbb");
        
        UserManager userManager=new UserManager();
        userManager.add(student);
        userManager.login(ınstructor);
        
        System.out.println(student.getMail());
        System.out.println(ınstructor.getFName() + ınstructor.getLName());
        
        
       
        
    }

    
}
