package lista.listadetarefas.User.DTO;

import lista.listadetarefas.User.Model.UserModel;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserModel map(UserDTO userDTO){
        UserModel user = new UserModel();
        user.setId(userDTO.getId());
        user.setNome(userDTO.getNome());
        user.setTelefone(userDTO.getTelefone());
        user.setEmail(userDTO.getEmail());
        user.setTarefas(userDTO.getTarefas());
        return user;
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
