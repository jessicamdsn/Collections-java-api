package Set.pesquisa;

import java.util.Objects;

public class Tarefa {

    private String tarefaDescricao;
    private boolean tarefaConcluida;

    public Tarefa(String tarefaDescricao, boolean tarefaConcluida) {
        this.tarefaDescricao = tarefaDescricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getTarefaDescricao() {
        return tarefaDescricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(tarefaDescricao, tarefa.tarefaDescricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tarefaDescricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "tarefaDescricao='" + tarefaDescricao + '\'' +
                ", tarefaConcluida=" + tarefaConcluida +
                '}';
    }
}
