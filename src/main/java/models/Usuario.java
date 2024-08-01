package models;

public class Usuario {
    private String usuario;
    private String contrasena;

    public Usuario(){

    }

    public String getUsuario(){
        return this.usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getContrasena(){
        return this.contrasena;
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
}
