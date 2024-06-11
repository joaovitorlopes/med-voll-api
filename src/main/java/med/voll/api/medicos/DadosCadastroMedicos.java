package med.voll.api.medicos;

import med.voll.api.enderecos.DadosEnderecos;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, DadosEnderecos endereco) {
}
