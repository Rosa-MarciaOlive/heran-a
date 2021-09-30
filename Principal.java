public class Principal{
    public static void main (String []args){
        Funcionario f=new Funcionario();
        f.setNome("Rosa Márcia");
        f.setSalario(10000);
        f.setCpf("111111111");
        f.setDepartamento("Vendas");
        
        System.out.println("Nome do funcionario :"+f.getNome());
        System.out.println("Valor do salario mensal é R$ "+ f.getSalario());
        System.out.println("Portador do CPF n° :"+f.getCpf());
        System.out.println("Departamento:"+f.getDepartamento());
    }
}