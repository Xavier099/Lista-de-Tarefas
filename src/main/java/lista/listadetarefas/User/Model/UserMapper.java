package lista.listadetarefas.User.Model;

import lista.listadetarefas.User.DTO.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserModel map(UserDTO userDTO){
        UserModel userModel = new UserModel();
        userModel.setId(userDTO.getId());
        userModel.setNome(userDTO.getNome());
        userModel.setTelefone(userDTO.getTelefone());
        userModel.setEmail(userDTO.getEmail());
        userModel.setTarefas(userDTO.getTarefas());
        return userModel;
    }

    public UserDTO map(UserModel userModel){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userModel.getId());
        userDTO.setNome(userModel.getNome());
        userDTO.setTelefone(userModel.getTelefone());
        userDTO.setEmail(userModel.getEmail());
        userDTO.setTarefas(userModel.getTarefas());
        return userDTO;
    }
}
