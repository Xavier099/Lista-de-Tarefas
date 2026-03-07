package lista.listadetarefas.User.Model;

import jakarta.persistence.*;
import lista.listadetarefas.Tarefas.TarefasModel.Model.TarefasModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "tb_cadastro")
public class UserModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "telefone")
    private String telefone;

    @Column (name = "email", unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "user")
    private TarefasModel tarefas;
}
