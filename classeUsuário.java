package camilaodonto;

import javax.swing.JOptionPane;

Public class Usuario{
    private String nome;
    private int idade;
private String email;

public void indentificarusuario(){
    setNome(JOptionPane.showinputDialog(message:"Digite o seu nome"));
    setEmail(JOptionPane.showInputDialog(message:"Digite o seu email"));
    setIdade(Integer.parseInt(JOptionPane.showInputDialog(message:"Digite a sua idade; "))


    public String getnome(){
        return nome;
    }
public void setNome(String nome){
    this.nome= nome;
}
public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}
public String getEmail(){
return email;
}
public void SetEmail(String email){
    this.email = email;
}
}







}

                 

