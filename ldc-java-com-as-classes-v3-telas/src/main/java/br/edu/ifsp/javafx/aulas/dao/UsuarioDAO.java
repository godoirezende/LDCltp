/*package br.edu.ifsp.javafx.aulas.dao;

import br.edu.ifsp.javafx.aulas.database.Database;
import java.util.ArrayList;
import br.edu.ifsp.javafx.aulas.model.Usuario;

public class UsuarioDAO {

    private Database db;
    private static UsuarioDAO instance;

    // O construtor privado garante que uma única instância irá existir
    private UsuarioDAO() {

    }

    // Recupera a única instância do DAO
    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    // Recupera a conexão com o Banco de Dados
    private Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    // Cria um novo Usuario
    public void create(Usuario novo) {
        Database db = getConnection();
        db.addDado(novo);
    }

    // Recupera todas as listas
    public ArrayList<Usuario> read() {
        Database db = getConnection();
        return db.recuperaDado();
    }

    public void delete(Usuario deletar) {
        // Sem implementação
    }

    public void update(Usuario toUpdate) {
        // Sem implementação
    }
}
*/
