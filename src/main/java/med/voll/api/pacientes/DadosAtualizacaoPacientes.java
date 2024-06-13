package med.voll.api.pacientes;

import jakarta.validation.Valid;
import med.voll.api.enderecos.DadosEnderecos;

public record DadosAtualizacaoPacientes(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEnderecos enderecos) {
}
