package cadastroclientes;


import java.util.ArrayList;

public class BancoInfo {

    ArrayList<LayoutCadastroClientes> itensBanco = new ArrayList<>();

    //Inserir Itens no Array
    public void inserirItemArray(LayoutCadastroClientes novoItem) {
        itensBanco.add(novoItem);
        System.out.println("Item inserido com sucesso!");
    }

    //Excluir itens do Array
    public void excluirItemArray(int index) {
        itensBanco.remove(index);
        System.out.println("Item removido com sucesso!");
    }

    //Listar Itens Array
    public void listarItens() {
        for (int i = 0; i < itensBanco.size(); i++) {
            System.out.println("Marca: " + itensBanco.get(i).getMarca()
                    + " Modelo: " + itensBanco.get(i).getModelo()
                    + " Ano: " + itensBanco.get(i).getAno()
                    + " Combustivel: " + itensBanco.get(i).getCombustivel());
        }
    }

    //Apagar todos itens
    public void apagarTodosItensArray() {
        itensBanco.clear();
        System.out.println("Array apagado com sucesso!");
    }

    //Gravar itens em arquivos externos
    public void gravarDados() {
        PersistenciaDadosCSV gravarItens = new PersistenciaDadosCSV();
        gravarItens.gravarDadosArquivo(itensBanco);
    }

    //Carregar itens de arquivos externos
    public void carregarDados() {

        try {
            itensBanco.clear();
            PersistenciaDadosCSV carregarDados = new PersistenciaDadosCSV();
            itensBanco = carregarDados.carregaDados();
            System.out.println("Itens carregados no array com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao carregar dados do arquivo txt!");
            e.printStackTrace();
        }

    }
}