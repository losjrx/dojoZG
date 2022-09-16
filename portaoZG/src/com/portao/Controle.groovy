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
            portao.aberto = (portao.status == 5)?true:portao.aberto
            portao.aberto = (portao.status == 0)?false:portao.aberto

            // Portão fechado e não pausado
            if(!portao.aberto && !portao.pause){

                if ((comando == '.' || comando == 'O') && !portao.abrindo) {
                    saida.add(portao.status)

                } else if((comando == '.' || comando == 'O')  && portao.abrindo){
                    saida.add(++portao.status)

                } else if(comando == 'P' && portao.abrindo){
                    saida.add(portao.status)
                    portao.pause = true

                } else if(comando == 'P'){
                    saida.add(++portao.status)
                    portao.abrindo = true
                }

            // Portão aberto e não pausado
            } else if(portao.aberto && !portao.pause){

                if ((comando == '.' || comando == 'O') && !portao.fechando) {
                    saida.add(portao.status)

                } else if(comando == '.' && portao.fechando){
                    saida.add(--portao.status)

                } else if(comando == 'O' && portao.fechando){
                    saida.add(++portao.status)
                    portao.fechando = false
                    portao.abrindo = true
                    portao.aberto = false

                } else if(comando == 'P' && portao.fechando){
                    saida.add(portao.status)
                    portao.pause = true

                } else if(comando == 'P'){
                    saida.add(--portao.status)
                    portao.fechando = true
                    portao.abrindo = false
                }

            } else if(portao.pause && comando != 'P'){
                saida.add(portao.status)
            } else if(portao.pause && portao.abrindo && comando == 'P'){
                saida.add(++portao.status)
                portao.pause = false
            } else if(portao.pause && portao.fechando && comando == 'P') {
                saida.add(--portao.status)
                portao.pause = false
            }
        }

        String output = "";
        for(int b; b < saida.size(); b++){
            output += saida.get(b)
        }
        return output
    }

}
