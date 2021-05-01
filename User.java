package course;
public class User {
    //id,isim soyisim,şifre,mail(ortak)
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private String mail;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public  String getFName(){
        return  firstname ;  
    }
    public  void setFName(String firstname){
        this.firstname=firstname;
    }
    public  String getLName(){
        return  lastname ;
    }
    public  void setLName(String lastname){
        this.lastname=lastname;
    }
    public  String getPassword(){
        return  password ; 
    }
   
    public String getMail(){
        return mail ;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    
   
    
}
