package lista.listadetarefas.User.Service;

import lista.listadetarefas.User.DTO.UserDTO;
import lista.listadetarefas.User.DTO.UserMapper;
import lista.listadetarefas.User.Model.UserModel;
import lista.listadetarefas.User.Respository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    public UserRepository userRepository;
    public UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDTO> listUsers(){
        return userRepository.findAll()
                .stream()
                .map(userMapper::map)
                .collect(Collectors.toList());
    }

    public UserDTO findByid(Long id){
        Optional<UserModel> user = userRepository.findById(id);
        return user.map(userMapper::map).orElse(null);
    }

    public UserDTO userCreate(UserDTO userDTO){
        UserModel user = userMapper.map(userDTO);
        user = userRepository.save(user);
        return userMapper.map(user);
    }

    public UserDTO updataUser(Long id, UserDTO userDTO){
        UserModel user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));

        if (userDTO.getNome() != null) user.setNome(userDTO.getNome());
        if (userDTO.getTelefone() != null) user.setTelefone(userDTO.getTelefone());
        if (userDTO.getEmail() != null) user.setEmail(userDTO.getEmail());
        if (userDTO.getTarefas() != null) user.setTarefas(userDTO.getTarefas());

        UserModel saved = userRepository.save(user);
        return new UserDTO(saved);
    }

    public void deletar(Long id){
        userRepository.deleteById(id);
    }
}
