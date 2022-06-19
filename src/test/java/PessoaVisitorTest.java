import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirPolicialMilitar() {
        PolicialMilitar policialMilitar = new PolicialMilitar("02217645890", "Henrique", "Terceiro Sargento");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("PolicialMilitar{cpf='02217645890', nome='Henrique', patente='Terceiro Sargento'}", visitor.exibir(policialMilitar));
    }

    @Test
    void deveExibirPolicialCivil() {
        PolicialCivil policialCivil = new PolicialCivil("15717645878", "Juliana", "Capitão");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("PolicialCivil{cpf='15717645878', nome='Juliana', patente='Capitão'}", visitor.exibir(policialCivil));
    }

    @Test
    void deveExibirPolicialFederal() {
        PolicialFederal policialFederal = new PolicialFederal("55617645741", "Paulo", "Major");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("PolicialFederal{cpf='55617645741', nome='Paulo', patente='Major'}", visitor.exibir(policialFederal));
    }
}