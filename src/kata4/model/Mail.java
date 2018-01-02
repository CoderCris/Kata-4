package kata4.model;

public class Mail {
    
    private final String mail;
    
    public Mail(String newMail){
        mail = newMail;
    }
    
    public String getMail(){
        return mail;
    }
    public String getDomain(){
        return mail.split("@")[1];
    }
    
}
