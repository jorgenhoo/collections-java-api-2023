package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra (String palavra){
        if (!dicionarioMap.isEmpty())
            this.dicionarioMap.remove(palavra);
    }

    public void exibirPalavras (){
        System.out.println(this.dicionarioMap);
    }

    public String pesquisarPorPalavra (String palavra) {
        String definicaoPorPalavra = null;
        if (!this.dicionarioMap.isEmpty()) {
            if (this.dicionarioMap.containsKey(palavra)) {
                definicaoPorPalavra = this.dicionarioMap.get(palavra);
                return definicaoPorPalavra;
            } else {
                return "Não encotramos a definição dessa palavra no nosso banco de dados... Tente outra palavra";
            }
        }
        return "Base de dados vazia";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        Scanner input = new Scanner(System.in);
        String palavra;

        dicionario.adicionarPalavra("convênio", "contrato entre duas entidades");
        dicionario.adicionarPalavra("resiliência", "capacidade de se recobrar facilmente ou se adaptar à má sorte ou às mudanças.");

        System.out.println("Olá, este é um dicionario!");
        System.out.print("Digite a Palavra que você deseja saber o significado: ");
        palavra = input.nextLine();
        System.out.println(dicionario.pesquisarPorPalavra(palavra));

    }
}
