# Sistema de Gerenciamento de Livros

Sistema simples desenvolvido em Java utilizando JDBC e MySQL para gerenciar livros cadastrados.

## Funcionalidades
- Cadastro de livros (título, autor, editora, ano)
- Listagem de livros
- Atualização de informações
- Remoção de registros

## Tecnologias
- Java
- MySQL
- JDBC

## Como Executar
1. Execute o script `script.sql` no seu MySQL.
2. Altere as credenciais no arquivo `Conexao.java`.
3. Compile e execute o `Main.java`.

## Estrutura
- `model/`: Classe Livro
- `dao/`: Classe LivroDAO com os métodos CRUD
- `util/`: Conexão com banco
- `Main.java`: Menu de operação no terminal

## Autor
Gustavo Blazechi
