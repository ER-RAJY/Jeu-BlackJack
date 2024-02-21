
    public enum Types {
        Carreau("carreau"),
        Cœur("Cœur"),
        Pique("pique"),
        Trèfle("trèfle");

        private  final String  nom;


        private Types(String nom){
            this.nom=nom;
        }
        public String getNom(){
            return nom;
        }

    }


