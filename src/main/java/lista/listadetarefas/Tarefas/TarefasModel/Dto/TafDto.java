package lista.listadetarefas.Tarefas.TarefasModel.Dto;

import lista.listadetarefas.User.Model.UserModel;

import java.util.List;

public class TafDto {
    private Long id;
    private String nomeTaf;
    private String descricao;
    private String nivelImpostancia;
    private boolean status;
    private List<UserModel> user;
}
