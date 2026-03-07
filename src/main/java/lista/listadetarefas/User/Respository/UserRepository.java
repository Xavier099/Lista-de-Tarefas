package lista.listadetarefas.User.Respository;

import lista.listadetarefas.User.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
}
