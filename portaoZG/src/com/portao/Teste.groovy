package com.portao

class Teste {
    static void main(String[] args) {
        println Controle.execute("..P...O.....").equals("001234555555");
        println Controle.execute(".P....").equals("012345");
        println Controle.execute("...P.P...P..").equals("000122222345");
        println Controle.execute("P..O..").equals("123455");
        println Controle.execute("P..P...PO...").equals("123333345555");
        println Controle.execute("P...O.O.P...P..").equals("123455554321111");
        println Controle.execute("P.....P.P..P...").equals("123455433332100");
        println Controle.execute("P.....P..O....").equals("12345543234555");
        println Controle.execute("P.......P...O...OP.O.").equals("123455554321234554345");
    }
}
