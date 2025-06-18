package view;

import java.util.Scanner;

import dto.Dto;


public class ViewToDoList {

    int op = 0; //Variável para capturar a ação do usuário
    Scanner scanner = new Scanner(System.in);


    public int exibirMenu(){

        System.out.println("Planeje sua semana!");
        System.out.println("");
        System.out.println("===MENU===");
        System.out.println("");
        System.out.println("1 - Cadastre uma tarefa");
        System.out.println("2 - Listar as tarefas da semana");
        System.out.println("3 - Editar tarefa");
        System.out.println("4 - Excluir tarefa");
        System.out.println("5 - Marcar tarefa como concluída");
        System.out.println("6 - Gerar Tarefas");
        System.out.println("");
        System.out.println("0 - Sair");

        op = scanner.nextInt(); //Captar a ação desejada
        scanner.nextLine();

        return op;
    }

    public Dto cadastrarTarefa(){

        Dto dto = new Dto();

        System.out.println("Qual o dia que deseja salvar a tarefa? ");
        dto.dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o local da sua tarefa? Home/Out");
        dto.local = scanner.nextLine();

        System.out.println("Qual o título da sua tarefa? ");
        dto.titulo = scanner.nextLine();

        System.out.println("Qual a descrição da sua tarefa: ");
        dto.descricao = scanner.nextLine();

        return dto;
    }

    public void listarTarefas(StringBuilder resultado){

        if(resultado.length() > 0){
            System.out.println("===TAREFAS===");
            System.out.println(resultado.toString());
        }else{
            System.out.println("Nenhuma tarefa cadastrada.");
        } 
    }

    public Dto editarTarefa(){

        Dto dto = new Dto();

        System.out.println("Qual o dia da tarefa que deseja editar? ");
        dto.dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o novo local da sua tarefa? Home/Out");
        dto.local = scanner.nextLine();

        System.out.println("Qual o novo título da sua tarefa? ");
        dto.titulo = scanner.nextLine();

        System.out.println("Qual a nova descrição da sua tarefa: ");
        dto.descricao = scanner.nextLine();

        return dto;
    }

    public Dto excluirTarefa(){

        Dto dto = new Dto();

        System.out.println("Qual o dia da tarefa que deseja excluir? ");
        dto.dia = scanner.nextInt();
        scanner.nextLine();

        return dto;
    }

    public Dto marcarComoConcluida(){

        Dto dto = new Dto();

        System.out.println("Qual o dia da tarefa que deseja marcar como concluída? ");
        dto.dia = scanner.nextInt();
        scanner.nextLine();

        return dto;
    }

    public void exibirMensagem(int cod){

        switch (cod) {
            case 1:
                System.out.println("Tarefa salva com sucesso!");
                break;
            
            case 2:
                System.out.println("A tarefa não foi salva");   
                break;

            case 3:
                System.out.println("Tarefa editada com sucesso!");
                break;

            case 4:
                System.out.println("Tarefa não encontrada!");
                break;

            case 5:
                System.out.println("Tarefa excluida com sucesso!");
                break;

            case 6:
                System.out.println("Tarefa não encontrada para exclusão!");
                break;

            case 7:
                System.out.println("Tarefa marcada como concluída com sucesso!");
                break;

            case 8:
                System.out.println("Tarefa não encontrada para conclusão!");
                break;

            default:
                System.out.println("");
        }

    }

  

}
