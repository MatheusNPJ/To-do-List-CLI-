package controller;

import java.util.ArrayList;
import java.util.List;

import dto.Dto;
import model.Tarefa;
import model.ArquivoTarefas;
import view.ViewToDoList;

public class ControllerToDoList {

    public void iniciar(){
        
        List<Tarefa> calendario = ArquivoTarefas.carregar();

        if (calendario.isEmpty()) {
            for (int dia = 1; dia < 32; dia++) {
                calendario.add(new Tarefa(dia, "", "", "", false));
            }
        }

        ViewToDoList view = new ViewToDoList();
        int opcao;
        
        do {
            opcao = view.exibirMenu();

            switch (opcao) {
                case 1:
                    Dto dto = view.cadastrarTarefa();
                    if(dto.dia > 0 && dto.dia < 32) {
                        for (Tarefa diaAtual : calendario) {
                            if(dto.dia == diaAtual.getDia()) {
                                diaAtual.setTitulo(dto.titulo);
                                diaAtual.setDescricao(dto.descricao);
                                diaAtual.setLocal(dto.local);
                                view.exibirMensagem(1);
                            }
                        }
                    } else {
                        view.exibirMensagem(2);
                    }
                    break;

                case 2:
                    StringBuilder resultado = new StringBuilder();
                    for (Tarefa diaAtual : calendario) {
                        resultado.append(String.format(
                            "[Dia: %d | Local: %s | Título: %s | Descrição: %s | Status: %s]\n\n",
                            diaAtual.getDia(),
                            diaAtual.getLocal(),
                            diaAtual.getTitulo(),
                            diaAtual.getDescricao(),
                            diaAtual.getStatus() ? "Concluído" : "Pendente"
                        ));
                    }
                    view.listarTarefas(resultado);
                    break;

                case 3:
                    Dto editarDto = view.editarTarefa();
                    boolean tarefaEncontrada = false;
                    for (Tarefa diaAtual : calendario) {
                        if(editarDto.dia == diaAtual.getDia()) {
                            diaAtual.setLocal(editarDto.local);
                            diaAtual.setTitulo(editarDto.titulo);
                            diaAtual.setDescricao(editarDto.descricao);
                            tarefaEncontrada = true;
                            view.exibirMensagem(3);
                            break;
                        }
                    }
                    if(!tarefaEncontrada){
                        view.exibirMensagem(4);
                    }
                    break;

                case 4: 
                    Dto excluirDto = view.excluirTarefa();
                    boolean tarefaRemovida = false;
                    for (Tarefa diaAtual : calendario) {
                        if(excluirDto.dia == diaAtual.getDia()) {
                            calendario.remove(diaAtual);
                            tarefaRemovida = true;
                            view.exibirMensagem(5);
                            break;
                        }
                    }
                    if(!tarefaRemovida){
                        view.exibirMensagem(6);
                    }
                    break;

                case 5:
                    Dto dtoConcluir = view.marcarComoConcluida();
                    boolean tarefaConcluida = false;
                    for (Tarefa diaAtual : calendario) {
                        if(dtoConcluir.dia == diaAtual.getDia()) {
                            diaAtual.MarcarComoConcluida();
                            tarefaConcluida = true;
                            view.exibirMensagem(7);
                            break;
                        }
                    }
                    if(!tarefaConcluida){
                        view.exibirMensagem(8);
                    }
                    break;

                case 6:
                    ArquivoTarefas.salvar(calendario);
                    break;

                default:
                    break;
            }

            if (opcao == 0) {
                ArquivoTarefas.salvar(calendario);
                System.out.println("Saindo... tarefas salvas.");
            }

        } while(opcao != 0); 
    }    
}
