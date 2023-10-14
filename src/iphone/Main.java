package iphone;

import iphone.entity.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.ligar("1191825491");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.selecionarMusica();
        iphone.tocar("Fear of the Dark");
        iphone.pausar();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }
}
