static void selection(int tamanho, int []vetor){

    for(int i = 0; i < tamanho -1; i++;){

        int minIndex = i;

        for(int j = 0; j < tamanho; j++){

            if (vetor[j] < vetor[minIndex]){
                minIndex = j;
            }
        }

        if(minIndex != i){
            
            int temp = vetor[i];

            vetor[i] = vetor[minIndex];

            vetor[minIndex] = temp;
        }
    }
}