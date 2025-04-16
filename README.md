# Design e Arquitetura de Software 1

## Repositório dos alunos
- [Repos](https://gist.github.com/26a5ba60be98841ed8c3a3c17afadece.git)

## Configuração do GIT
```
git config --global user.name "NOME DO USUARIO NO GITHUB"
git config --global user.email "EMAIL DA CONTA DO GITHUB"
```

## Aula 26/02/2025
[Livro Eng Soft Moderna - Cap 7](https://engsoftmoderna.info/cap7.html)
- Interfaces
- Pacotes
- Componentes
- Módulos
- Camadas
- Serviços

Monolito
- Repositório único de codigo
- Uso de uma única tecnologia padrão
- Compilado, testado, único pacote
- Deploy como um único sistema
- Executado como um único processo no sistema operacional
- Único banco de dados

## Aula 05/03/2025
- Padrão arquitetural = solução para um problema específico
  - MVC - separa as responsabilidades (Model(dados) - View(tela) - Control(comportamento))
- Estilo arquitetura = organização do projeto

- Arquitetura em camadas
  - Divisão de responsabilidade
  - Performance
  - Segurança
  - Manutenibilidade
  - Camada de apresentação
    - Requisitos próprios
  - Camada de lógica de negócio (aplicação)
    - local central para definição e atualização das regras
    - escalar o backend suportar as requisições
  - Camada de persistência
    - Banco de dados relacional - consolidada
    - Resolve problemas de concorrência
    - Permite compartilhamento de dados
    
## Aula 06/03/2025
- [Who Needs an Architect?](https://martinfowler.com/ieeeSoftware/whoNeedsArchitect.pdf)
- O que é arquitetura?
- Qual o comportamento do arquiteto da "Matrix"?
- Qual o comportamento do arquiteto ideal?

## Aula 12/03/2025
- F

## Aula 13/03/2025
[Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2%5B%3Bvnd.vst.idref%3Dcover%5D!/4/2/2%4051:2)

- [Pensamento Arquitetônico](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/22%5B%3Bvnd.vst.idref%3Dcap2.xhtml%5D!/4)


## Aula 19/03/2025
- Trade-offs
- Tópicos
- Filas
- Fan out

## Aula 02/04/2025
- Trabalho sobre tópicos (CHAT)

## Aula 03/04/2025
- [Filas](https://learn.microsoft.com/en-us/azure/service-bus-messaging/service-bus-queues-topics-subscriptions)

## Aula 09/04/2024
- [Características Arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26%5B%3Bvnd.vst.idref%3Dcap4.xhtml%5D!/4)

## Aula 16/04/2024
- [Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4)
