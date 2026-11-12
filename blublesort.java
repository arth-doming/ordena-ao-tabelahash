static void bublesort(int tamanho, int []vetor){
    int temp = 0;

    for (int i = 0; i < tamanho; i++; ){

        for (int j = 1; j < tamanho - i; j++;){

            if(vetor[j-1] < vetor[j]){

                temp = vetor[j - 1];

                vetor[j-1] = vetor[j]
                
                vetor[j] = temp;
            }
        }
    }
}