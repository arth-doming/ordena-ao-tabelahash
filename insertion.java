void inserir(int tamanho, int []vetor){

    int chave, j;

    for (int i = 1; i < tamanho;i++;){
        chave = vetor[i];

        j = i - 1;

        while(j >= 0; && vetor[j] > chave){
            vetor[j + 1] = vetor[j];
            j = j - 1;
        }

        vetor[j - 1] = chave;
    }
}