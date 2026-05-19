public class Programa {

    public static void main(String[] args) {

        // Pessoa Física
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Ana Vitória de Carvalho Sousa");
        pf.setDataNasc("12/07/2008");
        pf.setCpf("123.456.783-00");
        pf.setSexo('F');

        System.out.println("Pessoa Física");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Nascimento: " + pf.getDataNasc());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Sexo: " + pf.getSexo());

        System.out.println();

        // Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica();

        pj.setNome("Empresa XPTO");
        pj.setDataNasc("01/01/2010");
        pj.setCnpj("12.345.678/0001-99");

        System.out.println("Pessoa Jurídica");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Abertura: " + pj.getDataNasc());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}