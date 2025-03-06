# Design e Arquitetura de Software 1

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
    
