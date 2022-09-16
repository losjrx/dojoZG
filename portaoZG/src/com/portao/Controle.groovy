package com.portao

class Controle {

    static String execute(String input){

        // Instanciando objeto da classe Portao
        Portao portao = new Portao()

        // Array onde serão inseridas as saídas para cada caractere de entrada
        def saida = []

        //Caminha pela string, dando cada caractere à variável comando a cada iteração
        for(int i = 0; i < input.length(); i++){
            char comando = input.charAt(i)

            // Verifica estado do portao, se aberto (5) true, se fechado (0) false
            portao.check()

            // Portão fechado e não pausado
            if(!portao.aberto && !portao.pause){
                portao.abrindoPortao(comando, saida)

            // Portão aberto e não pausado
            } else if(portao.aberto && !portao.pause){
                portao.fechandoPortao(comando, saida)

            } else if(portao.pause){
                portao.portaoPausado(comando, saida)
            }

        }

        return portao.output(saida)

    }

}
