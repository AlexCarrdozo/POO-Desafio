package Interface;

import java.util.ArrayList;
import java.util.List;

class ReprodutorMusical<playlist> {
    private List<String> playlist;
    private String musicaAtual;

    public ReprodutorMusical() {
        this.playlist = new ArrayList<>();
        this.musicaAtual = null;
    }

    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        if (playlist.contains(musica)) {
            musicaAtual = musica;
            System.out.println("Música selecionada: " + musicaAtual);
        } else {
            System.out.println("Música não encontrada na playlist.");
        }
    }
}

//Aparelho Telefônico
class AparelhoTelefonico {
    private boolean chamadaEmAndamento;

    public AparelhoTelefonico() {
        this.chamadaEmAndamento = false;
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}

//Navegador
class NavegadorInternet {
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página: " + pagina);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
