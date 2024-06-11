package med.voll.api.pacientes;

import med.voll.api.enderecos.DadosEnderecos;

public record DadosCadastroPacientes(String nome, String email, String telefone, String cpf, DadosEnderecos endereco) {
}
