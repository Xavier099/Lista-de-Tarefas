package lista.listadetarefas.Tarefas.TarefasModel.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lista.listadetarefas.User.Model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "tb_tarefas")
public class TarefasModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome_tarefa")
    private String nomeTaf;

    @Column (name = "descricao")
    private String descricao;

    @Column (name = "nivel_importancia")
    private String nivelImportancia;

    @Column (name = "status")
    private boolean status;

    @OneToMany
    @JsonIgnore
    private List<UserModel> user;
}
