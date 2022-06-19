public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirPolicialMilitar(PolicialMilitar policialMilitar) {
        return "PolicialMilitar{" +
                "cpf='" + policialMilitar.getCpf() + '\'' +
                ", nome='" + policialMilitar.getNome() + '\'' +
                ", patente='" + policialMilitar.getPatente() + '\'' +
                '}';
    }

    @Override
    public String exibirPolicialCivil (PolicialCivil policialCivil) {
        return "PolicialCivil{" +
                "cpf='" + policialCivil.getCpf()  + '\'' +
                ", nome='" + policialCivil.getNome() + '\'' +
                ", patente='" + policialCivil.getPatente() + '\'' +
                '}';
    }

    @Override
    public String exibirPolicialFederal(PolicialFederal policialFederal) {
        return "PolicialFederal{" +
                "cpf='" + policialFederal.getCpf() + '\'' +
                ", nome='" + policialFederal.getNome() + '\'' +
                ", patente='" + policialFederal.getPatente() + '\'' +
                '}';
    }
}
