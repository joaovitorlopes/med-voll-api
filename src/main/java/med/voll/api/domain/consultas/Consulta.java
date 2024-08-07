package med.voll.api.domain.consultas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.medicos.Medico;
import med.voll.api.domain.pacientes.Paciente;

import java.time.LocalDateTime;
@Table(name = "consultas")
@Entity(name = "Consulta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    private LocalDateTime data;

    @Column(name = "motivo_cancelamento")
    @Enumerated(EnumType.STRING)
    private MotivoCancelamento motivoCancelamento;

    public Consulta(Long id, Medico medico, Paciente paciente, LocalDateTime data) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public Consulta(DadosCancelamentoConsulta dados) {
        this.id = dados.idConsulta();
        this.motivoCancelamento = dados.motivo();
    }

    public void cancelar(MotivoCancelamento motivo) {
        this.motivoCancelamento = motivo;
    }

    public Long getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public MotivoCancelamento getMotivoCancelamento() {
        return motivoCancelamento;
    }
}
