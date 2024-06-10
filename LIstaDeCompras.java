import java.util.ArrayList;
import java.util.List;


class ListaDeCompras {
    private List<String> itens;

    public ListaDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        if (itens.size() < 5) {
            itens.add(item);
            System.out.println("Item \"" + item + "\" adicionado à lista de compras.");
        } else {
            System.out.println("A lista de compras já contém 5 itens. Não é possível adicionar mais itens.");
        }
    }

    public void removerItem(String item) {
        if (itens.remove(item)) {
            System.out.println("Item \"" + item + "\" removido da lista de compras.");
        } else {
            System.out.println("Item \"" + item + "\" não encontrado na lista de compras.");
        }
    }

    public void exibirLista() {
        System.out.println("Lista de Compras:");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + ". " + itens.get(i));
        }
    }
}