public class Gerente extends Funcionario{
    private int senha;
}
    public void setSenha(int senha) {
        this.senha = senha;
}

//------------------------Autenticação de senha
    public boolean autentificacao(int senha){
        if (this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
    }
    else{
        System.out.println("Acesso Negado!");
        return false;
        }
    }
    /* Herança-->extends~ indica que o nome da classe a 
frente será associada "herdada", aqui será uma subclasse
de Funcionario*/