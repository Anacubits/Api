package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.Endereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long Id,
        String nome,
        String telefone,
        Endereco endereco) {
}
