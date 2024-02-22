public class Eployee extends  Person{
    private  String titre_post ;

    @Override
    public String getLastname(){
        return getLastname() +titre_post ;
    }

    public void setTitre_post(String titre_post){
        this.titre_post=titre_post;
    }


    @Override
    public String toString(){
        return  getLastname() + getFirstname() ;
    }


}
