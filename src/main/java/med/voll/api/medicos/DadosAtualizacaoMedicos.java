package med.voll.api.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.enderecos.DadosEnderecos;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecos enderecos) {

}
