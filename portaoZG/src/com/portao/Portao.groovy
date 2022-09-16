package com.portao

class Portao {
    int status = 0
    boolean pause = false
    boolean aberto = false
    boolean abrindo = false
    boolean fechando = false

    // Verifica estado do portão
    void check(){
        this.aberto = (this.status == 5)?true:this.aberto
        this.aberto = (this.status == 0)?false:this.aberto
    }

    // As funções verificam as entradas e colocam na lista as saídas esperadas

    void abrindoPortao(char comando, def saida){

        if ((comando == '.' || comando == 'O') && !this.abrindo) {
            saida.add(this.status)

        } else if((comando == '.' || comando == 'O')  && this.abrindo){
            saida.add(++this.status)

        } else if(comando == 'P' && this.abrindo){
            saida.add(this.status)
            this.pause = true

        } else if(comando == 'P'){
            saida.add(++this.status)
            this.abrindo = true
        }

    }

    void fechandoPortao(char comando, def saida){

        if ((comando == '.' || comando == 'O') && !this.fechando) {
            saida.add(this.status)

        } else if(comando == '.' && this.fechando){
            saida.add(--this.status)

        } else if(comando == 'O' && this.fechando){
            saida.add(++this.status)
            this.fechando = false
            this.abrindo = true
            this.aberto = false

        } else if(comando == 'P' && this.fechando){
            saida.add(this.status)
            this.pause = true

        } else if(comando == 'P'){
            saida.add(--this.status)
            this.fechando = true
            this.abrindo = false
        }

    }

    void portaoPausado(char comando, def saida){
        if(comando != 'P'){
            saida.add(this.status)
        } else if(this.abrindo && comando == 'P'){
            saida.add(++this.status)
            this.pause = false
        } else if(this.fechando && comando == 'P') {
            saida.add(--this.status)
            this.pause = false
        }
    }

    // Recebe a lista das saídas e retorna String
    String output(ArrayList saida){
        String output = "";
        for(int b; b < saida.size(); b++){
            output += saida.get(b)
        }
        return output
    }

}
