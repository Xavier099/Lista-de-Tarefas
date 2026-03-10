package lista.listadetarefas.User.Controller;

import lista.listadetarefas.User.DTO.UserDTO;
import lista.listadetarefas.User.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public ResponseEntity<String> create(@RequestBody UserDTO userDTO){
        userService.userCreate(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Usuario criado com sucesso");
    }

    public ResponseEntity<List<UserDTO>> list(){
        List<UserDTO> user = userService.listUsers();
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> findId(@PathVariable Long id){
        UserDTO userId = userService.findByid(id);
        if (userId != null){
            return ResponseEntity.ok(userId);
        }else {
            return ResponseEntity.ok("usuario nao encontrado");
        }
    }

    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO){
        UserDTO userUpdate = userService.findByid(id);
        if (userUpdate != null){
            userService.updataUser(id, userDTO);
            return ResponseEntity.ok(userUpdate);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Usuario nao encontrado");
        }
    }

}
