package course;
public class UserManager {
    public void add(User user){
        System.out.println(user.getFName() + user.getLName() + " İsimli ögrenci kursa eklendi");
    }
    public void login(User user){
        System.out.println(user.getMail() + " Sisteme giriş yaptı");
    }
   
    
}
