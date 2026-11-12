//a)

public static int r(int chave){
    return (chave + 1) % 5;
}

//b)
public static int h(int chave){
    return chave % 5;
}

void insere(int chave){
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
//o hash é o resto da divisão da chave com o tamanho, ao inserir ele verifica se a posição do hash esta vazia, se n estiver ele faz o rehash que vai para a proxima posição, ate encontrar uma posição vazia. caso esteja cheia ela returno

/*  
questao 2:
v
v
f
v
v
v

questao 3
v
v
f
v
f