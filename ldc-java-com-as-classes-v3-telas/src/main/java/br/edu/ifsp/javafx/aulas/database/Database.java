package br.edu.ifsp.javafx.aulas.database;

import java.util.ArrayList;

import br.edu.ifsp.javafx.aulas.model.Cedula;
import br.edu.ifsp.javafx.aulas.model.Usuario;

// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!
// Exemplo do professor sobre BDD
//
public class Database{
  private ArrayList<Cedula> cedulas;
  private ArrayList<Usuario> usuarios;

  // É void mesmo?
  public void DatabaseCedula() {
    cedulas = new ArrayList<>();
  }

  public void initCedula() {
    cedulas.add(new Cedula("123", 10.0, "Papagaio", "123", "bandeira do Brasil", 87.75, 13.5, 6.5));
    cedulas.add(new Cedula("124", 100.0, "Carpa", "126", "figura da republica", 109.2, 15.6, 7));
    cedulas.add(new Cedula("125", 100.0, "Carpa", "126", "figura da republica", 109.2, 15.6, 7));
    // cedulas.add(new Cedula("Cad3","End3", 456));
  }

  public void addDadoCedula(Cedula novo) {
    cedulas.add(novo);
  }

  public ArrayList<Cedula> recuperaDadoCedula() {
    return cedulas;
  }

  public void deletarCedula(String idMoeda) {
    Cedula cedulaExcluir = null;
    for (Cedula cedula : cedulas) {
      if (cedula.getIdMoeda().equals(idMoeda)) {
        cedulaExcluir = cedula;
        break;
      }
    }
    if (cedulaExcluir != null) {
      cedulas.remove(cedulaExcluir);
      // Colocar na tela: Cedula removido com sucesso: " + cedulaExcluir.getValor()
    } else {
      // Colocar na tela: Cedula não encontrado com o ID: " + id
    }
  }
  // É void mesmo?
  public void DatabaseUsuario() {
    usuarios = new ArrayList<>();
  }

  public void initUsuario() {
    usuarios.add(new Usuario("001", "10.0", "user1@gmail.com", "123", "Ana", "87.75", "13.5"));
    usuarios.add(new Usuario("002", "100.0", "user2@yahoo.com", "126", "Marcos", "109.2", "15.6"));
    usuarios.add(new Usuario("003", "100.0", "user3@ig.com.br", "124", "Joab", "109.2", "15.6"));
  }

  public void addDadoUsuario(Usuario novo) {
    usuarios.add(novo);
  }

  public ArrayList<Usuario> recuperaDadoUsuario() {
    return usuarios;
  }

  public void deletarUsuario(String id) {
    Usuario usuarioExcluir = null;
    for (Usuario usuario : usuarios) {
      if (usuario.getIdUsuario().equals(id)) {
        usuarioExcluir = usuario;
        break;
      }
    }
    if (usuarioExcluir != null) {
      usuarios.remove(usuarioExcluir);
      // Colocar na tela: Usuário removido com sucesso: " + usuarioExcluir.getNomeUsuario()
    } else {
      // Colocar na tela: Usuário não encontrado com o ID: " + id
    }
  }

}
