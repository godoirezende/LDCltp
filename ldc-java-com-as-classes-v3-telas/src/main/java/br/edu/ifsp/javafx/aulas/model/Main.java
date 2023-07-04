package br.edu.ifsp.javafx.aulas.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



//  ESTOU COMENTANDO AS LINHAS DE CÓDIGO COM ERRO CAUSADO PELO CONSTRUTOR



public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Cedula> cedulas = new ArrayList<>();
    private static List<Leitura> leituras = new ArrayList<>();
    private static List<MoedaMetal> moedas = new ArrayList<>();
    private static List<Cotacao> cotacoes = new ArrayList<>();

    private static Usuario usuarioLogado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("=========== MENU ===========");
            System.out.println("1. Cadastro");
            System.out.println("2. Entrar");
            System.out.println("0. Sair");
            System.out.println("============================");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario(scanner);
                    break;
                case 2:
                    entrarUsuario(scanner);
                    if (usuarioLogado != null) {
                        menuLogado(scanner);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarUsuario(Scanner scanner) {
        // Usuario usuario = new Usuario();

        // System.out.println("=========== CADASTRO ===========");
        // System.out.print("Nome: ");
        // usuario.setNomeUsuario(scanner.nextLine());

        // System.out.print("Data de Nascimento: ");
        // usuario.setDataNasc(scanner.nextLine());

        // System.out.print("Email: ");
        // usuario.setEmail(scanner.nextLine());

        // System.out.print("Senha: ");
        // usuario.setSenha(scanner.nextLine());

        // System.out.print("Localização: ");
        // usuario.setLocalizacao(scanner.nextLine());

        // System.out.print("Deficiência: ");
        // usuario.setDeficiencia(scanner.nextLine());

        // // Gerar um ID único para o usuário (pode ser um número aleatório, por exemplo)
        // String idUsuario = "USR-" + System.currentTimeMillis();
        // usuario.setIdUsuario(idUsuario);

        // // Adicionar o usuário à lista de usuários
        // usuarios.add(usuario);

        // System.out.println("Usuário cadastrado com sucesso! Seu ID de usuário é: " + idUsuario);
        // System.out.println("===============================");
    }

    private static void entrarUsuario(Scanner scanner) {
        System.out.println("=========== ENTRAR ===========");
        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                System.out.println("Login realizado com sucesso. Bem-vindo, " + usuarioLogado.getNomeUsuario() + "!");
                System.out.println("===============================");
                return;
            }
        }

        System.out.println("Login falhou. Verifique seu email e senha e tente novamente.");
        System.out.println("===============================");
    }

    private static void menuLogado(Scanner scanner) {
        int opcao;
        do {
            System.out.println("=========== MENU LOGADO ===========");
            System.out.println("1. Adicionar Nota");
            System.out.println("2. Adicionar Moeda");
            System.out.println("3. Adicionar Cotação");
            System.out.println("4. Mostrar Histórico");
            System.out.println("0. Sair");
            System.out.println("===================================");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarNota(scanner);
                    break;
                case 2:
                    adicionarMoeda(scanner);
                    break;
                case 3:
                    adicionarCotacao(scanner);
                    break;
                case 4:
                    mostrarHistorico();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void adicionarNota(Scanner scanner) {
        System.out.println("=========== ADICIONAR NOTA ===========");
        System.out.print("Marca d'água: ");
        String marcaDAgua = scanner.nextLine();

        System.out.print("Área: ");
        double area = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Largura: ");
        double largura = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        // Cedula cedula = new Cedula();
        // cedula.setMarcaDAgua(marcaDAgua);
        // cedula.setArea(area);
        // cedula.setLargura(largura);
        // cedula.setAltura(altura);

        // cedulas.add(cedula);

        System.out.println("Nota adicionada com sucesso!");
        System.out.println("====================================");
    }

    private static void adicionarMoeda(Scanner scanner) {
        System.out.println("=========== ADICIONAR MOEDA ===========");
        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Diâmetro: ");
        double diametro = scanner.nextDouble();
        scanner.nextLine();

        // MoedaMetal moeda = new MoedaMetal();
        // moeda.setCor(cor);
        // moeda.setPeso(peso);
        // moeda.setDiametro(diametro);

        // moedas.add(moeda);

        // System.out.println("Moeda adicionada com sucesso!");
        // System.out.println("====================================");
    }

    private static void adicionarCotacao(Scanner scanner) {
        System.out.println("=========== ADICIONAR COTAÇÃO ===========");
        System.out.print("ID Moeda 1: ");
        String idMoeda1 = scanner.nextLine();

        System.out.print("ID Moeda 2: ");
        String idMoeda2 = scanner.nextLine();

        System.out.print("Dia: ");
        String dia = scanner.nextLine();

        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Cotacao cotacao = new Cotacao();
        cotacao.setIdMoeda1(idMoeda1);
        cotacao.setIdMoeda2(idMoeda2);
        cotacao.setDia(dia);
        cotacao.setValor(valor);

        cotacoes.add(cotacao);

        System.out.println("Cotação adicionada com sucesso!");
        System.out.println("====================================");
    }

    private static void mostrarHistorico() {
        System.out.println("=========== HISTÓRICO ===========");
        System.out.println("Cédulas:");
        for (Cedula cedula : cedulas) {
            System.out.println("Marca d'água: " + cedula.getMarcaDAgua());
            System.out.println("Área: " + cedula.getArea());
            System.out.println("Largura: " + cedula.getLargura());
            System.out.println("Altura: " + cedula.getAltura());
            System.out.println("---------------------");
        }

        System.out.println("Moedas:");
        for (MoedaMetal moeda : moedas) {
            System.out.println("Cor: " + moeda.getCor());
            System.out.println("Peso: " + moeda.getPeso());
            System.out.println("Diâmetro: " + moeda.getDiametro());
            System.out.println("---------------------");
        }

        System.out.println("Cotações:");
        for (Cotacao cotacao : cotacoes) {
            System.out.println("ID Moeda 1: " + cotacao.getIdMoeda1());
            System.out.println("ID Moeda 2: " + cotacao.getIdMoeda2());
            System.out.println("Dia: " + cotacao.getDia());
            System.out.println("Valor: " + cotacao.getValor());
            System.out.println("---------------------");
        }

        System.out.println("=================================");
    }
}
