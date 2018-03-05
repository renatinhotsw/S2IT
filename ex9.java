class ArvoreBinaria {

    private No raiz;

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
        } else {
            No novo = new No(valor);
            inserir(raiz, novo);
        }
    }

    private void inserir(No arvore, No novo) {
        if (novo.valor > arvore.valor) {
            if (arvore.direito == null) {
                arvore.direito = novo;
            } else {
                inserir(arvore.direito, novo);
            }
        } else {
            if (arvore.esquerdo == null) {
                arvore.esquerdo = novo;
            } else {
                inserir(arvore.esquerdo, novo);
            }
        }
    }

    public int soma() {
        return raiz == null ? 0 : raiz.soma();
    }

    @Override
    public String toString() {
        return raiz == null ? "*" : raiz.toString();
    }

    private static class No {

        private int valor;
        private No direito;
        private No esquerdo;

        public No(int valor) {
            this.valor = valor;
        }

        public int soma() {
            return valor
                    + (direito == null ? 0 : direito.soma())
                    + (esquerdo == null ? 0 : esquerdo.soma());
        }

        @Override
        public String toString() {
            return (esquerdo == null ? "*" : "(" + esquerdo + ")")
                    + valor
                    + (direito == null ? "*" : "(" + direito + ")");
        }
    }
}
