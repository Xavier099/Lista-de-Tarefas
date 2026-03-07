package lista.listadetarefas.User.DTO;

import lista.listadetarefas.Tarefas.TarefasModel.Model.TarefasModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private TarefasModel tarefas;

}
