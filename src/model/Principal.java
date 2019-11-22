package model;

import dao.*;

import java.sql.Date;
import java.sql.Time;

import javax.swing.JOptionPane;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Principal {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Felipe", "São Sebastião", "4302", true);
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.adicionar(criarFuncionario(f));
    }
    //criar cinema
    public static Cinema criarCinema(Funcionario f) {
        if (f.isMaster()) {
            String nomeCinema = JOptionPane.showInputDialog(null, "Qual o nome do novo cinema?");
            int qntdSala = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas salas o cinema " + nomeCinema + " possui?"));
            String endereco = JOptionPane.showInputDialog(null, "Quantas o endereço do novo cinema?");
            Cinema c = new Cinema(nomeCinema, qntdSala, endereco);
            return c;
        } else {
            JOptionPane.showMessageDialog(null, "Você não é o gerente!!!");
            return null;
        }
    }
    //criar sala
    public static Sala criarSala(Funcionario f) {
        if (f.isMaster()) {
            int numSala = 0;
            try {
                numSala = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da sala?"));
            } catch (java.lang.NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Foi digitado algo não númerico");
            }
            int qntdCadeira = 0;
            try {
                qntdCadeira = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de cadeiras da sala " + numSala + "?"));
            } catch (java.lang.NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Foi digitado algo não númerico");
            }
            int colunas = 0;
            try {
                colunas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de colunas da sala " + numSala + "?"));
            } catch (java.lang.NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Foi digitado algo não númerico");
            }
            int fileiras = 0;
            try {
                fileiras = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de fileiras da sala " + numSala + "?"));
            } catch (java.lang.NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Foi digitado algo não númerico");
            }
            Sala s = new Sala(numSala, qntdCadeira, colunas, fileiras);
            return s;
        } else {
            JOptionPane.showMessageDialog(null, "Você não é o gerente!!!");
            return null;
        }
    }
    //criar filme
    public static Filme criarFilme() {
        String filme = JOptionPane.showInputDialog(null, "Qual o nome do novo filme?");
        int minDuracao = 0;
        try {
            minDuracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto tempo(em minutos) dura o filme?"));
        } catch (java.lang.NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Foi digitado algo não númerico, ou um número não inteiro");
        }
        Filme f = new Filme(filme, minDuracao);
        return f;
    }
    //criar sessão
    public static Sessao criarSessao(Sala sala) {
        int numSala = sala.getNumSala();
        String filme = JOptionPane.showInputDialog(null, "Qual o nome do filme que será passado?");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço da sessão?"));
        String[] opcoes = {"Sim", "Não"};
        boolean normal = false;
        int a = JOptionPane.showOptionDialog(null, "A sessão é 3D?(", "MENU", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
        if (a == JOptionPane.NO_OPTION) {
            normal = true;
        } else if (a == JOptionPane.YES_OPTION) {
            normal = false;
        }
        Date dia = new Date(Integer.parseInt(JOptionPane.showInputDialog("Qual o ano da sessão?")), Integer.parseInt(JOptionPane.showInputDialog("Qual o mes da sessão?")), Integer.parseInt(JOptionPane.showInputDialog("Qual o dia da sessão?")));
        Time horario = new Time(Integer.parseInt(JOptionPane.showInputDialog("Que horas começa a sessão?")), Integer.parseInt(JOptionPane.showInputDialog("E quantos minutos?")), 0);
        
        int ingressoDisp = 0, coluna = 0, fileira = 0;
        int aux = JOptionPane.showOptionDialog(null, "A quantidade de ingressos será igual ao quantidade de cadeiras?", "MENU", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
        if (aux == JOptionPane.NO_OPTION) {
            int ingressoDispA = Integer.parseInt(JOptionPane.showInputDialog("Quantas ingressos estarão disponiveis?"));
            if(ingressoDispA < sala.getQntdCadeira()){
                ingressoDisp = ingressoDispA;
            }else{
                JOptionPane.showMessageDialog(null, "Não tem cadeiras suficientes");
            }
            coluna = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas estarão disponiveis?"));
            fileira = Integer.parseInt(JOptionPane.showInputDialog("Quantas fileiras estarão disponiveis?"));
            if(coluna * fileira != ingressoDisp){
                coluna = 0;
                fileira = 0;
                JOptionPane.showMessageDialog(null, "Tem cadeiras a mais ou a menos");
            }
        } else if (aux == JOptionPane.YES_OPTION) {
            ingressoDisp = sala.getQntdCadeira();
        }
        Sessao s = new Sessao(preco, normal, numSala, filme, horario, dia, ingressoDisp, coluna, fileira);
        return s;
    }
    //criar funcionário
    public static Funcionario criarFuncionario(Funcionario f) {
        if (f.isMaster()) {
            String nome = JOptionPane.showInputDialog("Qual o nome completo do funcionário?");
            String endereco = JOptionPane.showInputDialog("Qual o endereço completo do funcionário?");
            String telefone = JOptionPane.showInputDialog("Qual o telefone completo do funcionário?");
            Funcionario fcomum = new Funcionario(nome, endereco, telefone);
            return fcomum;
        } else {
            JOptionPane.showMessageDialog(null, "Você não é o gerente");
            return null;
        }
    }
    // cadastrar cliente
    public static Cliente cadastrarCliente(Funcionario F) {
        String nome = JOptionPane.showInputDialog("Qual o nome completo do cliente?");
        String cpf = JOptionPane.showInputDialog("Qual o cpf do clinte?");
        String endereco = JOptionPane.showInputDialog("Qual o endereço completo do cliente?");
        String[] opcoes = {"Sim", "Não"};
        boolean estudante = false;
        int aux = JOptionPane.showOptionDialog(null, "O cliente é estudante?", "MENU", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
        if (aux == JOptionPane.NO_OPTION) {
            estudante = false;
        } else if (aux == JOptionPane.YES_OPTION) {
            estudante = true;
        }
        Cliente c = new Cliente(nome, cpf, endereco, estudante);
        return c;
    }
    //comprar ingresso
    public static Ingresso comprarIngresso(Funcionario f, Cliente c, Sessao s) {
        int qntdIngressos = Integer.parseInt(JOptionPane.showInputDialog("Quantos ingressos serão comprados?"));
        do{
            double preco = 0.0;
            if (c.isEstudante()) {
                preco = s.getPreco() / 2;
            } else {
                preco = s.getPreco();
            }
            String tipo = "";
            if (s.isNormal()) {
                tipo = "Normal";
            } else {
                tipo = "3D";
            }
            int colunaA = Integer.parseInt(JOptionPane.showInputDialog("Qual a coluna desejada?")), coluna = 0;
            if(colunaA < s.getColuna()){
                coluna = colunaA;
            }else{
                JOptionPane.showMessageDialog(null, "Não existe essa coluna!");
            }
        
            String fileiraS = JOptionPane.showInputDialog("Qual a fileira desejada?");
            char fileiraA = fileiraS.charAt(0), fileira = ' ';
            if(fileiraA < s.getFileira()){
                fileira = fileiraA;
            }else{
                JOptionPane.showMessageDialog(null, "Não existe essa fileira!");
            }
            Date dia = s.getDia();
            String filme = s.getFilme();
            String sessao = "" + s.getIdSessao();
            GregorianCalendar gc = new GregorianCalendar();
            Time horarioCompra = new Time(gc.HOUR, gc.MINUTE, 0);
            Date diaCompra = new Date(gc.YEAR, gc.MONTH, (int) gc.DAY_OF_MONTH);

            Ingresso i = new Ingresso(preco, tipo, dia, coluna, fileira, filme, sessao, horarioCompra, diaCompra);
            qntdIngressos = qntdIngressos - 1;
            return i;
        }while(qntdIngressos!=0);
    }
    //regustrando venda
    public static Venda registrarVenda(Ingresso i, Funcionario f) {
        String horasCompra = "" + i.getHorarioCompra();
        Venda v = new Venda(f.getIdMat(), i.getPreco(), i.getTipo(), i.getDiaCompra(), i.getHorarioCompra() );
        return v;
    }
}
