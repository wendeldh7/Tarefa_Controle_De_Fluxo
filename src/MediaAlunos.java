public class MediaAlunos {

        /**
         * Neste código, utilizamos a classe int para ler as notas inseridas pelo usuário. Em seguida, as quatro notas são somadas e divididas por 4 para calcular a média. Por fim, a média é impressa no console.
         *
         * Você pode executar esse código e testá-lo com diferentes valores de notas para obter as médias correspondentes.
         * @param args
         */
        public static void main(String[] args) {

            System.out.println("Informe as quatro notas dos alunos:");
            double nota1 = 5;
            double nota2 = 6;
            double nota3 = 7;
            double nota4 = 8;

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("A média dos alunos é: " + media);

            /**
             * Após calcular a média, utilizamos uma estrutura condicional if-else para verificar o resultado e imprimir a mensagem correspondente.
             * Se a média for maior ou igual a 7, o aluno é considerado aprovado.
             * Se a média for menor que 7 e maior ou igual a 5, o aluno está em recuperação.
             * Caso contrário, se a média for menor que 5, o aluno está reprovado.
             */

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else if (media >= 5) {
                System.out.println("Aluno em recuperação!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }
    }