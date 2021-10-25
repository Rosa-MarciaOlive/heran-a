public class Gerente{
    private String nome;
    private String cpf;
    private double salario;
    private String departamento;
    private int senha;//--como definir??

//---------1 set e 1 get para cada dado descrito.
     public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf=cpf;
    } 
    public String getCpf() {
        return this.cpf;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return this.salario;
    }

    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    public String getDepartamento(){
        return this.departamento;
    } 

    public void setSenha(int senha){
        this.senha=senha;
    }
    public int getSenha(){
        return this.senha; 
    }

//-------------------------
    public double bonificacao(){
    return this.salario*0.1;

}
}