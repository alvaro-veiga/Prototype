import org.example.Extrato;
import org.example.UsuarioBancario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioBancoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        UsuarioBancario usuarioBanco = new UsuarioBancario(123, "Zezinho", "Rua A, 1", new Extrato(2500, 1300));

        UsuarioBancario usuarioClone = usuarioBanco.clone();
        usuarioClone.setCpf(456);
        usuarioClone.setNome("Iguinho");
        usuarioClone.getExtrato().setEntrada(3000);
        usuarioClone.getExtrato().setSaida(2000);

        assertEquals("Usuario Banco{nome =Zezinho, cpf ='123', endereco='Rua A, 1', extrato =Extrato{entrada = '2500', saida =1300}'}", usuarioBanco.toString());
        assertEquals("Usuario Banco{nome =Iguinho, cpf ='456', endereco='Rua A, 1', extrato =Extrato{entrada = '3000', saida =2000}'}", usuarioClone.toString());
    }

}