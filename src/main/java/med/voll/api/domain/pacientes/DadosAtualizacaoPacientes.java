package med.voll.api.domain.pacientes;

import jakarta.validation.Valid;
import med.voll.api.domain.enderecos.DadosEnderecos;

public record DadosAtualizacaoPacientes(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEnderecos enderecos) {
}
