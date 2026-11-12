void inserir(int chave){
    int i = h(chave);

    if(tabela[i].chave == VAZIO){
        tabela.[i].chave == chave;
        tabela.[i].prox == null;
        return;
    }

    No novo = No();
    novo.chave = chave;
    No ant = null;
    No atual = tabela[i].prox;

    while(atual != null && atual.chave < chave){
        ant = atual;
        atual = atual.prox;
    }
    novo.prox = atual;

    novo.prox = atual;

    if (ant == null) {
        tabela[i].prox = novo;
    }
    else{
        ant.prox = novo;
    }
}