package br.edu.ifsp.javafx.aulas.dao;

import br.edu.ifsp.javafx.aulas.database.Database;
import java.util.ArrayList;
import br.edu.ifsp.javafx.aulas.model.Cedula;

public class CedulaDAO {

    private Database db;
    private static CedulaDAO instance;

    // O construtor privado garante que uma única instância irá existir
    private CedulaDAO() {

    }

    // Recupera a única instância do DAO
    public static CedulaDAO getInstance() {
        if (instance == null) {
            instance = new CedulaDAO();
        }
        return instance;
    }

    // Recupera a conexão com o Banco de Dados legaakdkafjdifij
    private Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            db.initCedula();
            this.db = db;
        }
        return this.db;
    }

    // Cria um novo Cedula
    public void create(Cedula novo) {
        Database db = getConnection();
        db.addDadoCedula(novo);
    }

    // Recupera todas as listas
    public ArrayList<Cedula> read() {
        Database db = getConnection();
        return db.recuperaDadoCedula();
    }

    public void delete(Cedula deletar) {
        // Sem implementação
    }

    public void update(Cedula toUpdate) {
        // Sem implementação
    }
}
