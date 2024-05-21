# <a href="https://ibb.co/3rNCHC2"><img src="https://i.ibb.co/K0qrHrd/1711738799650.jpg" alt="1711738799650" border="0" height="70" width="180"></a> Sequencia Logica - Intensivo Java

#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)

## Exercícios - Sequencia Logica - Intensivo Java
1 - Algoritmo Palpite<br>
```
Início
   |
   v
Inicializar numeroSecreto (1 a 100)
   |
   v
Inicializar tentativa = 0
   |
   v
Exibir "Tente adivinhar o número entre 1 e 100"
   |
   v
+------[ while palpite != numeroSecreto ]-------+
|                                               |
| Exibir "Digite seu palpite"                   |
|     |                                         |
|     v                                         |
| Ler palpite                                   |
|     |                                         |
|     v                                         |
| Incrementar tentativa                         |
|     |                                         |
|     v                                         |
| palpite < numeroSecreto ?                     |
|     |            |                            |
|     +---- Sim    +---- Não                    |
|     |            |                            |
|     v            |                            |
| Exibir "Muito    |                            |
| baixo!"          | palpite > numeroSecreto ?  |
|                  |     |                      |
|                  |     +---- Sim              |
|                  |     |                      |
|                  |     v                      |
|                  | Exibir "Muito alto!"       |
|                  |     |                      |
|                  |     +---- Não              |
|                  |     |                      |
|                  |     v                      |
|                  | Exibir "Parabéns! Você     |
|                  | adivinhou em " + tentativa |
|                  | + " tentativas"            |
+-----------------------------------------------+
   |
   v
  Fim
```
<br>
2 - Algoritmo Calculadora<br><br>

```
Início
   |
   v
Exibir "Digite o primeiro número"
   |
   v
Ler num1
   |
   v
Exibir "Digite o segundo número"
   |
   v
Ler num2
   |
   v
Exibir "Escolha a operação (+, -, *, /)"
   |
   v
Ler operacao
   |
   v
+------------[ operação ]-------------+
|                                     |
| operacao == '+'                     |
|     |                               |
|     v                               |
| Calcular resultado = num1 + num2    |
|                                     |
| operacao == '-'                     |
|     |                               |
|     v                               |
| Calcular resultado = num1 - num2    |
|                                     |
| operacao == '*'                     |
|     |                               |
|     v                               |
| Calcular resultado = num1 * num2    |
|                                     |
| operacao == '/'                     |
|     |                               |
|     v                               |
| num2 == 0 ?                         |
|     |                               |
|     +---- Sim ----> Exibir "Divisão |
|     |              por zero não é   |
|     |              permitida."      |
|     |                               |
|     +---- Não ----> Calcular        |
|                    resultado = num1 |
|                    / num2           |
|                                     |
| operacao inválida                   |
|     |                               |
|     v                               |
| Exibir "Operação inválida"          |
+-------------------------------------+
   |
   v
Exibir "O resultado é: " + resultado
   |
   v
Fim
```

<br>

