# Aprimorar o Controlador de Portão de Garagem

> O uso de uma classe Teste facilitou o desenvolvimento do código, tornando mais claro o desenvolvimento da lógica e tornando prática e fácil a sua organização (colocando BDD e TDD).

## Comandos de entrada:

- A entrada do programa será uma String em que cada caractere representa o
evento ocorrido em um segundo, sendo os seguintes possíveis caracteres:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**‘.’**  nenhum evento<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**‘P’** botão pressionado<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**‘O’** Obstáculo detectado<br>

> Por exemplo, ‘..P....’ significa que nada aconteceu por 2 segundos, então o
O botão foi pressionado, o portão começou a se mover e não houve nenhum outro evento a seguir.

## Resultados a serem apresentados na Saída:

A saída do programa será uma string onde cada caractere representa a posição da porta em cada segundo do movimento, a regra é a seguinte:

- Uma contagem no intervalo 0 a 5:

<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **0** significa totalmente fechada;
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **5** totalmente aberta.

- A porta começa a se mover assim que o botão é acionado.
* Exemplo: 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Entrada: **‘..P...O.....’**
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Saída: **‘001234555555’**

> Criado por: Lauis de Oliveira
