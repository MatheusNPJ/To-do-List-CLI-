package model;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ArquivoTarefas {

    private static final String CAMINHO = "tarefas.txt";

    public static void salvar(List<Tarefa> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO))) {
            for (Tarefa t : lista) {
                String linha = String.format(
                    "[Dia: %d | Local: %s | Título: %s | Descrição: %s | Status: %s]",
                    t.getDia(),
                    t.getLocal().isEmpty() ? "-" : t.getLocal(),
                    t.getTitulo().isEmpty() ? "-" : t.getTitulo(),
                    t.getDescricao().isEmpty() ? "-" : t.getDescricao(),
                    t.getStatus() ? "Concluído" : "Pendente"
                );
                bw.write(linha);
                bw.newLine();
            }
            System.out.println("Arquivo 'tarefas.txt' gerado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }

    // Este método permanece igual caso queira manter a leitura futura (com parsing).
    public static List<Tarefa> carregar() {
        return new ArrayList<>(); // apenas esqueleto, opcional manter legibilidade.
    }
}
