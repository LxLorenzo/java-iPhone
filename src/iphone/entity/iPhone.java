package iphone.entity;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
