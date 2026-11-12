public static int h(int chave){
    return chave % tamanho;
}
public static int r(int chave){
    return (chave + 1) % tamanho;
}

void inserir(int chave){
    int i = h(chave);
    int tentativas = 0;

    while(tabela[i] != VAZIO){
        i = r(i);
        tentativas++;

        if (tentativas == tamanho){
            return;
        }
    }

    tabela[i] = chave;
}

void buscar(int chave){
    int i = h(chave);
    ten

    while(tabela[i] != chave && tabela != VAZIO){
        i = r(i);
    }
    if (tabela[i] == VAZIO){
        return -1;
    }
    else{
        return i;
    }
}