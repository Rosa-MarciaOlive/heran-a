public class Principal{
    public static void main (String []args){

        Funcionario f=new Funcionario();       
        f.setNome("Rosa Márcia");
        f.setSalario(10000);
        f.setCpf("111111111");
        f.setDepartamento("Vendas");
        
        System.out.println("Nome do(a) funcionario : "+f.getNome());
        System.out.println("Valor do salario mensal é R$ "+ f.getSalario());
        System.out.println("Portador do CPF n°: "+f.getCpf());
        System.out.println("Pertence ao departamento de: "+f.getDepartamento());
   //-----------------------
        Gerente gerente = new Gerente();
        gerente.setNome("Emanuelle");
        gerente.setCpf("222222222");
        gerente.setDepartamento("Financeiro");
        gerente.setSalario(5000);
        gerente.setSenha(123);

        System.out.println("Nome do(a) funcionario : "+gerente.getNome());
        System.out.println("Salario mensal de R$ "+gerente.getSalario());
        System.out.println("Portador do CPF n°: "+gerente.getCpf());
        System.out.println("Pertence ao departamento do: "+gerente.getDepartamento());


   


    }
}