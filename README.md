## BUILD - Linguagem para Instruções de Montagem

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

**Autores**: Jorge Pires e Giullio Gerolamo

**Disciplina**: Construção de Compiladores

**Professor**: Daniel Lucrédio  

**Última revisão**: Setembro/2024  


## Descrição
BUILD é uma linguagem declarativa projetada para descrever manuais de instruções de montagem de produtos, como móveis e outros itens. A linguagem permite que os usuários escrevam as etapas de montagem de maneira estruturada e clara. O compilador da BUILD gera uma página HTML que pode ser utilizada como manual de instruções, completa com texto, imagens e descrições detalhadas.

- **Vídeo demonstrativo:** [*Assista agora*](https://youtu.be/yZWQsxYmqrI)

## Estrutura da Linguagem
A linguagem BUILD é composta por blocos e comandos que descrevem uma montagem, incluindo as seguintes seções principais:

1. **Nome**: Nome da montagem.
2. **Imagem**: Caminho opcional para uma imagem ilustrativa do produto.
3. **Tempo**: Tempo estimado para concluir a montagem, com unidades como horas, minutos ou segundos.
4. **Componentes**: Lista de componentes e materiais necessários.
5. **Passos**: Conjunto de comandos que detalham as etapas de montagem, como aparafusar, ajustar, colar, entre outros.

### Exemplo de Código

```build
montagem
  Nome: "Montagem de uma Cadeira"
  Imagem: "path/to/image/chair.jpg"
  Tempo: 1 hora 30 min

  Componentes:
    4x Parafuso
    1x Encosto
    1x Assento
    4x Pé de cadeira
  fim_componentes

  Passo:
    aparafuse(Encosto)
    cole(Assento, Pé de cadeira)
    ajuste(Pé de cadeira, perpendicular)
  fim_passo
fim_montagem
```

## Análises Semânticas

O compilador da linguagem BUILD realiza quatro verificações semânticas importantes:

1. **Verificação de Declaração de Peça**: O compilador verifica se todas as peças utilizadas nas instruções foram declaradas anteriormente na seção `Componentes`. Se uma peça não foi declarada, um erro semântico é gerado.
2. **Verificação de Duplicidade de Peça**: O compilador garante que cada peça seja declarada apenas uma vez na seção `Componentes`. Se uma peça for declarada mais de uma vez, um erro semântico é gerado.
3. **Verificação de Uso de Cola**: O comando `cole()` só pode ser utilizado se o componente "Cola" tiver sido previamente declarado na lista de componentes. Se não houver cola, um erro semântico é emitido.
4. **Verificação de Uso de Parafuso**: O comando `aparafuse()` só pode ser utilizado se o componente "Parafuso" tiver sido declarado. Caso contrário, um erro semântico é gerado.

## Funcionalidades

- **Comandos**: A linguagem BUILD suporta comandos como `aparafuse`, `cole`, `ajuste`, entre outros, para descrever as etapas detalhadas da montagem.
- **Verificações Semânticas**: As verificações garantem que as instruções de montagem sejam consistentes, usando apenas os componentes declarados corretamente.
- **Geração de Página HTML**: O compilador da BUILD gera uma página HTML que serve como manual de instruções visual, contendo os componentes, passos e imagens da montagem.
- **(*NOVIDADE*)** **Geração de Arquivo TXT com os erros**: O compilador da BUILD gera um arquivo TXT que serve como registro dos erros identificados. 

## Como Executar

Para compilar e executar o compilador BUILD, siga os passos abaixo:

1. Entre no diretório do projeto:
   ```bash
   cd build
   ```

2. Compile o projeto:
   ```bash
   mvn clean compile
   ```

3. Empacote o projeto:
   ```bash
   mvn package
   ```

4. Execute o compilador com um arquivo de entrada e defina o arquivo de saída:
   ```bash
   java -jar target/build-1.0-SNAPSHOT-jar-with-dependencies.jar path/entrada.txt saida/saida.html
   ```

O arquivo de entrada deve conter as instruções de montagem em formato BUILD, e o compilador gerará uma página HTML com o manual completo.

## Casos de Teste

Os casos de teste já criados podem ser acessados dentro do diretório `build/casos-de-teste/`. Atualmente, estão disponíveis quatro casos de teste:

1. **cadeira.txt**: Um exemplo de montagem de uma cadeira, com todos os componentes e etapas de montagem.
2. **erro_lexico**: Teste que provoca um erro léxico no código BUILD, verificando a robustez do analisador léxico.
3. **erro_semantico**: Teste que provoca um erro semântico, como o uso de uma peça não declarada ou duplicidade na declaração de componentes.
4. **quarto.txt**: Um exemplo de montagem de móveis para um quarto, com componentes múltiplos e várias etapas.

Estes casos de teste podem ser utilizados para validar a funcionalidade do compilador e a correta geração do HTML.

## Geração de HTML

A linguagem BUILD converte as instruções em uma página HTML organizada. Essa página inclui:
- O nome da montagem;
- Uma imagem ilustrativa (se fornecida);
- A lista de componentes necessários;
- Instruções passo a passo para montagem;
- O tempo estimado para conclusão.

## Conclusão

BUILD é uma linguagem poderosa e simples para criar manuais de instrução para montagens de produtos. Com verificações semânticas integradas e geração automática de HTML, BUILD facilita a criação de manuais claros e visuais para o usuário final.
